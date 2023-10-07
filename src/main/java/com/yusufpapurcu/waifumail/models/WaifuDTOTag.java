package com.yusufpapurcu.waifumail.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WaifuDTOTag {
    @JsonProperty("tag_id")
    public int getTag_id() {
        return this.tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    int tag_id;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;

    @JsonProperty("is_nsfw")
    public boolean getIs_nsfw() {
        return this.is_nsfw;
    }

    public void setIs_nsfw(boolean is_nsfw) {
        this.is_nsfw = is_nsfw;
    }

    boolean is_nsfw;
}
