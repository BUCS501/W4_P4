package com.example.compass;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

public class NorthActivity extends AppCompatActivity {

    private TextView message;
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north); // Change to proper layout

        message = (TextView) findViewById(R.id.message);
        image = (ImageView) findViewById(R.id.image);

    }

}