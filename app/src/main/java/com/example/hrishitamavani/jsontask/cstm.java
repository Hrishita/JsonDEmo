package com.example.hrishitamavani.jsontask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hrishita Mavani on 28-11-2017.
 */

public class cstm extends BaseAdapter {
    LayoutInflater inflator;
    Context mainact;
    int resource;
    int[] i;
    String[] s;
    public cstm(Main3Activity main3Activity, int activity_main2, int[] i, String[] s) {
        this.mainact=main3Activity;
        this.s=s;
        this.i=i;
        this.resource=activity_main2;
        inflator=(LayoutInflater)main3Activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return s.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        convertView=inflator.inflate(resource,parent,false);
        TextView txt=(TextView)convertView.findViewById(R.id.tvv);
        txt.setText(s[position]);
        ImageView img=(ImageView)convertView.findViewById(R.id.iv1);
        img.setImageResource(i[position]);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mainact,Main4Activity.class);
                i.putExtra("pos",position);
                mainact.startActivity(i);

            }
        });
        return convertView;
    }
}
