package com.chaurasiayush.curruncyconverter_rstousd;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToUsd(View view){

        TextView inr = (TextView)findViewById(R.id.inr);
        float inrValue = Float.parseFloat(inr.getText().toString());
        float inrUsd = inrValue * 0.013f;

        String msg = String.valueOf(inrValue) + String.format(" INR is $%1.2f", inrUsd);

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
