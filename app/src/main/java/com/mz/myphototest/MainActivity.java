package com.mz.myphototest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mz.myphototest.utils.PhotoView;

public class MainActivity extends AppCompatActivity {

    private PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        photoView = findViewById(R.id.photoView);

        photoView.enable();
    }
}