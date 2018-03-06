package com.londonappbrewery.magiceightball;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int i=0;
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final int[] backColor = {
                Color.parseColor("#013243"),
                Color.parseColor("#3A539B"),
                Color.parseColor("#1E8BC3"),
                Color.parseColor("#4B77BE"),
                Color.parseColor("#59ABE3"),
                Color.parseColor("#336E7B"),
        };

        Button myButton = (Button) findViewById(R.id.askButton);

        final RelativeLayout layoutmain = (RelativeLayout) findViewById(R.id.activity_main);



        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random RandomNumGenerator = new Random();

                int number = RandomNumGenerator.nextInt(5);
                int number2 = RandomNumGenerator.nextInt(6);

                while ( ((ColorDrawable)layoutmain.getBackground()).getColor() == backColor[number2] ){
                    number2 = RandomNumGenerator.nextInt(6);

                }

                layoutmain.setBackgroundColor(backColor[number2]);


                ballDisplay.setImageResource(ballArray[number]);
            }
        });




    }
}
