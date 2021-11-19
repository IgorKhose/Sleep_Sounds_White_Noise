package com.s300331719.sleepsounds_whitenoise;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ForestActivity extends AppCompatActivity {

    Button btnPlayPause;
    MediaPlayer mediaPlayer;
    boolean playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest);

        btnPlayPause = findViewById(R.id.btnPlayPause);
        mediaPlayer = MediaPlayer.create(this, R.raw.forest_sound);
        playing = true;
        btnPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(playing){
                    mediaPlayer.start();
                    playing = false;
                }
                else{
                    mediaPlayer.pause();
                    playing = true;
                    Toast.makeText(ForestActivity.this,"Sound playback has been stopped", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        if(!playing){
            mediaPlayer.pause();
            playing = true;
            Toast.makeText(ForestActivity.this,"Sound playback has been stopped", Toast.LENGTH_SHORT).show();
        }
        super.onBackPressed();
    }
}