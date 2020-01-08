package com.example.myapplication.models;

public class Song {
    private String number;
    private String name;
    private String album;
    private String time;
    private boolean isPlaying=false;

    public Song(String number,String name, String album, String time) {
        this.name = name;
        this.album = album;
        this.time = time;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", album='" + album + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
