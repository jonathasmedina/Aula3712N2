package com.example.aula3712n2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        webView_ = findViewById(R.id.webView);

        WebSettings ws = webView_.getSettings();

        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        webView_.setWebViewClient(new WebViewClient());

        webView_.loadUrl("https://ead.ifms.edu.br/");

        Configuration config = getResources().getConfiguration();

        if((config.screenLayout & config.SCREENLAYOUT_SIZE_MASK) == config.SCREENLAYOUT_SIZE_XLARGE)
            setContentView(R.layout.activity_maintablet);

        if(config.orientation == config.ORIENTATION_LANDSCAPE)
            setContentView(R.layout.activity_maintabletdeitada);
    }
}


// Biblioteca SDP:
//https://github.com/intuit/sdp
