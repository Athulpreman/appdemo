package com.example.apssw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button button,button2;
    EditText e1,e2,e3,e4,e5,e6;
    String s1,s2,s3,s4,s5,s6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button=(Button)findViewById(R.id.Regbutton);
        button2=(Button)findViewById(R.id.gotologin);

        e1=(EditText)findViewById(R.id.nameedit);
        e2=(EditText)findViewById(R.id.rolledit);
        e3=(EditText)findViewById(R.id.clgedit);
        e4=(EditText)findViewById(R.id.admedit);
        e5=(EditText)findViewById(R.id.passedit);
        e6=(EditText)findViewById(R.id.confirmedit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();
                s6=e6.getText().toString();

                Log.d("Name",s1);
                Log.d("Password",s5);

                Toast.makeText(getApplicationContext(),"Registered succesfully", Toast.LENGTH_LONG).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }

}
