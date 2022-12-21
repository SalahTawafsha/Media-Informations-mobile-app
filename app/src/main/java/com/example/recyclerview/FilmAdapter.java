package com.example.recyclerview;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.net.URI;

public class FilmAdapter
        extends RecyclerView.Adapter<FilmAdapter.ViewHolder> {

    private Film[] films;

    public FilmAdapter(Film[] films) {
        this.films = films;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.film_card,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;

        ImageView imageView = cardView.findViewById(R.id.film_image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), films[position].getImageID());
        imageView.setImageDrawable(dr);

        TextView name = cardView.findViewById(R.id.film_name);
        name.setText(films[position].getName());

        TextView year = cardView.findViewById(R.id.film_year);
        year.setText(String.valueOf(films[position].getYear()));


        cardView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), Details.class);
            intent.setData(Uri.parse(films[position].getImageID() + ""));
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return films.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }

    }
}