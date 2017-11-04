package com.example.kaush.stclaretcollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class generalhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generalhome);


        String url = "http://www.claretcollege.edu.in/Principals-message/";
        WebView view=(WebView) this.findViewById(R.id.Webview);
        view.getSettings().setDomStorageEnabled(true);
        view.getSettings().setJavaScriptEnabled(true);


        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        view.loadUrl(url);
        view.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                view.loadUrl("javascript:(function() { " +
                        "document.getElementsByTagName('header')[0].style.display='none'; " +
                        "})()");
                view.loadUrl("javascript:(function() { " +
                        "document.getElementsByTagName('nav')[0].style.display='none'; " +
                        "})()");
                view.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('region region-header')[0].style.display='none'; " +
                        "})()");
                view.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('col-sm-8 col-md-8')[0].style.display='none'; " +
                        "})()");
                view.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('block block-views clearfix')[0].style.height='200px'; " +
                        "})()");
                view.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('block block-block clearfix')[0].style.display='none'; " +
                        "})()");
                view.loadUrl("javascript:(function() { " +
                        "document.getElementsByTagName('footer')[0].style.display='none'; " +
                        "})()");
            }
        });

    }
}
