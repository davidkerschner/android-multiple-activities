package com.example.wah211.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view){
        EditText et = (EditText)findViewById(R.id.editText);
        String message = et.getText().toString();
        Intent i = new Intent(this, RecieverActivity.class);
        i.putExtra(RecieverActivity.EXTRA_MESSAGE, message);
        startActivity(i);
    }
}
