package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView myImageView = (ImageView) findViewById(R.id.camry);
        myImageView.setImageResource(R.drawable.camry);

        ImageView myImageView1 = (ImageView) findViewById(R.id.civic);
        myImageView.setImageResource(R.drawable.civic);
    }
}