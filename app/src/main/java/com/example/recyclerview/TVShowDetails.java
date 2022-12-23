package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TVShowDetails extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tv_show_details);

        // local variables since it used just here
        ImageView image = findViewById(R.id.media_image);
        TextView name = findViewById(R.id.media_name);
        TextView year = findViewById(R.id.media_year);
        TextView stars = findViewById(R.id.film_stars);
        TextView description = findViewById(R.id.film_descriptions);
        TextView numOfEp = findViewById(R.id.count);
        TextView durOfEp = findViewById(R.id.duration);


        TVShow f = TVShow.list[Integer.parseInt(getIntent().getData().toString())];
        image.setImageResource(f.getImageID());
        name.setText(f.getName());
        year.setText(String.valueOf(f.getYear()));
        stars.setText(getStars(f.getStars()));
        description.setText(f.getDescription());
        durOfEp.setText(f.getEpisodeDuration() + " min");
        numOfEp.setText(String.valueOf(f.getNumOfEpisodes()));


    }

    private String getStars(String[] stars) {
        StringBuilder s = new StringBuilder();
        for (String star : stars)
            s.append(star).append(", ");

        s.delete(s.length() - 3, s.length());

        return s.toString();
    }
}