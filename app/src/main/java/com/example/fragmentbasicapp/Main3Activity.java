package com.example.fragmentbasicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main3Activity extends AppCompatActivity {
    ToggleButton t1,t2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t1=findViewById(R.id.toggleButton);
        t2=findViewById(R.id.toggleButton2);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String status;
                status="mode"+t1.getText()+"choice"+t2.getText();
                Toast.makeText(getApplicationContext(),status,Toast.LENGTH_LONG).show();
            }
        });


    }
}
