package com.example.masterit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signinActivity extends AppCompatActivity {

    Button button4;
    TextView textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        button4 =findViewById(R.id.button4);
        textView6 =findViewById(R.id.textView6);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent ;
                intent = new Intent(signinActivity.this, com.example.masterit.CourseActivity.class);
                startActivity(intent);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent ;
                intent = new Intent(signinActivity.this, com.example.masterit.signupActivity.class);
                startActivity(intent);
            }
        });
    }
}