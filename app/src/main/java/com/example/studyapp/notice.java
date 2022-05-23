package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notice extends AppCompatActivity {
    private Button btn_notice_home;
    Button qna, announ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        qna = (Button) findViewById(R.id.btn_qna);
        announ = (Button) findViewById(R.id.btn_announ);

        qna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                QnA fragment1 = new QnA();
                transaction.replace(R.id.frame, fragment1);
                transaction.commit(); //새로고침 저장(?)
            }
        });

        announ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Announ fragment2 = new Announ();
                transaction.replace(R.id.frame, fragment2);
                transaction.commit(); //새로고침 저장(?)
            }
        });

        btn_notice_home = findViewById(R.id.btn_notice_home);

        //버튼 연결
        btn_notice_home=findViewById(R.id.btn_notice_home);
        btn_notice_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(notice.this, sign_main.class);
                startActivity(intent);
            }
        });
    }
}
