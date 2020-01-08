package com.example.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.transition.Transition;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapter.SongAdapter;
import com.example.myapplication.models.Singer;
import com.example.myapplication.models.Song;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    ImageView mHeaderImageView;
    Singer singer;
    RecyclerView recyclerView;
    TextView title,discription;
    public static final String EXTRA_PARAM_ID = "detail:_id";

    public static final String VIEW_NAME_HEADER_IMAGE = "detail:header:image";
    public static final String VIEW_NAME_HEADER_TITLE = "detail:header:title";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        mHeaderImageView = findViewById(R.id.imageview_header);
        singer = Singer.getSong(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));
        recyclerView=findViewById(R.id.recyclerview);
        title=findViewById(R.id.title);
        discription=findViewById(R.id.discription);

        ViewCompat.setTransitionName(mHeaderImageView, VIEW_NAME_HEADER_IMAGE);
        title.setText(singer.getTitle());
        discription.setText(singer.getSubtitle());


        loadItem();
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        SongAdapter songAdapter = new SongAdapter();
        recyclerView.setAdapter(songAdapter);
        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(DetailsActivity.this, resId);
        recyclerView.setLayoutAnimation(animation);
        List<Song> songs = new ArrayList<>();
        for (Song song : singer.getSongs()){
            songs.add(song);
        }
        songAdapter.submitList(songs);
        songAdapter.notifyDataSetChanged();
    }

    private void loadItem() {


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && addTransitionListener()) {
            loadThumbnail();
        } else {
            loadFullSizeImage();
        }
    }


    private void loadThumbnail() {
        Picasso.with(mHeaderImageView.getContext())
                .load(singer.getImage())
                .noFade()
                .into(mHeaderImageView);
    }

    private void loadFullSizeImage() {
        Picasso.with(mHeaderImageView.getContext())
                .load(singer.getImage())
                .noFade()
                .noPlaceholder()
                .into(mHeaderImageView);
    }

    @RequiresApi(21)
    private boolean addTransitionListener() {
        final Transition transition = getWindow().getSharedElementEnterTransition();

        if (transition != null) {
            transition.addListener(new Transition.TransitionListener() {
                @Override
                public void onTransitionEnd(Transition transition) {
                    loadFullSizeImage();

                    transition.removeListener(this);
                }

                @Override
                public void onTransitionStart(Transition transition) {
                }

                @Override
                public void onTransitionCancel(Transition transition) {
                    transition.removeListener(this);
                }

                @Override
                public void onTransitionPause(Transition transition) {
                }

                @Override
                public void onTransitionResume(Transition transition) {
                    // No-op
                }
            });
            return true;
        }

        return false;
    }
}
