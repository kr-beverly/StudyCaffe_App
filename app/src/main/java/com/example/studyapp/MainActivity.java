package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_movereserv;
<<<<<<< HEAD
    private Button btn_voucher;
=======
>>>>>>> d2c78985a64aa9d44a1b5dd23458f9aa606664ae

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), loginfrom.class);
                startActivity(intent);
            }
        });

        btn_movereserv=findViewById(R.id.btn_movereserv);
        btn_movereserv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Reservation.class); //메인과 reservation 연결
                startActivity(intent); //액티비티 이동
            }
        });
<<<<<<< HEAD

        btn_voucher=findViewById(R.id.btn_voucher);
        btn_voucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, vouchers.class);
                startActivity(intent); //액티비티 이동
            }
        });
=======
>>>>>>> d2c78985a64aa9d44a1b5dd23458f9aa606664ae
    }
}