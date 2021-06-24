package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class loginwithfb extends AppCompatActivity {
    String usernamefb,passwordfb;
    EditText UserNamefb,Passwordfb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginwithfb);
        UserNamefb=findViewById(R.id.usernameboxfb_id);
        usernamefb=UserNamefb.getText().toString();
        Passwordfb=findViewById(R.id.passwordboxfb_id);
        passwordfb=Passwordfb.getText().toString();
    }
}