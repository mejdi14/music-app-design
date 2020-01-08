package com.example.myapplication.adapter;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.models.Singer;

import java.util.ArrayList;
import java.util.List;


public class ImageAdapter extends ListAdapter<Singer, ImageAdapter.NoteHolder> {
    private OnItemClickListener listener;
    private List<Singer> singers = new ArrayList<>();
    Bitmap ImageBit;
    float ImageRadius = 40.0f;
    public ImageAdapter() {
        super(DIFF_CALLBACK);
    }

    private static final DiffUtil.ItemCallback<Singer> DIFF_CALLBACK = new DiffUtil.ItemCallback<Singer>() {
        @Override
        public boolean areItemsTheSame(Singer oldItem, Singer newItem) {
            return true;
        }

        @Override
        public boolean areContentsTheSame(Singer oldItem, Singer newItem) {
            return true;
        }
    };
    @NonNull

    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new NoteHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int position) {
        Singer currentSinger = getItem(position);
        holder.title.setText(currentSinger.getTitle());
        holder.discription.setText(currentSinger.getSubtitle());
        holder.number.setText(currentSinger.getNumber()+"");


        holder.image.setImageResource(currentSinger.getImage());
    }




    public Singer getNoteAt(int position) {
        return getItem(position);
    }

  

    class NoteHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView discription;
        private TextView number;
        private ImageView image;

        public NoteHolder(final View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            discription = itemView.findViewById(R.id.discription);
            number = itemView.findViewById(R.id.number);
            image = itemView.findViewById(R.id.imageView);

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
        void onItemClick(Singer note, View view);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}