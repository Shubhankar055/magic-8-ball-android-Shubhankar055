package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button RollBtn = (Button) findViewById(R.id.button);
        final ImageView ball  = (ImageView) findViewById(R.id.imageView);

        final int[] Roll_Ary = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5

        };


        RollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();

                int Random_Number = randomNumberGenerator.nextInt(4);
                ball.setImageResource(Roll_Ary[Random_Number]);

                Log.d("Roll", "The Button has been pressed and the number is " + Random_Number);





            }
        });
    }
}
