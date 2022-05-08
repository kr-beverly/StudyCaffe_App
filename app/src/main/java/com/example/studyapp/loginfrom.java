package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginfrom extends AppCompatActivity {

    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginfrom);

        btn_login=findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            //아마 Intent와 intent 함수 바꾸어야 할 것으로 보임
            public void onClick(View view) {
                Intent intent = new Intent(loginfrom.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}