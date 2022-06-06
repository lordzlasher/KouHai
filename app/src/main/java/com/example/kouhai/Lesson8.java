package com.example.kouhai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson8);


        Button buttonShow = findViewById(R.id.buttonShow);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson8.this, Video8Activity.class);
                startActivity(intent);

//                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Lesson1.this, R.style.BottomSheetDialogThemes);
//                bottomSheetDialog.setContentView(R.layout.activity_video1);
//                bottomSheetDialog.show();
            }
        });
    }
    public void senpai(View view) {
        Intent intent = new Intent(Lesson8.this, SenpaiNote8.class);
        startActivity(intent);
    }
}