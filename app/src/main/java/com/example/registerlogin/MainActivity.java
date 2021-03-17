package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btRegister;
    EditText etUname, etEmail, etPass, etConfirmPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUname = (EditText) findViewById(R.id.etUname);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPass = (EditText) findViewById(R.id.etPass);
        etConfirmPass = (EditText) findViewById(R.id.etConfirmPass);
        btRegister = (Button) findViewById(R.id.btRegister);

        btRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btRegister:
                startActivity(new Intent(this, MainActivity3.class));
                break;
        }
    }
}