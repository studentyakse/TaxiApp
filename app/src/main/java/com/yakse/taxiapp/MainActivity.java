package com.yakse.taxiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.yakse.taxiapp.Auth.SignIn;

public class MainActivity extends AppCompatActivity {

    Handler handler;
    int limit_time = 2;
    int count_time = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        handler = new Handler();
        timer.run();
    }

    Runnable timer = new Runnable() {
        @Override
        public void run() {
            count_time++;
            if (count_time == limit_time) {
                Intent intent = new Intent(MainActivity.this, SignIn.class);
                startActivity(intent);
            } else {
                handler.postDelayed(timer, 1000);
            }
        }
    };

}