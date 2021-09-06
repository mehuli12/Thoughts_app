package com.myappcompany.mehuli.thoughtsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class ThoughtsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thoughts);
        EditText nameField = findViewById(R.id.name_field);
        EditText title = findViewById(R.id.title); // for title
        EditText startWriting = findViewById(R.id.writing);//for start writing
        // String name = nameField.getText().toString();


        Button sendThoughts = findViewById(R.id.button3);
        sendThoughts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameField.getText().toString();
                String title1 = title.getText().toString();
                String startWriting1 = startWriting.getText().toString();
                System.out.println("Name: " + name);
                System.out.println("Title: " + title1);
                System.out.println("What you've written: " + startWriting1);
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // email apps will handle this
                intent.putExtra(Intent.EXTRA_SUBJECT, "Thoughts of " + name);
                intent.putExtra(Intent.EXTRA_TEXT, "Title: " + title1 + "\nThoughts: " + startWriting1);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }


            }
        });
    }
}

