package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    Button btnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView myImageView = (ImageView) findViewById(R.id.camry);
        myImageView.setImageResource(R.drawable.camry);

        ImageView myImageView1 = (ImageView) findViewById(R.id.civic);
        myImageView.setImageResource(R.drawable.civic);

        ImageView myImageView2 = (ImageView) findViewById(R.id.audi);
        myImageView.setImageResource(R.drawable.audi);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnext:
                startActivity(new Intent(this, MainActivity4.class));
        }
    }
}