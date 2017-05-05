package com.example.android.relax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NewSegmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_segment);

        // Find Save button
        Button buttonSegmentSave = (Button) findViewById(R.id.buttonSegmentSave);

        // Set click listener on Save button
        buttonSegmentSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to {@link NewSessionActivity}
                Intent intentNewSession = new Intent(NewSegmentActivity.this, NewSessionActivity.class);

                // Start activity
                startActivity(intentNewSession);
            }
        });

        // Find Cancel button
        Button buttonSegmentCancel = (Button) findViewById(R.id.buttonSegmentCancel);

        // Set click listener on Cancel button
        buttonSegmentCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to {@link NewSessionActivity}
                Intent intentNewSession2 = new Intent(NewSegmentActivity.this, NewSessionActivity.class);

                // Start activity
                startActivity(intentNewSession2);
            }
        });
    }
}
