package com.chaurasiayush.connect3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView player1 = (ImageView) findViewById(R.id.player1);
        ImageView player2 = (ImageView) findViewById(R.id.player2);


    }

    public void trans(View view){
        ImageView iview = (ImageView)view;
        iview.setTranslationY(-1500);
        iview.setImageResource(R.drawable.osymb1);
        iview.animate().translationY(0).setDuration(500);
        Log.i("info", "Box tapped!!");
    }

    public void blink(View view){

//        ImageView cview = (ImageView) view;
//        while(true)
            view.animate().alphaBy(.5f).setDuration(2000);
//            view.animate().alphaBy(-.5f).setDuration(2000);
    }
}
