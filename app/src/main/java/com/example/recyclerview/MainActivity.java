package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private Animation top;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);

        top = AnimationUtils.loadAnimation(this, R.anim.top_animation);

        logo.setAnimation(top);


        Handler handler = new Handler();

        handler.postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, Menu.class);
            startActivity(intent);
            finish();
        }, 2000);


    }
}