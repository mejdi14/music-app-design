package com.example.myapplication.models;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Singer {
    private int number;
    private String title;
    private String subtitle;
    private int image;
    private List<Song> songs;
    public static Singer[] ITEMS = new Singer[] {
            new Singer(1,"taylor swift ","Pop singer", R.drawable.original,
                    new ArrayList<Song>(Arrays.asList(
                            new Song("01","Afterglow","Lover","3:53"),
                            new Song("02","A Place in This World","Red","3:57"),
                            new Song("03","Back to December","Reputation","3:10"),
                            new Song("04","Bad Blood","Lover","3:22"),
                            new Song("05","Blank Space","Red","3:22"),
                            new Song("06","Cold As You","1989","3:56"),
                            new Song("07","Come In With The Rain","Speak now","3:30"),
                            new Song("08","Everything Has Changed","Reputation","3:44"),
                            new Song("09","Holy Ground","Reputation","3:49")
                            ))),
            new Singer(2,"Paramore","Pop singer",R.drawable.hayley,
                    new ArrayList<Song>(Arrays.asList(
                            new Song("01","Ain't It Fun","Paramore","3:49"),
                            new Song("01","All I Wanted","Brand New Eyes","3:13"),
                            new Song("01","All We Know","All We Know Is Falling","3:19"),
                            new Song("01","Anklebiters","Paramore","3:45"),
                            new Song("01","Be Alone","Paramore","3:25"),
                            new Song("01","Born for This","Riot!","3:55"),
                            new Song("01","Brick by Boring Brick","Brand New Eyes","3:33"),
                            new Song("01","Brighter","All We Know Is Falling","3:34"),
                            new Song("01","Conspiracy","Brand New Eyes","3:20"),
                            new Song("01","Decode","After Laughter","3:48")
                            ))),
            new Singer(3,"Tame impala ","Pop singer",R.drawable.impala,
                    new ArrayList<Song>(Arrays.asList(
                            new Song("01","Big City Lights","The Lovemore EP","3:49"),
                            new Song("02","Tonight","Keep Your Dreams","3:14"),
                            new Song("03","When I See You Again","Uptown Special","3:28"),
                            new Song("04","Children of the Moon","Aydin EP","3:21"),
                            new Song("05","That's All for Everyone","Aydin EP","3:49"),
                            new Song("06","Aydin","The Flaming Lips and Heady Fwends","3:44"),
                            new Song("07","Backwards","Rogue Waves","3:16"),
                            new Song("08","Summer Breaking","The Flaming Lips and Heady Fwends","3:19"),
                            new Song("09","affodils","Aydin EP","3:11"),
                            new Song("10","Leaving Los Feliz","Uptown Special","3:28"),
                            new Song("11","My life","Rogue Waves","3:53")
                            ))),
            new Singer(4,"The xx","Pop singer",R.drawable.thexx,
                    new ArrayList<Song>(Arrays.asList(
                            new Song("01","Unfold","I see you","3:56"),
                            new Song("01","Our Song","xx","3:52"),
                            new Song("01","Missing","xx","3:17"),
                            new Song("01","Basic Space","I see you","3:26"),
                            new Song("01","Stars","Coexist","3:46"),
                            new Song("01","Fantasy","Coexist","3:48"),
                            new Song("01","Infinity","I see you","3:41"),
                            new Song("01","On Hold","xx","3:31"),
                            new Song("01","VCR","I see you","3:35")
                            ))),
            new Singer(5,"Trash","Youtube channel",R.drawable.trash,
                    new ArrayList<Song>(Arrays.asList(
                            new Song("01","Ghostemane","Mercury","3:44"),
                            new Song("01","Joji","worldstar money","3:49"),
                            new Song("01","XXXTENTACION","Fu*k love","3:28"),
                            new Song("01","BURGOS","Lost cause","3:21"),
                            new Song("01","Santos santana","Man down","3:11"),
                            new Song("01","Lil peep","Star shopping","3:10"),
                            new Song("01","Ouija macc","Body drop","3:09"),
                            new Song("01","YUNG BILIAL","SPINE","3:01"),
                            new Song("01","XXXTENTACION","kILL ME","3:55"),
                            new Song("01","BERSERK","ALONE","3:53")
                            ))),
            new Singer(6,"Eminem","Rap singer",R.drawable.eminem,
                    new ArrayList<Song>(Arrays.asList(
                            new Song("01","The Ringer","Kamikaze","3:31"),
                            new Song("01","Walk On Water","Revival","3:28"),
                            new Song("01","Untouchable","Revival","3:29"),
                            new Song("01","Bad Guy","The Marshall Mathers LP 2","3:21"),
                            new Song("01","Rap God","The Marshall Mathers LP 2","3:01"),
                            new Song("01","The Monster","The Marshall Mathers LP 2","3:09"),
                            new Song("01","Cold Wind Blows","Recovery ","3:44"),
                            new Song("01","On Fire","Recovery ","3:48"),
                            new Song("01","Space Bound","Recovery ","3:49"),
                            new Song("01","Cinderella Man","Recovery ","3:26"),
                            new Song("01","Love the Way You Lie","Recovery ","3:21")
                            ))),
            new Singer(7,"Melanie martinez","Pop singer",R.drawable.melanie,
                    new ArrayList<Song>(Arrays.asList(
                            new Song("01","Alphabet Boy","Cry Baby","3:09"),
                            new Song("02","Bittersweet Tragedy","ollhouse - EP","3:04"),
                            new Song("03","Cake","Cry Baby","3:28"),
                            new Song("04","Carousel","K-12","3:33"),
                            new Song("05","Class Fight","Dollhouse - EP","3:55"),
                            new Song("06","Cry Baby","Cry Baby","3:59"),
                            new Song("07","Dead to Me","Cry Baby","3:14"),
                            new Song("08","Detention","Dollhouse - EP","3:15"),
                            new Song("09","Dollhouse","K-12","3:19"),
                            new Song("10","Drama Club","Dollhouse - EP","3:06"),
                            new Song("11","Gingerbread Man","K-12","3:04")
                            ))),
            new Singer(8,"Wallows","Pop singer ",R.drawable.wallows,
                    new ArrayList<Song>(Arrays.asList(
                            new Song("01","Pleaser","Spring","3:05"),
                            new Song("02","Sun Tan","Spring","3:22"),
                            new Song("03","Are You Bored Yet?","Nothing Happens","3:22"),
                            new Song("04","These Days","Spring","3:36"),
                            new Song("05","Scrawny","Nothing Happens","3:45"),
                            new Song("06","Sidelines","Non-album singles","3:43"),
                            new Song("07","Trust Fall","Spring","3:13"),
                            new Song("08","Drunk on Halloween","Non-album singles","3:05")
                            ))),
    };

    public Singer(int number, String title, String subtitle, int image,List<Song> songs ) {
        this.number = number;
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.songs=songs;
    }

    public static Singer getSong(int number) {
        for (Singer item : ITEMS) {
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

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", image=" + image +
                '}';
    }
}
