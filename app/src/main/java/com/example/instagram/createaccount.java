package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class createaccount extends AppCompatActivity {
    String usernameca,passwordca,firstnameca,lastnameca;
    EditText UserNameca,Passwordca,FirstNameca,LastNameca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);
        UserNameca=findViewById(R.id.usernameboxca_id);
        usernameca=UserNameca.getText().toString();
        Passwordca=findViewById(R.id.passwordboxca_id);
        passwordca=Passwordca.getText().toString();
        FirstNameca=findViewById(R.id.firstnameca_id);
        firstnameca=FirstNameca.getText().toString();
        LastNameca=findViewById(R.id.lastnameca_id);
        lastnameca=LastNameca.getText().toString();
    }
}