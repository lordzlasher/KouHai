package com.example.kouhai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);


        Button buttonShow = findViewById(R.id.buttonShow);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson2.this, Video2Activity.class);
                startActivity(intent);

//                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Lesson1.this, R.style.BottomSheetDialogThemes);
//                bottomSheetDialog.setContentView(R.layout.activity_video1);
//                bottomSheetDialog.show();
            }
        });
    }
    public void senpai(View view) {
        Intent intent = new Intent(Lesson2.this, SenpaiNote2.class);
        startActivity(intent);
    }

}