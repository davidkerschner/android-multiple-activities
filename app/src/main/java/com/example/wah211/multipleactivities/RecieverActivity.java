package com.example.wah211.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecieverActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);
        Intent i = getIntent();
        String message = i.getStringExtra(EXTRA_MESSAGE);
        TextView tv = (TextView)findViewById(R.id.message);
        tv.setText(message);
    }
}
