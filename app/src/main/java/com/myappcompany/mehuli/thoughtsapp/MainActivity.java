package com.myappcompany.mehuli.thoughtsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startWriting(View view) {
        //handling click on the button here

        Intent intent = new Intent(this, ThoughtsActivity.class);
        startActivity(intent);

    }
}