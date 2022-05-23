package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reservation extends AppCompatActivity {

    private Button btn_resevmovehome, btn_seat_1, btn_seat_2, btn_seat_3, btn_seat_4, btn_seat_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        btn_seat_1=findViewById(R.id.btn_seat_1);
        btn_seat_2=findViewById(R.id.btn_seat_2);
        btn_seat_3=findViewById(R.id.btn_seat_3);
        btn_seat_4=findViewById(R.id.btn_seat_4);
        btn_seat_5=findViewById(R.id.btn_seat_5);



        //예약에서 home으로 넘어가는 버튼 연결
        btn_resevmovehome=findViewById(R.id.btn_resevmovehome);
        btn_resevmovehome.setOnClickListener(new View.OnClickListener() {
            @Override

            //아마 Intent와 intent 함수 바꾸어야 할 것으로 보임
            public void onClick(View view) {
                Intent intent = new Intent(Reservation.this, MainActivity.class);
                startActivity(intent);
                //자리 선택 시 생성되는 예약 팝업창
                switch(view.getId()){
                    case R.id.btn_seat_1:
                        startActivity(new Intent(Reservation.this, seat_popup.class));
                        break;

                }
            }

        });

    }


}