package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView myname;
    String namefromfirstactivity = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myname = findViewById(R.id.mytext);
        namefromfirstactivity = getIntent().getStringExtra("name");
        myname.setText(namefromfirstactivity);

    }
}