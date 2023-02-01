package com.yakse.taxiapp_wear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {
    Handler handler;
    int limit_time = 2;
    int count_time = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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