package com.example.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.transition.Transition;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import com.example.myapplication.models.Song;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    ImageView mHeaderImageView;
    Song song;
    public static final String EXTRA_PARAM_ID = "detail:_id";

    public static final String VIEW_NAME_HEADER_IMAGE = "detail:header:image";
    public static final String VIEW_NAME_HEADER_TITLE = "detail:header:title";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        mHeaderImageView = findViewById(R.id.imageview_header);
        song = Song.getSong(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));
        ViewCompat.setTransitionName(mHeaderImageView, VIEW_NAME_HEADER_IMAGE);


        loadItem();
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
                .load(song.getImage())
                .noFade()
                .into(mHeaderImageView);
    }

    private void loadFullSizeImage() {
        Picasso.with(mHeaderImageView.getContext())
                .load(song.getImage())
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
