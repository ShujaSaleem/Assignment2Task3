package com.example.assignment2task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    private EditText US;
    private EditText PW;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        btn1();
        btn2();
    }

    public void btn1()
    {
        Button b1 = findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getvalues();
                check();
            }
        });
    }

    public void btn2()
    {
        Button b2 = findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(signin.this, signup.class);
                startActivity(i2);
            }
        });
    }

    public void getvalues()
    {
        US = findViewById(R.id.username);
        user = US.getText().toString();

        PW = findViewById(R.id.password);
        pass = PW.getText().toString();
    }

    public void check()
    {
        if(user.matches("bsem-f20-111") && pass.matches("student123"))
        {
            Toast.makeText(getApplicationContext(), "Signin Successfull", Toast.LENGTH_SHORT).show();
            Intent i1 = new Intent(signin.this, finalscreen.class);
            startActivity(i1);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Username or Password do not match", Toast.LENGTH_SHORT).show();
        }
    }
}