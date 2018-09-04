package com.example.demo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Gallery {
  @JsonIgnoreProperties(ignoreUnknown = true)
  @JsonProperty("data")
  public ArrayList<Data> data;
}
