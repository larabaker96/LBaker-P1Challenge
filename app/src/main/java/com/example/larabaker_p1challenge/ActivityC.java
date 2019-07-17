package com.example.larabaker_p1challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityc);

        ImageView newImage = (ImageView) findViewById(R.id.image_profile);
        newImage.setImageResource(R.drawable.avatar);
    }
}
