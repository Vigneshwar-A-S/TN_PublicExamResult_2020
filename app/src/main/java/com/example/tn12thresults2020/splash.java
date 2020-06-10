package com.example.tn12thresults2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th= new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                  sleep(4000);
                }
                catch(Exception e)
                {
                   e.printStackTrace();
                }
                finally
                {
                   Intent home = new Intent(splash.this,MainActivity.class);
                   startActivity(home);
                }
            }
        };
        th.start();
    }
    @Override
     protected void onPause()
    {
       super.onPause();
       finish();
    }
}
