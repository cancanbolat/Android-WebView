package com.example.volleyjson;

public class MyModel {

    private String title;
    private String artist;
    private String coverImage;
    private String sortUrl;

    public MyModel() {
    }

    public MyModel(String title, String artist, String coverImage, String sortUrl) {
        this.title = title;
        this.artist = artist;
        this.coverImage = coverImage;
        this.sortUrl = sortUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public void setSortUrl(String sortUrl) {
        this.sortUrl = sortUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public String getSortUrl() {
        return sortUrl;
    }
}
