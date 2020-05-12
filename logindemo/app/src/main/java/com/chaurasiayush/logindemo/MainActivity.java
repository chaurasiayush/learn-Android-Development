package com.chaurasiayush.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void loginDemo(View view){

        EditText uname = (EditText) findViewById(R.id.uname);
        EditText pass = (EditText) findViewById(R.id.pass);

        Log.i("info", "Button Pressed!!");
        Log.i("uname", uname.getText().toString());
        Log.i("pass", pass.getText().toString());



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
