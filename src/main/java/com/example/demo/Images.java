package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Images {
	@JsonProperty("id")
	public String id;
	@JsonProperty("link")
	public String link;
	@JsonProperty("mp4")
	public String mp4;
	@JsonProperty("gifv")
	public String gifv;
}
