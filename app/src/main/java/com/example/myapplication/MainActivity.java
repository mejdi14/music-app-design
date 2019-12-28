package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
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
        for (Song song:Song.ITEMS){
         songs.add(song);
        }
        imageAdapter.submitList(songs);
        imageAdapter.notifyDataSetChanged();

        imageAdapter.setOnItemClickListener(new ImageAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Song note,View view) {

                Log.d("passanger", "onItemClick: ");
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra(DetailsActivity.EXTRA_PARAM_ID, note.getNumber());

                // BEGIN_INCLUDE(start_activity)
                /*
                 * Now create an {@link android.app.ActivityOptions} instance using the
                 * {@link ActivityOptionsCompat#makeSceneTransitionAnimation(Activity, Pair[])} factory
                 * method.
                 */
                @SuppressWarnings("unchecked")
                ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        MainActivity.this,

                        new Pair<>(view.findViewById(R.id.imageView),
                                DetailsActivity.VIEW_NAME_HEADER_IMAGE),
                        new Pair<>(view.findViewById(R.id.title),
                                DetailsActivity.VIEW_NAME_HEADER_TITLE));

                ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
            }
        });
    }

    private void setUpSearchViewDesign() {


    }
}
