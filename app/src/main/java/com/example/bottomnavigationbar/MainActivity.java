package com.example.bottomnavigationbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_Navigation_Bar);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, firstFragment).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(this);




    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.profile) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, firstFragment).commit();
        } else if (itemId == R.id.settings) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, secondFragment).commit();
        } else if (itemId == R.id.home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, thirdFragment).commit();
        }

        return true;
    }


}