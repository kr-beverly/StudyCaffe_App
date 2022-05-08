package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reservation extends AppCompatActivity {

    private Button btn_resevmovehome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        //예약에서 home으로 넘어가는 버튼 연결
        btn_resevmovehome=findViewById(R.id.btn_resevmovehome);
        btn_resevmovehome.setOnClickListener(new View.OnClickListener() {
            @Override

            //아마 Intent와 intent 함수 바꾸어야 할 것으로 보임
            public void onClick(View view) {
                Intent intent = new Intent(Reservation.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}