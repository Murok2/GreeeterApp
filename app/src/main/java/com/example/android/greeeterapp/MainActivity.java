package com.example.android.greeeterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<fun> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendGreeting (View v){
        EditText greetEditText = (EditText) findViewById(R.id.editText);

        String greet = greetEditText.getText().toString();
        String greeting = String.format("Hello, %s", greet);

        TextView messageTextView = (TextView) findViewById(R.id.message);

        messageTextView.setText(greeting);

    }


}