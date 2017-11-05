package com.example.kaush.stclaretcollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class admissions extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissions);

        String url = "http://www.claretcollege.edu.in/Admission";
        WebView view=(WebView) this.findViewById(R.id.admissions);
        view.getSettings().setDomStorageEnabled(true);
        view.getSettings().setJavaScriptEnabled(true);


        progressBar = (ProgressBar) this.findViewById(R.id.progressBar3);

        view.setVisibility(View.INVISIBLE);

//        view.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return true;
//            }
//        });

        view.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                view.loadUrl("javascript:(function() { " +
                        "document.getElementsByTagName('header')[0].style.display='none'; " +
                        "document.getElementsByTagName('nav')[0].style.display='none'; " +
                        "document.getElementsByClassName('region region-header')[0].style.display='none'; " +
                        "document.getElementsByClassName('breadcrumb')[0].style.display='none'; " +
                        "document.getElementsByClassName('region region-sidebar-second')[0].style.display='none'; " +
                        "document.getElementsByTagName('footer')[0].style.display='none'; " +


                        "})()");
                view.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
        view.loadUrl(url);
    }

}
