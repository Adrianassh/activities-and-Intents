package com.adriana.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayScriptureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_scripture);

        Intent intent = getIntent();
        String scripture = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView outScripture = findViewById(R.id.scripture);
        outScripture.setText(scripture);
    }
}