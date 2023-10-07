package com.yusufpapurcu.waifumail.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class WaifuDTOImage {
    @JsonProperty("signature")
    public String getSignature() {
        return this.signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    String signature;

    @JsonProperty("extension")
    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    String extension;

    @JsonProperty("image_id")
    public int getImage_id() {
        return this.image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    int image_id;

    @JsonProperty("favorites")
    public int getFavorites() {
        return this.favorites;
    }

    public void setFavorites(int favorites) {
        this.favorites = favorites;
    }

    int favorites;

    @JsonProperty("dominant_color")
    public String getDominant_color() {
        return this.dominant_color;
    }

    public void setDominant_color(String dominant_color) {
        this.dominant_color = dominant_color;
    }

    String dominant_color;

    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    String source;

    @JsonProperty("artist")
    public Object getArtist() {
        return this.artist;
    }

    public void setArtist(Object artist) {
        this.artist = artist;
    }

    Object artist;

    @JsonProperty("uploaded_at")
    public Date getUploaded_at() {
        return this.uploaded_at;
    }

    public void setUploaded_at(Date uploaded_at) {
        this.uploaded_at = uploaded_at;
    }

    Date uploaded_at;

    @JsonProperty("liked_at")
    public Object getLiked_at() {
        return this.liked_at;
    }

    public void setLiked_at(Object liked_at) {
        this.liked_at = liked_at;
    }

    Object liked_at;

    @JsonProperty("is_nsfw")
    public boolean getIs_nsfw() {
        return this.is_nsfw;
    }

    public void setIs_nsfw(boolean is_nsfw) {
        this.is_nsfw = is_nsfw;
    }

    boolean is_nsfw;

    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    int width;

    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int height;

    @JsonProperty("byte_size")
    public int getByte_size() {
        return this.byte_size;
    }

    public void setByte_size(int byte_size) {
        this.byte_size = byte_size;
    }

    int byte_size;

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("preview_url")
    public String getPreview_url() {
        return this.preview_url;
    }

    public void setPreview_url(String preview_url) {
        this.preview_url = preview_url;
    }

    String preview_url;

    @JsonProperty("tags")
    public ArrayList<WaifuDTOTag> getTags() {
        return this.waifuDTOTags;
    }

    public void setTags(ArrayList<WaifuDTOTag> waifuDTOTags) {
        this.waifuDTOTags = waifuDTOTags;
    }

    ArrayList<WaifuDTOTag> waifuDTOTags;
}
