package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Data {
  //@JsonIgnoreProperties(ignoreUnknown = true)
 
	@JsonProperty("id")
	public String id;	
	@JsonProperty("title")
	public String title;	
	@JsonProperty("tags")
	public Tag[] tags;	
	@JsonProperty("images")
	public Images[] images;

	

}
