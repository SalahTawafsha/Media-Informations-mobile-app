package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recycler = findViewById(R.id.film_recycler);

        recycler.setLayoutManager(new GridLayoutManager(this, 3));
        FilmAdapter adapter = new FilmAdapter(Film.list);
        recycler.setAdapter(adapter);
    }

    public void getFilms(View view) {

        recycler.setLayoutManager(new GridLayoutManager(this, 3));
        FilmAdapter adapter = new FilmAdapter(Film.list);
        recycler.setAdapter(adapter);
    }
}
