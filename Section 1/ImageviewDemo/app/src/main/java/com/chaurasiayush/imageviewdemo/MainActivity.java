package com.chaurasiayush.imageviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImg(View view){

        ImageView imageView = (ImageView) findViewById(R.id.imageView);


        imageView.setImageResource(R.drawable.tom);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
