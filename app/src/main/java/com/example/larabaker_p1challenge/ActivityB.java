package com.example.larabaker_p1challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityb);
        WebView newWebView = (WebView) findViewById(R.id.aboutALC);
        WebSettings webSettings = newWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        newWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //To open hyperlink in existing WebView
                view.loadUrl(url);
                return false;
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

        newWebView.loadUrl("https://andela.com/alc/");
    }
}
