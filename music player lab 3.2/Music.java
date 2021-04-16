package com.company;

public class Music {
    String vocalist;
    String name;
    String type;
    String path;
    String year;
    boolean favorite;

    public Music(String name, String vocalistName, String type, String path, String year){
        this.vocalist = vocalistName;
        this.name = name;
        this.type = type;
        this.path = path;
        this.favorite = false;
        this.year = year;
    }

    public String getVocalist() {
        return vocalist;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getType() {
        return type;
    }

    public String getYear() {
        return year;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
