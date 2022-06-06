package com.example.kouhai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Lesson1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);


        Button buttonShow = findViewById(R.id.buttonShow);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson1.this, Video1Activity.class);
                startActivity(intent);

//                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Lesson1.this, R.style.BottomSheetDialogThemes);
//                bottomSheetDialog.setContentView(R.layout.activity_video1);
//                bottomSheetDialog.show();
            }
        });
    }
    public void senpai(View view) {
        Intent intent = new Intent(Lesson1.this, SenpaiNote.class);
        startActivity(intent);
    }

}