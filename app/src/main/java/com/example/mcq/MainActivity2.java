package com.example.mcq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    SharedPreferences sp;
    String s1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sp = getSharedPreferences("pqrst",MODE_PRIVATE);
        tv = findViewById(R.id.textView);
        s1=sp.getString("pooh","any");
        tv.setText("Your Score:"+s1);


    }
}