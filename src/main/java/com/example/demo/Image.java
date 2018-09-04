package com.example.demo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Image implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  @JsonIgnoreProperties(ignoreUnknown = true)
	@JsonProperty("id")
	public String id;
	@JsonProperty("link")
	public String link;
	@JsonProperty("mp4")
	public String mp4;
	@JsonProperty("gifv")
	public String gifv;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }
  public String getMp4() {
    return mp4;
  }
  public void setMp4(String mp4) {
    this.mp4 = mp4;
  }
  public String getGifv() {
    return gifv;
  }
  public void setGifv(String gifv) {
    this.gifv = gifv;
  }
  @Override
  public String toString() {
    return "Images [id=" + id + ", link=" + link + ", mp4=" + mp4 + ", gifv=" + gifv + "]";
  }
	
	
}
