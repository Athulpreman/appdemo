package com.example.apssw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    EditText ed1,ed2,e3,e4,e5,e6,e7;
    Button bt1,bt2;
    String a,b,c,d,e,f,g;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.stdname);
        ed2=(EditText)findViewById(R.id.amno);
        e3=(EditText)findViewById(R.id.rolno);
        e4=(EditText)findViewById(R.id.clg);
        e5=(EditText)findViewById(R.id.parent);
        e6=(EditText)findViewById(R.id.mob);
        e7=(EditText)findViewById(R.id.plc);
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent ob =new Intent(getApplicationContext(),Register.class);
                startActivity(ob);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                a = ed1.getText().toString();
                b = ed2.getText().toString();
                c = e3.getText().toString();
                d = e4.getText().toString();
                e = e5.getText().toString();
                f = e6.getText().toString();
                g = e7.getText().toString();

                
                if ((a.equals("Athul")) && (c.equals("12345")))
                {

                    Toast.makeText(getApplicationContext(), "Login Sussefull", Toast.LENGTH_SHORT).show();

                    Intent i=new Intent(getApplicationContext(),Welcome.class);
                    startActivity(i);

                } else {
                    Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_LONG).show();

                }
            }
            });
    }
}
