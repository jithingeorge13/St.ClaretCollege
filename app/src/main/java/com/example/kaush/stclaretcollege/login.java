package com.example.kaush.stclaretcollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void butclick(View view) {
        Intent intent = new Intent(login.this,generalhome.class);
        startActivity(intent);
    }
}
