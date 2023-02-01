package com.yakse.taxiapp_wear;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileSync extends Activity {
    Button sync;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_sync);

        sync = (Button) findViewById(R.id.profile_btn_sync);
        sync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileSync.this, DriverTimer.class);
                startActivity(intent);
            }
        });
    }

}