package com.s300331719.sleepsounds_whitenoise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // timer task object holds the logic, which is start the main activity
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
            }
        };
        // create timer, that calls timer-task after 3 seconds
        Timer opening = new Timer();
        opening.schedule(task, 3000);
    }
}