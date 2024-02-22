package com.example.labactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaration
    EditText name;
    TextView output;
    String uName;

    public void fnPressMe(View view){
        //bind
        name=findViewById(R.id.etName);
        output=findViewById(R.id.tvOutput);
        //get user input from EditText
        uName=name.getText().toString();
        //display user input to TextView
        output.setText("Hello, "+uName);
        //Log.i("Info","Button is pressed!!!");
    }
    public void fnReset(View view){
        output.setText("Hello World!");
        name.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}