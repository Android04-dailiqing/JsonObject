package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SencondActivity extends AppCompatActivity  {
    private ListView  list;
    private ArrayList data;
    private MyAdapter mAdapter;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sencond);

        list = (ListView) findViewById(R.id.listView);
        data = new ArrayList();
        mAdapter = new MyAdapter();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        list.setAdapter(mAdapter);

    }



    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return data.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            if (convertView == null) {
                convertView = View.inflate(SencondActivity.this, R.layout.item, null);
            }
            TextView tv = (TextView) convertView.findViewById(R.id.tv_show);

            tv.setText(data.get(position).toString());

            return convertView;
        }
    }

}
