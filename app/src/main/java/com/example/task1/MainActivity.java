package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //decaring obects globally to access anywhere in mainactivity
    EditText firstname,lastname;
    Button add,clear;
    TextView textDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private  void init(){
        add=findViewById(R.id.buttonadd);
         clear=findViewById(R.id.buttonclear);
        firstname=findViewById(R.id.firstname);
        lastname=findViewById(R.id.lastname);
        textDisplay=findViewById(R.id.textViewDisplay);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameDisplay=firstname.getText().toString()+""+lastname.getText().toString();
                textDisplay.setText("Hellow "+nameDisplay);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameDisplay="World";
                firstname.setText("");
                lastname.setText("");
                textDisplay.setText("Hellow "+nameDisplay);
            }
        });
    }
}