package com.example.myapplication;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapter.ImageAdapter;
import com.example.myapplication.models.Song;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView imageRecyclerview;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.search_bar);
        setUpSearchViewDesign();

        imageRecyclerview = findViewById(R.id.recyclerview);
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        imageRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        imageRecyclerview.setHasFixedSize(true);
        ImageAdapter imageAdapter = new ImageAdapter();
        imageRecyclerview.setAdapter(imageAdapter);
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1,"Kavinsky ","Nightcall Drive",R.drawable.image1));
        songs.add(new Song(2,"BEACH HOUSE","MYTH",R.drawable.image3));
        songs.add(new Song(4,"Pink Floyd","Wish You Were Here",R.drawable.head));
        songs.add(new Song(6,"Lykke Li","I Follow Rivers",R.drawable.image2));
        songs.add(new Song(9,"AC/DC","Thunderstruck ",R.drawable.image1));
        songs.add(new Song(3,"Cigarettes After Sex ","Nothing's Gonna Hurt You",R.drawable.image2));
        songs.add(new Song(5,"Lana Del Rey","Born To Die",R.drawable.image1));
        songs.add(new Song(7,"Foster The People","Pumped up Kicks",R.drawable.image3));
        songs.add(new Song(8,"Gorillaz ","DARE ",R.drawable.head));
        imageAdapter.submitList(songs);
        imageAdapter.notifyDataSetChanged();
    }

    private void setUpSearchViewDesign() {


    }
}
