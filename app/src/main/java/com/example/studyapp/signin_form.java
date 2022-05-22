package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signin_form extends AppCompatActivity {

    private Button complete_save_user_sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_form);

        //저장된 사용자 정보 넘긴 후 로그인 된 메인 페이지로 이동
        complete_save_user_sign=findViewById(R.id.complete_save_user_sign);
        complete_save_user_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signin_form.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}