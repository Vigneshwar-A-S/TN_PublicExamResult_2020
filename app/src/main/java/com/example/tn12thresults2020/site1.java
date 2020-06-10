package com.example.tn12thresults2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class site1 extends AppCompatActivity {

     WebView web1;
     String url = "http://tnresults.nic.in/nyrpt.htm";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site1);



        web1 = (WebView) findViewById(R.id.webv1);
        web1.loadUrl(url);

        url = getIntent().getExtras().get("url_address").toString();

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
