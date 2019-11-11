package com.example.myapplication.models;

public class Song {
    private int number;
    private String title;
    private String subtitle;
    private int image;

    public Song(int number, String title, String subtitle, int image) {
        this.number = number;
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Song{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", image=" + image +
                '}';
    }
}
