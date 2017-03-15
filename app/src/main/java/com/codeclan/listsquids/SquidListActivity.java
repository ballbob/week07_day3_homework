package com.codeclan.listsquids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SquidListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squid_list);

        SquidLister heavySquids = new SquidLister();
        ArrayList<Squid> list = heavySquids.getList();

        SquidListerAdapter squidAdapter = new SquidListerAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(squidAdapter);
    }
}
