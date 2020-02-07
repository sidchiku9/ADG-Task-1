package com.sidchiku9.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ebb2(View view){
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setEnabled(false);
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setEnabled(true);
    }

    public void ebb1(View view){
        Button btn3 = (Button) findViewById(R.id.button2);
        btn3.setEnabled(false);
        Button btn4 = (Button) findViewById(R.id.button1);
        btn4.setEnabled(true);
    }
}
