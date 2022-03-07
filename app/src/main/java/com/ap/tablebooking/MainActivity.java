package com.ap.tablebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etUsername,etPassword;
    TextView tvNewuser,tvNewrestaurant;
    CheckBox cbUsertype;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.btnLogin);
        etUsername=findViewById(R.id.etUsername);
        etPassword=findViewById(R.id.etPassword);
        tvNewuser=findViewById(R.id.tvNewuser);
        tvNewrestaurant=findViewById(R.id.tvNewrestaurant);
        cbUsertype=findViewById(R.id.cbUsertype);

        tvNewuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(),NewUser.class);
            }
        });
        tvNewrestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(),NewRestaurant.class);
            }
        });


    }
}