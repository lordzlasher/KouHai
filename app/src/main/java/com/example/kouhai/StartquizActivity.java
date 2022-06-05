package com.example.kouhai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartquizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startquiz);

    }

    public void mulaikuis(View view) {
        Intent login = new Intent(StartquizActivity.this,Quiz1Activity.class);
        startActivity(login);
    }
}