package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Gallery {
	@JsonProperty("data")
	public Data[] data;
}
