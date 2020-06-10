package com.example.tn12thresults2020;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class site2 extends AppCompatActivity {

     WebView web1;
     String url = "http://www.dge2.tn.nic.in/hpproll.aspx";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site1);

        web1 = (WebView) findViewById(R.id.webv1);
        web1.loadUrl(url);

        WebSettings webSettings = web1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);

        web1.setWebViewClient(new WebViewClient());


    }
    @Override
    public void onBackPressed() {
        if (web1.canGoBack()) {
            web1.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

}
