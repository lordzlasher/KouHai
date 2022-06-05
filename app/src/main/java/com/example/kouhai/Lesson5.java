package com.example.kouhai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lesson5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson5);
    }

    public void senpai(View view) {
        Intent intent = new Intent(Lesson5.this, SenpaiNote.class);
        startActivity(intent);
    }

    public void chat1(View view) {
        Intent intent = new Intent(Lesson5.this, Chat1Activity.class);
        startActivity(intent);
    }
}