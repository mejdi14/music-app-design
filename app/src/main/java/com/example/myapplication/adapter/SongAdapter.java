package com.example.myapplication.adapter;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.myapplication.R;
import com.example.myapplication.models.Song;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ListAdapter<Song, SongAdapter.NoteHolder> {
    private SongAdapter.OnItemClickListener listener;
    private List<Song> singers = new ArrayList<>();
    Bitmap ImageBit;
    float ImageRadius = 40.0f;
    int previousPosition=-1;
    public SongAdapter() {
        super(DIFF_CALLBACK);
    }

    private static final DiffUtil.ItemCallback<Song> DIFF_CALLBACK = new DiffUtil.ItemCallback<Song>() {
        @Override
        public boolean areItemsTheSame(Song oldItem, Song newItem) {
            return true;
        }

        @Override
        public boolean areContentsTheSame(Song oldItem, Song newItem) {
            return true;
        }
    };
    @NonNull

    public SongAdapter.NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.song_list_item, parent, false);
        return new SongAdapter.NoteHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final SongAdapter.NoteHolder holder, final int position) {
        final Song currentSong = getItem(position);
        holder.title.setText(currentSong.getName());
        holder.discription.setText(currentSong.getAlbum());
        holder.number.setText(currentSong.getNumber());
        holder.time.setText(currentSong.getTime());

        holder.parentFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (currentSong.isPlaying()){
                    currentSong.setPlaying(false);
                    holder.number.setVisibility(View.VISIBLE);
                    turnOffAnimation(holder.animation_view);
                }
                else{
                    currentSong.setPlaying(true);
                    holder.number.setVisibility(View.GONE);
                    turnOnAnimation(holder.animation_view);

                }
                if (previousPosition!=-1 && previousPosition!=position){
                    getItem(previousPosition).setPlaying(false);
                notifyItemChanged(previousPosition);
                SongAdapter.this.notifyAll();
                }
                previousPosition=position;
            }
        });


    }

    private void turnOnAnimation(LottieAnimationView animation_view) {
        animation_view.setVisibility(View.VISIBLE);
        animation_view.playAnimation();
        animation_view.loop(true);
    }

    private void turnOffAnimation(LottieAnimationView animation_view) {
        animation_view.setVisibility(View.GONE);
        animation_view.pauseAnimation();
        animation_view.loop(false);
    }


    public Song getNoteAt(int position) {
        return getItem(position);
    }



    class NoteHolder extends RecyclerView.ViewHolder {
        private LottieAnimationView animation_view;
        private TextView title;
        private TextView discription;
        private TextView number;
        private TextView time;
        private ConstraintLayout parentFrame;

        public NoteHolder(final View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            discription = itemView.findViewById(R.id.discription);
            number = itemView.findViewById(R.id.number);
            time = itemView.findViewById(R.id.time);
            parentFrame = itemView.findViewById(R.id.parentFrame);
            animation_view = itemView.findViewById(R.id.animation_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (listener != null && position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(getItem(position),itemView);
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Song note, View view);
    }

    public void setOnItemClickListener(SongAdapter.OnItemClickListener listener) {
        this.listener = listener;
    }
}