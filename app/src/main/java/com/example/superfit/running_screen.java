package com.example.superfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class running_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_screen);
        getSupportActionBar().hide();
    }
}