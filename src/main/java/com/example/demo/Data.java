package com.example.demo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.micrometer.core.lang.Nullable;

public class Data {
  @JsonIgnoreProperties(ignoreUnknown = true)
  @JsonProperty("id")
  public String id;
  @JsonProperty("title")
  public String title; 
  @JsonProperty("images")
  public ArrayList<Images> images;
}
