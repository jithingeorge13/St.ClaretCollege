package com.example.kaush.stclaretcollege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class generalhome extends AppCompatActivity {


    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generalhome);


        String url = "http://www.claretcollege.edu.in/Principals-message/ ";
        WebView view = (WebView) this.findViewById(R.id.Webview);
        view.getSettings().setDomStorageEnabled(true);
        view.getSettings().setJavaScriptEnabled(true);

        progressBar = (ProgressBar) this.findViewById(R.id.progressBar2);

        view.setVisibility(View.INVISIBLE);

        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        view.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                view.loadUrl("javascript:(function() { " +
                        "document.getElementsByTagName('header')[0].style.display='none'; " +
                        "document.getElementsByTagName('nav')[0].style.display='none'; " +
                        "document.getElementsByClassName('region region-header')[0].style.display='none'; " +
                        "document.getElementsByClassName('col-sm-8 col-md-8')[0].style.display='none'; " +
                        "document.getElementsByClassName('block block-views clearfix')[0].style.height='200px'; " +
                        "document.getElementsByClassName('block block-block clearfix')[0].style.display='none'; " +
                        "document.getElementsByTagName('footer')[0].style.display='none'; " +
                        "document.getElementsByTagName('body')[0].style.margin='0px';" +
                        "document.getElementsByTagName('body')[0].style.padding='0px';" +
                        "document.getElementsByTagName('aside')[0].style.margin='0px';" +
                        "document.getElementsByTagName('aside')[0].style.padding='0px';" +
                        "document.getElementById('block-views-event-calendar-block-1').style.margin='0px';" +
                        "document.getElementById('block-views-event-calendar-block-1').style.height='190px';" +
                        "})()");
                view.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
        view.loadUrl(url);
    }

    public void academics(View view) {
        Intent intent = new Intent(generalhome.this, academics.class);
        startActivity(intent);
    }

    public void admission(View view) {
        Intent intent = new Intent(generalhome.this, admissions.class);
        startActivity(intent);
    }

//    public void gallery(View view) {
//        Intent intent = new Intent(generalhome.this, gallery.class);
//        startActivity(intent);
//    }
//
//    public void website(View view) {
//        Intent intent = new Intent(generalhome.this, contact.class);
//        startActivity(intent);
//    }

//    public void website(View view) {
//        Intent i = new Intent(Intent.ACTION_VIEW,
//                Uri.parse("http://www.claretcollege.edu.in/"));
//        startActivity(i);
//    }
}