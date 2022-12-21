package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    ImageView image;
    TextView name;
    TextView year;
    TextView stars;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        image = findViewById(R.id.film_image);
        name = findViewById(R.id.film_name);
        year = findViewById(R.id.film_year);
        stars = findViewById(R.id.film_stars);
        description = findViewById(R.id.film_descriptions);

        for (int i = 0; i < Film.list.length; i++) {
            if (Integer.parseInt(getIntent().getData().toString()) == Film.list[i].getImageID()) {
                Film f = Film.list[i];
                image.setImageResource(f.getImageID());
                name.setText(f.getName());
                year.setText(f.getYear()+"");
                stars.setText(getStars(f.getStars()));
                description.setText(f.getDescription());
            }
        }
    }

    private String getStars(String[] stars) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < stars.length; i++) {
            s.append(stars[i] + ", ");
        }
        s.delete(s.length() - 3, s.length());

        return s.toString();
    }
}