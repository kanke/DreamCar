package com.kanke.dreamcar;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by kanke on 14/12/2015.
 */
public class AudiActivity extends Activity {

    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.audi.co.uk/");

    }
}