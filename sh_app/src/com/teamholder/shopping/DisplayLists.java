package com.teamholder.shopping;

import android.app.Activity;
import android.os.Bundle;

public class DisplayLists extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //WebView webview = new WebView(this);
        //setContentView(webview);
        //webview.loadUrl("file:///android_asset/html/index.html");
    }
}