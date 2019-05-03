package com.example.demoadapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<String> {
    Activity mContext;
    ArrayList<String> data;
    int resource;

    public Adapter(Context context, int resource,ArrayList<String> objects) {
        super(context, resource, objects);
        this.data=objects;
        this.mContext= (Activity) context;
        this.resource=resource;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        LayoutInflater layoutInflater=mContext.getLayoutInflater();
        convertView=layoutInflater.inflate(resource,null);

        TextView txt=convertView.findViewById(R.id.txt);
        CheckBox chk=convertView.findViewById(R.id.chk);
        String s=data.get(position);
        txt.setText(s);
        return convertView;
    }
}
