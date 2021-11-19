package com.s300331719.sleepsounds_whitenoise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;


public class MainActivity extends AppCompatActivity {
    CardView cvRain, cvTrain, cvForest;
    GridLayout grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = findViewById(R.id.grid);
        cvRain = findViewById(R.id.cvRain);
        cvTrain = findViewById(R.id.cvTrain);
        cvForest = findViewById(R.id.cvForest);


        cvRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, RainActivity.class));
            }
        });
        cvTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TrainActivity.class));
            }
        });
        cvForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ForestActivity.class));
            }
        });
    }
}