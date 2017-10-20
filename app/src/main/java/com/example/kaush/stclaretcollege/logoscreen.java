package com.example.kaush.stclaretcollege;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class logoscreen extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logoscreen);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent loginintent = new Intent(logoscreen.this, login.class);
            startActivity(loginintent);
            finish();
        }
    }, SPLASH_SCREEN_TIME_OUT);
}
}
