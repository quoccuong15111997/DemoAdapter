package com.example.demoadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        lv=findViewById(R.id.lv);
        ArrayList<String> ds= new ArrayList<>();
        adapter= new Adapter(MainActivity.this,R.layout.item,ds);
        for(int i=0;i<30;i++){
            ds.add("qwesasdasdasdaszxcczxczxcv");
        }
        lv.setAdapter(adapter);
    }
}
