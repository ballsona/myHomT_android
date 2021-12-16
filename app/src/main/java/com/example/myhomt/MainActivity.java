package com.example.myhomt;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);
        bottomNavigationView.setSelectedItemId(R.id.tab_exercise);

    }
    ExerciseFragment exerciseFragment = new ExerciseFragment();
    ProgramFragment programFragment = new ProgramFragment();
    PointFragment pointFragment = new PointFragment();
    MyPageFragment myPageFragment = new MyPageFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.tab_exercise:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, exerciseFragment).commit();
                return true;

            case R.id.tab_program:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, programFragment).commit();
                return true;

            case R.id.tab_point:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, pointFragment).commit();
                return true;

            case R.id.tab_myPage:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, myPageFragment).commit();
                return true;
        }
        return false;
    }
}