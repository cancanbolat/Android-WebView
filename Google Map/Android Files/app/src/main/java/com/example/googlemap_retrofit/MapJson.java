package com.example.googlemap_retrofit;

public class MapJson {
    private String title;
    private Float lat;
    private Float lot;

    @Override
    public String toString() {
        return "MapJson{" +
                "title='" + title + '\'' +
                ", lat=" + lat +
                ", lot=" + lot +
                '}';
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLot() {
        return lot;
    }

    public void setLot(Float lot) {
        this.lot = lot;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
