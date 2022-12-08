package com.example.assignment2task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btn1();
        btn2();
    }

    public void btn1()
    {
        Button b1 = findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signup.this, "Registration complete", Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(signup.this, final2.class);
                startActivity(i1);
            }
        });
    }

    public void btn2()
    {
        Button b2 = findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(signup.this, signin.class);
                startActivity(i2);
            }
        });
    }
}