package com.example.kaush.stclaretcollege;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
    EditText uid;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void butclick(View view) {
        Intent intent = new Intent(login.this,academics.class);
        startActivity(intent);
    }

    @TargetApi(21)
    public void loginclick(View view){
        uid = (EditText)findViewById(R.id.userid);
        pass = (EditText)findViewById(R.id.password);

        if (uid.getText().toString().equals("admin") && pass.getText().toString().equals("password")){
            Intent intent = new Intent(login.this,generalhome.class);
            startActivity(intent);
        }
        else{
            uid.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.errorRed));
            pass.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.errorRed));
            pass.setText("");

        }
    }
}