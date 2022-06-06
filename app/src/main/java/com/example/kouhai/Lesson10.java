package com.example.kouhai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson10);


        Button buttonShow = findViewById(R.id.buttonShow);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson10.this, Video10Activity.class);
                startActivity(intent);

//                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Lesson1.this, R.style.BottomSheetDialogThemes);
//                bottomSheetDialog.setContentView(R.layout.activity_video1);
//                bottomSheetDialog.show();
            }
        });
    }
    public void senpai(View view) {
        Intent intent = new Intent(Lesson10.this, SenpaiNote10.class);
        startActivity(intent);
    }
}