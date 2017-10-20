package com.example.kaush.stclaretcollege;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class staff extends AppCompatActivity {

    Integer[] iconids = {
            R.drawable.tablet,
            R.drawable.noticeboard,
            R.drawable.marks,
            R.drawable.question,
            R.drawable.gallery,
            R.drawable.job
    };
    String[] label={
            "Attendance",
            "Notice Board",
            "Report Card",
            "Question Paper",
            "Gallery",
            "Job"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        GridView gv=(GridView)findViewById(R.id.gridview);

        gv.setAdapter(new Iconadapter(this));
    }
    public class Iconadapter extends BaseAdapter
    {
        private Context context;

        public  Iconadapter(Context ctx)
        {
            context=ctx;
        }

        @Override
        public int getCount() {
            return iconids.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1;
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if (view==null) {
                view1 = new View(context);
                view1 = inflater.inflate(R.layout.single, null);
                TextView tv = (TextView) view1.findViewById(R.id.grid_text);
                ImageView iv = (ImageView) view1.findViewById(R.id.grid_image);

                iv.setImageResource(iconids[i]);
                tv.setText(label[i]);
            }
            else
            {
                view1=view;
            }

            return view1;
        }
    }
}