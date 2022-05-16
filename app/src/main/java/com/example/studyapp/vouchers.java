package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class vouchers extends AppCompatActivity {
    RadioGroup gr_voucher, gr_voucher_day;
    RadioButton voucher_day, voucher_time, voucher_group4, voucher_group6;
    RadioButton voucher_day_2, voucher_day_4, voucher_day_6, voucher_day_8, voucher_day_12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_vouchers);

        gr_voucher = findViewById(R.id.gr_voucher);
        gr_voucher_day = findViewById(R.id.gr_voucher_day);

        voucher_day = findViewById(R.id.voucher_day);
        voucher_time = findViewById(R.id.voucher_time);
        voucher_group4 = findViewById(R.id.voucher_group4);
        voucher_group6 = findViewById(R.id.voucher_group6);

        voucher_day_2 = findViewById(R.id.voucher_day_2);
        voucher_day_4 = findViewById(R.id.voucher_day_4);
        voucher_day_6 = findViewById(R.id.voucher_day_6);
        voucher_day_8 = findViewById(R.id.voucher_day_8);
        voucher_day_12 = findViewById(R.id.voucher_day_12);
    }


}
