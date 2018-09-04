package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

  private static final String IMGUR_CLIENT_ID = "bd18b0897a362ee";

  private static final String IMGUR_GALLERY_URI = "https://api.imgur.com/3/gallery/hot/viral/all/1?showViral=true&mature=false&album_previews=false";

  private static final Logger LOGGER = LoggerFactory.getLogger(ImageService.class);

  @Cacheable("image")
  public Image getImage(String id) {
    LOGGER.info("getImage called for id {}", id);

    /*
     *  Make request to Imgur gallery endpoint
     */
    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    headers.add("Authorization", "Client-ID " + IMGUR_CLIENT_ID);
    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
    ResponseEntity<Gallery> response = restTemplate.exchange(IMGUR_GALLERY_URI, HttpMethod.GET, entity, Gallery.class);

    /*
     * Finding image by requested id
     */
    List<Data> datas = response.getBody().data.stream().filter(data -> !(data.images == null))
        .collect(Collectors.toList());
    String link = null;
    String mp4 = null;
    String gifv = null;
    List<Data> responseImage = datas.stream()
        .filter(inner -> inner.images.stream().anyMatch(image -> id.equals(image.id))).collect(Collectors.toList());
    for (Data dat : responseImage) {
      for (Images image : dat.images) {
        link = image.link;
        mp4 = image.mp4;
        gifv = image.gifv;
      }
    }

    return new Image(id, link, mp4, gifv);
  }
}
