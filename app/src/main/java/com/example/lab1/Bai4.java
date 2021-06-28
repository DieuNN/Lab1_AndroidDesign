package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai4 extends AppCompatActivity {
    int[] cards = {R.drawable.card_4, R.drawable.card_2, R.drawable.card_10, R.drawable.card_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        FrameLayout frameLayout = findViewById(R.id.frameLayout);
        int i = 0;
        for(int a:cards) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(a);

            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(200, 250);
            params.setMargins(100, 100, 100, 100);
            imageView.setLayoutParams(params);
            frameLayout.addView(imageView);
        }
    }



}