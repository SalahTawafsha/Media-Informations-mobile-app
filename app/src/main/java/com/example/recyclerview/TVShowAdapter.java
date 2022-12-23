package com.example.recyclerview;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class TVShowAdapter extends RecyclerView.Adapter<TVShowAdapter.ViewHolder> {

    private TVShow[] TVShows;

    public TVShowAdapter(TVShow[] TVShows) {
        this.TVShows = TVShows;
    }

    @NonNull
    @Override
    public TVShowAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.media_card,
                parent,
                false);

        return new TVShowAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TVShowAdapter.ViewHolder holder, int position) {
        CardView cardView = holder.cardView;

        ImageView imageView = cardView.findViewById(R.id.media_image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), TVShows[position].getImageID());
        imageView.setImageDrawable(dr);

        TextView name = cardView.findViewById(R.id.media_name);
        name.setText(TVShows[position].getName());


        cardView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), TVShowDetails.class);
            intent.setData(Uri.parse(position + ""));
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return TVShows.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }

    }
}