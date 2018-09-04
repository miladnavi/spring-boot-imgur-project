package com.example.demo;

import java.util.List;
import java.util.Optional;
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
  public Images getImage(String id) {
    LOGGER.info("getImage called for id {}", id);
   
    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    headers.add("Authorization", "Client-ID " + IMGUR_CLIENT_ID);
    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
    ResponseEntity<Gallery> response = restTemplate.exchange(IMGUR_GALLERY_URI, HttpMethod.GET, entity, Gallery.class);

    List<Data> datas = response.getBody().getData().stream().filter(data -> !(data.getImages() == null))
      .collect(Collectors.toList());

    Optional <Data> responseImage = datas.stream()
        .filter(inner -> inner.getImages().stream().anyMatch(image -> id.equals(image.id))).findFirst();
    if(responseImage.isPresent())
      return responseImage.get().getImages().get(0);
    else
      return null;
  }
}
