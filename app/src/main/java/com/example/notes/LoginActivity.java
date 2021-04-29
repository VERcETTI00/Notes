package com.example.notes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button logInButton = findViewById(R.id.logInButton);

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mUsername = username.getText().toString();
                String mPassword = password.getText().toString();

                if (mUsername.equals("aman")&&mPassword.equals("qwert"))
                    startActivity(new Intent(LoginActivity.this,MenuActivity.class));
                else
                    Toast.makeText(LoginActivity.this,"Incorrect Username or Password", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
