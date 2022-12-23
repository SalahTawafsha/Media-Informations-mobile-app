package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FilmDetails extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.film_details);

        // local variables since it used just here
        ImageView image = findViewById(R.id.media_image);
        TextView name = findViewById(R.id.media_name);
        TextView year = findViewById(R.id.media_year);
        TextView stars = findViewById(R.id.film_stars);
        TextView description = findViewById(R.id.film_descriptions);

        Film f = Film.list[Integer.parseInt(getIntent().getData().toString())];
        image.setImageResource(f.getImageID());
        name.setText(f.getName());
        year.setText(String.valueOf(f.getYear()));
        stars.setText(getStars(f.getStars()));
        description.setText(String.valueOf(f.getDescription()));


    }

    private String getStars(String[] stars) {
        StringBuilder s = new StringBuilder();
        for (String star : stars)
            s.append(star).append(", ");

        s.delete(s.length() - 3, s.length());

        return s.toString();
    }
}