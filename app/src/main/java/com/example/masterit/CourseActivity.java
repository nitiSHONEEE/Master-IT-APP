package com.example.masterit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CourseActivity extends AppCompatActivity {

    ImageView java,dbms,ds,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        java = findViewById(R.id.java);
        c= findViewById(R.id.c);
        dbms = findViewById(R.id.dbms);
        ds = findViewById(R.id.ds);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent ;
                intent = new Intent(CourseActivity.this, com.example.masterit.CourseContent.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent ;
                intent = new Intent(CourseActivity.this, com.example.masterit.CourseContent.class);
                startActivity(intent);
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent ;
                intent = new Intent(CourseActivity.this, com.example.masterit.CourseContent.class);
                startActivity(intent);
            }
        });
        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent ;
                intent = new Intent(CourseActivity.this, com.example.masterit.CourseContent.class);
                startActivity(intent);
            }
        });

    }
}