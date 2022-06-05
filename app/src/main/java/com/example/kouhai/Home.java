package com.example.kouhai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigation =findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();

        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()){
                    case R.id.nav_home:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.nav_courses:
                        selectedFragment = new CoursesFragment();
                        break;
                    case R.id.nav_about:
                        selectedFragment = new AboutFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                return true;
            }
        });
    }
    public void showhiragana(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nhk.or.jp/lesson/id/letters/hiragana.html"));
        startActivity(intent);
    }
    public void showkatakana(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nhk.or.jp/lesson/id/letters/katakana.html"));
        startActivity(intent);
    }
    public void showkanji(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nhk.or.jp/lesson/id/letters/kanji.html"));
        startActivity(intent);
    }
    public void showCourse1(View view) {
        Intent i = new Intent(getApplicationContext(), Lesson1.class);
        startActivity(i);
    }
    public void showCourse2(View view) {
        Intent i = new Intent(getApplicationContext(), Lesson1.class);
        startActivity(i);
    }
    public void showMoreCourse(View view) {
        Intent i = new Intent(getApplicationContext(), Lesson1.class);
        startActivity(i);
    }


}