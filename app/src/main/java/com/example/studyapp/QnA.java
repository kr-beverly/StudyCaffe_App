package com.example.studyapp;

<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> 0a9ca7397e54370972932b0043b797dbbd664143
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class QnA extends Fragment {
    /*
    private Button btn_newwrite;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn_newwrite = findViewById(R.id.btn_newwrite);
        btn_newwrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QnA.this, sign_main.class);
                startActivity(intent);
            }
        });
    }
     */

    public QnA() {
=======

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class QnA extends Fragment {

    public QnA() {

>>>>>>> 0a9ca7397e54370972932b0043b797dbbd664143
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.qna, container, false);
    }
}
<<<<<<< HEAD


=======
>>>>>>> 0a9ca7397e54370972932b0043b797dbbd664143
