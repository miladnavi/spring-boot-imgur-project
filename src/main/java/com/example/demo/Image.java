package com.example.demo;

import java.io.Serializable;

public class Image implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;
  private String link;
  private String mp4;
  private String gifv;

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

  public Image() {
    super();
  }

  public Image(String id, String link, String mp4, String gifv) {
    this.id = id;
    this.link = link;
    this.mp4 = mp4;
    this.gifv = gifv;
  }

  @Override
  public String toString() {
    return "Image [id=" + id + ", link=" + link + ", mp4=" + mp4 + ", gifv=" + gifv + "]";
  }

}
