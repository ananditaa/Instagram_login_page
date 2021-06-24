package com.example.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String username,password;
    EditText UserName,Password;
    Button LoginBtn,LoginfbBtn;
    TextView SignupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName = findViewById(R.id.usernamebox_id);
        username = UserName.getText().toString();
        Password = findViewById(R.id.passwordbox_id);
        password = Password.getText().toString();
        LoginBtn = findViewById(R.id.login);
        LoginBtn.setOnClickListener(v -> {
            if(v.getId()==R.id.login)
            {
                System.out.println("Log in success!");
            }
        });
        LoginfbBtn = findViewById(R.id.fbname);
        LoginfbBtn.setOnClickListener(v -> {
            if(v.getId()==R.id.fbname)
            {
                Intent fbloginIntent = new Intent(getApplicationContext(), loginwithfb.class);
                startActivity(fbloginIntent);
            }
        });
        SignupBtn = findViewById(R.id.noacc_id);
        SignupBtn.setOnClickListener(v -> {
            if(v.getId()==R.id.noacc_id)
            {
                Intent signupIntent = new Intent(getApplicationContext(),createaccount.class);
                startActivity(signupIntent);
            }
        });


    }

}