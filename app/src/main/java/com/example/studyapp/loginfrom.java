package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginfrom extends AppCompatActivity {

    private Button btn_loginform_signin;
    private Button btn_loginform_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginfrom);

        btn_loginform_signin = findViewById(R.id.btn_loginform_signin);
        btn_loginform_signin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(loginfrom.this, sign_main.class);
                startActivity(intent);
            }
        });

        btn_loginform_signup = findViewById(R.id.btn_loginform_signup);
        btn_loginform_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginfrom.this, signin_form.class);
                startActivity(intent);
            }
        });
    }
}