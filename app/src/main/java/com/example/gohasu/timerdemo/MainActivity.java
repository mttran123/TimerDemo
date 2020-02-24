package com.example.gohasu.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.textView);

        new CountDownTimer(20000,1000) {
            public void onTick(long millisecondsUntilDone) {
                text.setText("Seconds remaining: " + millisecondsUntilDone/1000);
            }
            public  void onFinish(){
                text.setText("Finished!");
            }
        }.start();


        /*new CountDownTimer(10000,1000) {
            public void onTick(long millisecondsUntilDone) {
                Log.i("Seconds left!",String.valueOf(millisecondsUntilDone/1000));
            }

            public void onFinish() {
                Log.i("We're done.", "No more countdown");
            }
        }.start(); */

        /*
        final Handler handler = new Handler();


        final Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("It's us", "A second passed by");

                handler.postDelayed(this,1000);
            }
        };

        handler.post(run);
        */
    }
}
