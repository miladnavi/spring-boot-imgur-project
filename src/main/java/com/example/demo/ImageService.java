package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImageService {
  // Imgur data
  private static final String CLIENT_ID = "bd18b0897a362ee";

  // Request URI
  private static final String IMGUR_GALLERY_URI = "https://api.imgur.com/3/gallery/hot/viral/all/1?showViral=true&mature=false&album_previews=false";

  // public
  private int gallery_counter = 0;
  private int image_counter = 0;
  private boolean is_id = false;

  private static final Logger LOGGER = LoggerFactory.getLogger(ImageService.class);

  @Cacheable("image")
  public Image getImage(String id) {
    LOGGER.info("getImage called for id {}", id);

    // Make request to Imgur
    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    headers.add("Authorization", "Client-ID " + CLIENT_ID);
    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
    ResponseEntity<Gallery> response = restTemplate.exchange(IMGUR_GALLERY_URI, HttpMethod.GET, entity, Gallery.class);

    while (response.getBody().data.length > gallery_counter) {
      while (response.getBody().data[gallery_counter].images.length > image_counter) {
        if (response.getBody().data[gallery_counter].images[image_counter].id.equals(id)) {
          is_id = true;
          break;
        }
        else {
          is_id = false;
          image_counter++;
        }
      }
      if (is_id) {
        break;
      }
      else {
        gallery_counter++;
      }
    }
    return new Image(id, response.getBody().data[gallery_counter].images[image_counter].link,
        response.getBody().data[gallery_counter].images[image_counter].mp4,
        response.getBody().data[gallery_counter].images[image_counter].gifv);
  }
}
