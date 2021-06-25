package com.example.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText UserName=(EditText) findViewById(R.id.usernamebox_id);
        EditText Password=(EditText) findViewById(R.id.passwordbox_id);
        Button LoginBtn=(Button) findViewById(R.id.login);
        LoginBtn.setOnClickListener(v -> {
            String username=UserName.getText().toString();
            String password=Password.getText().toString();
            if (username.equals("ananditaa") && !password.equals("") && password.equals("anan")) {
                Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(getApplicationContext(), "Login Failure", Toast.LENGTH_SHORT).show();
            }

        });
        Button LoginfbBtn=(Button) findViewById(R.id.fbname);
        LoginfbBtn.setOnClickListener(v -> {
            if(v.getId()==R.id.fbname)
            {
                Intent fbloginIntent = new Intent(getApplicationContext(), loginwithfb.class);
                startActivity(fbloginIntent);
            }
        });
        TextView SignupBtn=(TextView) findViewById(R.id.noacc_id);
        SignupBtn.setOnClickListener(v -> {
            if(v.getId()==R.id.noacc_id)
            {
                Intent signupIntent = new Intent(getApplicationContext(),createaccount.class);
                startActivity(signupIntent);
            }
        });
    }

}