package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public abstract class LoginActivity extends AppCompatActivity {
    private EditText Email, Password;
    private Button btnlogin, btnregis;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        Email = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        btnlogin = findViewById(R.id.btrlogin);
        btnregis = findViewById((R.id.btrregis));

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        btnregis.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regis();
            }
        }));

 
    }

    private void regis() {
        Integer i=new Integer(LoginActivity.this,RegisActivity.class);
        startActivities(i);
    }

    private void login() {
    }

}


