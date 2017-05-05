package com.example.android.relax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Find Home button
        Button buttonSettingsHome = (Button) findViewById(R.id.buttonSettingsHome);

        // Set click listener on Home button
        buttonSettingsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // New intent to open {@link MainActivity}
                Intent intentMainActivity = new Intent(SettingsActivity.this, MainActivity.class);

                // Start activity
                startActivity(intentMainActivity);
            }
        });
    }
}
