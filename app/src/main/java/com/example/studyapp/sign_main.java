package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sign_main extends AppCompatActivity {

<<<<<<< HEAD
    private Button signout_button, button4;
=======
    private Button signout_button;
>>>>>>> f14daac1f9e244fd3e68d55584acc772cb967a18

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin_main);

        signout_button=findViewById(R.id.signout_button);
        signout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_main.this, MainActivity.class);
                startActivity(intent);
            }
        });

<<<<<<< HEAD
        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_main.this, notice.class);
                startActivity(intent);
            }
        });
=======
>>>>>>> f14daac1f9e244fd3e68d55584acc772cb967a18
    }
}