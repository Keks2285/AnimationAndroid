package com.example.rotateanimationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnOrientation;
    ImageView myImageView;
    Button buttonRotateCenter;
    Button buttonRotateCorner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myImageView = findViewById(R.id.imageView);
        buttonRotateCenter = findViewById(R.id.rotatecenter);
        buttonRotateCorner = findViewById(R.id.rotatecorner);

        final Animation animationRotateCenter = AnimationUtils.loadAnimation(
                this, R.anim.rotate_center);
        final Animation animationRotateCorner = AnimationUtils.loadAnimation(
                this, R.anim.change_size);

        buttonRotateCenter.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImageView.startAnimation(animationRotateCenter);
            }
        });

        buttonRotateCorner.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImageView.startAnimation(animationRotateCorner);
            }
        });
    }
}