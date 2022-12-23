package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private RecyclerView recycler;
    private Button movie;
    private Button tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recycler = findViewById(R.id.film_recycler);
        movie = findViewById(R.id.show_films);
        movie.setEnabled(false);
        tvShow = findViewById(R.id.show_series);

        recycler.setLayoutManager(new GridLayoutManager(this, 3));
        FilmAdapter adapter = new FilmAdapter(Film.list);
        recycler.setAdapter(adapter);
    }

    public void getFilms(View view) {
        movie.setEnabled(false);
        tvShow.setEnabled(true);
        recycler.setLayoutManager(new GridLayoutManager(this, 3));
        FilmAdapter adapter = new FilmAdapter(Film.list);
        recycler.setAdapter(adapter);
    }

    public void getTVShow(View view) {
        movie.setEnabled(true);
        tvShow.setEnabled(false);
        recycler.setLayoutManager(new GridLayoutManager(this, 3));
        TVShowAdapter adapter = new TVShowAdapter(TVShow.list);
        recycler.setAdapter(adapter);
    }
}
