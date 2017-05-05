package com.example.android.relax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Audio library button
        Button buttonAudioLibrary = (Button) findViewById(R.id.buttonAudioLibrary);

        // Set click listener on that view
        buttonAudioLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open {@link AudioLibraryActivity}
                Intent intentAudioLibrary = new Intent(MainActivity.this, AudioLibraryActivity.class);
                // Start new activity
                startActivity(intentAudioLibrary);
            }
        });

        // Find Settings button.
        Button buttonSettings = (Button) findViewById(R.id.buttonSettings);

        // Set click listener on buttonSettings
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent to open {@link SettingsActivity}
                Intent intentSettings = new Intent(MainActivity.this, SettingsActivity.class);
                // Start activity
                startActivity(intentSettings);
            }
        });

        // Find Choose meditation button
        Button buttonMeditationSessions = (Button) findViewById(R.id.buttonMeditationSessions);

        // Set click listener on that view
        buttonMeditationSessions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent to open {@link SessionsActivity}
                Intent intentSessions = new Intent(MainActivity.this, SessionsActivity.class);
                // Start activity
                startActivity(intentSessions);
            }
        });
    }
}
