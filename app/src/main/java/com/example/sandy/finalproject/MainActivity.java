package com.example.sandy.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText password;
    Button login;
    private Sharedpreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.aName);
        password = (EditText)findViewById(R.id.apassword);
        login = (Button)findViewById(R.id.alogin);

        sharedpreferences = new Sharedpreferences(getApplicationContext());

        if(sharedpreferences.getstatus())
        {
            Intent intent = new Intent(MainActivity.this,HomePage.class);
            startActivity(intent);
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().equals("bharath") && password.getText().toString().equals("bharath599"))
                {
                    Intent intent = new Intent(MainActivity.this,HomePage.class);
                    startActivity(intent);
                    sharedpreferences.Writepreferences(true);

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Not Matched", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
