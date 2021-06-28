package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai4 extends AppCompatActivity {
    int[] cards = {R.drawable.card_2, R.drawable.card_4, R.drawable.card_9, R.drawable.card_10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        FrameLayout frameLayout = findViewById(R.id.frameLayout);

        int i = 0;
        for(int a: cards) {
            ImageView view = new ImageView(this);
            view.setImageResource(a);

            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            params.leftMargin = (int) (i * 50 * this.getResources().getDisplayMetrics().density);
            params.width = (int) (200 * this.getResources().getDisplayMetrics().density);
            params.height = (int) (250 * this.getResources().getDisplayMetrics().density);
            view.setLayoutParams(params);
            frameLayout.addView(view);
            i++;
        }
    }
}