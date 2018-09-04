package com.example.demo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
  @JsonIgnoreProperties(ignoreUnknown = true)
  @JsonProperty("id")
  public String id;
  @JsonProperty("title")
  public String title; 
  @JsonProperty("images")
  public ArrayList<Image> images;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public ArrayList<Image> getImages() {
    return images;
  }
  public void setImages(ArrayList<Image> images) {
    this.images = images;
  }
  
  
}
