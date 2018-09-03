package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

  @Autowired
  private ImageService imageService;

  @GetMapping("image/{id}")
  public Image getImage(@PathVariable("id") String id) {
    //LOGGER.info("getImage called for id {}", id);
    return imageService.getImage(id);
  }

}
