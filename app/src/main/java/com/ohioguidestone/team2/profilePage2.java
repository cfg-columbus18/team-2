package com.ohioguidestone.team2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class profilePage2 extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, SeekBar> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page2);

        expListView = (ExpandableListView) findViewById(R.id.emotion);

        createListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);
    }

    private void createListData(){
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, SeekBar>();

        // Adding child data
        listDataHeader.add("Happy");
        listDataHeader.add("Sad");
        listDataHeader.add("Impulsive");
        listDataHeader.add("Anxious");
        listDataHeader.add("Out of Control");s

        // Adding child data
        SeekBar happy = new SeekBar(this);

        SeekBar sad = new SeekBar(this);
        //List<SeekBar> sad = new ArrayList<SeekBar>();
        //sad.add((SeekBar)findViewById(R.id.seekBar));


        SeekBar impulsive = new SeekBar(this);
        //List<SeekBar> impulsive = new ArrayList<SeekBar>();
        //impulsive.add((SeekBar)findViewById(R.id.seekBar));

        SeekBar anxious = new SeekBar(this);
        //List<SeekBar> anxious = new ArrayList<SeekBar>();
        //anxious.add((SeekBar)findViewById(R.id.seekBar));

        SeekBar control = new SeekBar(this);
        //List<SeekBar> control = new ArrayList<SeekBar>();
        //control.add((SeekBar)findViewById(R.id.seekBar));

        listDataChild.put(listDataHeader.get(0), happy); // Header, Child data
        listDataChild.put(listDataHeader.get(1), sad);
        listDataChild.put(listDataHeader.get(2), impulsive);
        listDataChild.put(listDataHeader.get(3), anxious);
        listDataChild.put(listDataHeader.get(4), control);
    }
}
