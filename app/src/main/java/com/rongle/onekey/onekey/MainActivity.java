package com.rongle.onekey.onekey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.BuildAnnotation;

public class MainActivity extends AppCompatActivity {
    @BuildAnnotation("hhh")
    private String test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
