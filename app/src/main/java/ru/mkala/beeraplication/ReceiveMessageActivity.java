package ru.mkala.beeraplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String messText = intent.getStringExtra(Intent.EXTRA_TEXT);
        EditText mess = (EditText) findViewById(R.id.message);
        mess.setText(messText);
    }
}
