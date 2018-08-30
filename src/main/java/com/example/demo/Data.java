package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	@JsonProperty("id")
	public String id;	
	@JsonProperty("title")
	public String title;	
	@JsonProperty("description")
	public String description;	
	@JsonProperty("dateTime")
	public long datetime;	
	@JsonProperty("cover")
	public String cover;	
	@JsonProperty("cover_Width")
	public int cover_width;	
	@JsonProperty("cover_heigth")
	public int cover_heigth;	
	@JsonProperty("account_url")
	public String account_url;	
	@JsonProperty("account_id")
	public long account_id;	
	@JsonProperty("privacy")
	public String privacy;	
	@JsonProperty("layout")
	public String layout;	
	@JsonProperty("views")
	public long views;	
	@JsonProperty("link")
	public String link;	
	@JsonProperty("ups")
	public int ups;	
	@JsonProperty("downs")
	public int downs;	
	@JsonProperty("points")
	public int points;	
	@JsonProperty("socre")
	public int score;	
	@JsonProperty("is_album")
	public boolean is_album;	
	@JsonProperty("vote")
	public String vote;	
	@JsonProperty("favorite")
	public boolean favorite;	
	@JsonProperty("nsfw")
	public boolean nsfw;	
	@JsonProperty("section")
	public String section;	
	@JsonProperty("comment_count")
	public int comment_count;	
	@JsonProperty("favorite_count")
	public int favorite_count;	
	@JsonProperty("topic")
	public String topic;	
	@JsonProperty("topic_id")
	public String topic_id;	
	@JsonProperty("images_count")
	public int images_count;	
	@JsonProperty("in_gallery")
	public boolean in_gallery;	
	@JsonProperty("is_ad")
	public boolean in_ad;
	@JsonProperty("ad_type")
	public int ad_type;	
	@JsonProperty("ad_url")
	public String ad_url;	
	@JsonProperty("in_most_viral")
	public boolean is_most_viral;	
	@JsonProperty("include_album_ads")
	public boolean include_album_ads;	
	@JsonProperty("tags")
	public Tag[] tags;	
	@JsonProperty("images")
	public Images[] images;

	

}
