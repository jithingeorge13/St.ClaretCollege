package com.example.kaush.stclaretcollege;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class academics extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_academics);


        String[] courses = getResources().getStringArray(R.array.courses);
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_academics, R.id.label, courses));


    }
}
