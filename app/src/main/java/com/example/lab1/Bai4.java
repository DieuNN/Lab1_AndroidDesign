package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai4 extends AppCompatActivity {
    FrameLayout frameLayout;
    Button nextCard;
    int[] cards = {R.drawable.image_12, R.drawable.image_2, R.drawable.image_3, R.drawable.ic_launcher_foreground, R.drawable.image_5, R.drawable.image_6, R.drawable.image_7, R.drawable.image_8, R.drawable.image_9, R.drawable.image_10, R.drawable.image_11, R.drawable.image_12, R.drawable.image_13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);


        frameLayout = findViewById(R.id.frameLayout);

        int i =0;
        for (int id: cards) {
            ImageView view = new ImageView(this);
            view.setImageResource(id);

            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            params.leftMargin = (int) (i*50 *this.getResources().getDisplayMetrics().density);
            params.width = (int) (200 *this.getResources().getDisplayMetrics().density);
            params.height= (int) (250 *this.getResources().getDisplayMetrics().density);
            view.setLayoutParams(params);
            frameLayout.addView(view);
        }
    }



}