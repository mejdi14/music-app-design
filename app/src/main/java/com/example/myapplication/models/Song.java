package com.example.myapplication.models;

import com.example.myapplication.R;

public class Song {
    private int number;
    private String title;
    private String subtitle;
    private int image;
    public static Song[] ITEMS = new Song[] {
            new Song(1,"Kavinsky ","Nightcall Drive", R.drawable.taylors),
            new Song(2,"BEACH HOUSE","MYTH",R.drawable.image3),
            new Song(3,"Cigarettes After Sex ","Nothing's Gonna Hurt You",R.drawable.image2),
            new Song(4,"Pink Floyd","Wish You Were Here",R.drawable.head),
            new Song(5,"Lana Del Rey","Born To Die",R.drawable.image1),
            new Song(6,"Lykke Li","I Follow Rivers",R.drawable.image2),
            new Song(7,"Foster The People","Pumped up Kicks",R.drawable.image3),
            new Song(8,"AC/DC","Thunderstruck ",R.drawable.image1),
    };

    public Song(int number, String title, String subtitle, int image) {
        this.number = number;
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
    }

    public static Song getSong(int number) {
        for (Song item : ITEMS) {
            if (item.getNumber() == number) {
                return item;
            }
        }
        return null;
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
