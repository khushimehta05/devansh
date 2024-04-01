package com.example.devansh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login_page extends AppCompatActivity {

    TextView login,email,pass,signup,f_pass;

    Button btn_login;

    SharedPreferences sp;
    SharedPreferences.Editor spe;

    String txt_email;
    String txt_pass;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

    login = findViewById(R.id.login);
    email = findViewById(R.id.email);
    pass = findViewById(R.id.pass);
    signup = findViewById(R.id.signup);
    f_pass = findViewById(R.id.f_pass);
    btn_login = findViewById(R.id.btn_login);

    sp = getSharedPreferences("Login",MODE_PRIVATE);

    btn_login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            spe = sp.edit();
            txt_email =

        }
    });




    }
}