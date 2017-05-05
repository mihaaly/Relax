package com.example.android.relax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SessionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions);

        // Find New session button
        Button buttonNew = (Button) findViewById(R.id.buttonNew);

        // Set click listener on New session button
        buttonNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // New intent to open {@link NewSessionActivity}
                Intent intentNewSession = new Intent(SessionsActivity.this, NewSessionActivity.class);
                // Start activity
                startActivity(intentNewSession);
            }
        });

        // Find Home button
        Button buttonSessionsHome = (Button) findViewById(R.id.buttonSessionsHome);

        // Set click listener on Home button
        buttonSessionsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // New intent to open {@link MainActivity}
                Intent intentMain = new Intent(SessionsActivity.this, MainActivity.class);
                // Start activity
                startActivity(intentMain);
            }
        });
    }
}
