package com.example.android.relax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NewSessionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_session);

        // Find Save button
        Button buttonSave = (Button) findViewById(R.id.buttonSave);

        // Set click listener on Save button
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creates intent to {@link SessionsActivity}
                Intent intentSessions = new Intent(NewSessionActivity.this, SessionsActivity.class);

                // Start new activity
                startActivity(intentSessions);
            }
        });

        // Find Cancel button
        Button buttonCancel = (Button) findViewById(R.id.buttonCancel);

        // Set click listener on Cancel button
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent to {@link SessionsActivity}
                Intent intentSessions2 = new Intent(NewSessionActivity.this, SessionsActivity.class);

                // Start new activity
                startActivity(intentSessions2);
            }
        });

        // Find New segment button
        Button buttonNewSegment = (Button) findViewById(R.id.buttonNewSegment);

        // Set click listener on New segment button
        buttonNewSegment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent to {@link NewSegmentActivity}
                Intent intentNewSegment = new Intent(NewSessionActivity.this, NewSegmentActivity.class);

                // Start new activity
                startActivity(intentNewSegment);
            }
        });
    }
}
