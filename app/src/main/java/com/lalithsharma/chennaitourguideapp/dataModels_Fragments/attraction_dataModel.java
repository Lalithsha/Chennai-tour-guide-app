package com.lalithsharma.chennaitourguideapp.dataModels_Fragments;

public class attraction_dataModel {

    int image ;
    String header, address;

    public attraction_dataModel(int image, String header, String address) {
        this.image = image;
        this.header = header;
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
