package com.yusufpapurcu.waifumail.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class WaifuDTOResponse {
    @JsonProperty("images")
    public ArrayList<WaifuDTOImage> getImages() {
        return this.waifuDTOImages; }
    public void setImages(ArrayList<WaifuDTOImage> waifuDTOImages) {
        this.waifuDTOImages = waifuDTOImages; }
    ArrayList<WaifuDTOImage> waifuDTOImages;
}

