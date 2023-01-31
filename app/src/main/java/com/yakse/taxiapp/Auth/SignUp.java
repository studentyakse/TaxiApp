package com.yakse.taxiapp.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yakse.taxiapp.Pages.StartScreen;
import com.yakse.taxiapp.R;

public class SignUp extends AppCompatActivity {
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        signup = (Button) findViewById(R.id.signup_btn_auth);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, StartScreen.class);
                startActivity(intent);
            }
        });
    }

}