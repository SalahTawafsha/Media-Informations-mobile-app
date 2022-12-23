package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FilmDetails extends AppCompatActivity {
    private ImageView image;
    private TextView name;
    private TextView year;
    private TextView stars;
    private TextView description;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.film_details);

        image = findViewById(R.id.media_image);
        name = findViewById(R.id.media_name);
        year = findViewById(R.id.media_year);
        stars = findViewById(R.id.film_stars);
        description = findViewById(R.id.film_descriptions);

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