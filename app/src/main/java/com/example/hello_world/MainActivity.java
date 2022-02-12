package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
//Create Object text and butto
//TextView textobj;
Button buttonobj;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textobj=(TextView) findViewById(R.id.txt);
        buttonobj=(Button) findViewById(R.id.btn);

        buttonobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // textobj.setText("Andriod version");
                openMainActivity2();
            }
        });

    }
    public void openMainActivity2()
    {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }


}