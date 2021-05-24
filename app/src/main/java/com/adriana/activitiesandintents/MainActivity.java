package com.adriana.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendScripture(View view) {
        Intent intent = new Intent(this, DisplayScriptureActivity.class);
        EditText book = findViewById(R.id.book);
        EditText chapter = findViewById(R.id.chapter);
        EditText verse = findViewById(R.id.verse);
        String scripture = book.getText().toString() + " " + chapter.getText().toString() + ":" + verse.getText().toString() + ".";
        intent.putExtra(EXTRA_MESSAGE, scripture);
        startActivity(intent);
    }
}