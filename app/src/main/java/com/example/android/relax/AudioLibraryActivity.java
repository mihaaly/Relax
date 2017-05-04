package com.example.android.relax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AudioLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_library);

        // Find Home button
        Button buttonHome = (Button) findViewById(R.id.buttonHome);
        // Set click listener on Home button
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to open {@link MainActivity}
                Intent intentMainActivity = new Intent(AudioLibraryActivity.this, MainActivity.class);
                // Start activity
                startActivity(intentMainActivity);
            }
        });

    }
}
