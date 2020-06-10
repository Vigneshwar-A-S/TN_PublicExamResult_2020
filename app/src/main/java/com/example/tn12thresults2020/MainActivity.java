package com.example.tn12thresults2020;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{



    private TextView text1;
    private TextView text2;
    private Button server1;
    private Button server2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text1 =(TextView) findViewById(R.id.head);
        text2 =(TextView) findViewById(R.id.cool);
        server1 = (Button) findViewById(R.id.opensite);
        server2 = (Button) findViewById(R.id.opensite2);
        server1.setOnClickListener(this);
        server2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v == server1)
        {

            Intent intent = new Intent(MainActivity.this, site1.class);
            intent.putExtra("url_address", "http://tnresults.nic.in/nyrpt.htm");
            startActivity(intent);


        }

        if (v == server2)
        {

            Intent nice = new Intent(MainActivity.this, site2.class);
            nice.putExtra("url_address", "http://www.dge2.tn.nic.in/hpproll.aspx");
            startActivity(nice);


        }



    }
}