package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int answer = 1 + 2 + 3 +4; // 10
        int[] nu = {R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7};

        for(int i: nu) {
            Button s = findViewById(i);
            s.setText("Hello WOrld");
        }

    }
}