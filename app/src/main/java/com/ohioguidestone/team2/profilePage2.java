package com.ohioguidestone.team2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class profilePage2 extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, SeekBar> listDataChild;
    int[] values;

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
        values = new int[5];

        // Adding child data
        listDataHeader.add("Happy");
        listDataHeader.add("Sad");
        listDataHeader.add("Impulsive");
        listDataHeader.add("Anxious");
        listDataHeader.add("Out of Control");

        // Adding child data
        SeekBar happy = new SeekBar(this);
        happy.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                values[0] = (progress/10);
            }
        });


        SeekBar sad = new SeekBar(this);
        //List<SeekBar> sad = new ArrayList<SeekBar>();
        //sad.add((SeekBar)findViewById(R.id.seekBar));
        sad.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                values[1] = (progress/10);
            }
        });

        SeekBar impulsive = new SeekBar(this);
        //List<SeekBar> impulsive = new ArrayList<SeekBar>();
        //impulsive.add((SeekBar)findViewById(R.id.seekBar));
        impulsive.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                values[2] = (progress/10);
            }
        });

        SeekBar anxious = new SeekBar(this);
        //List<SeekBar> anxious = new ArrayList<SeekBar>();
        //anxious.add((SeekBar)findViewById(R.id.seekBar));
        happy.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                values[3] = (progress/10);
            }
        });

        SeekBar control = new SeekBar(this);
        //List<SeekBar> control = new ArrayList<SeekBar>();
        //control.add((SeekBar)findViewById(R.id.seekBar));
        happy.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                values[4] = (progress/10);
            }
        });


        listDataChild.put(listDataHeader.get(0), happy); // Header, Child data
        listDataChild.put(listDataHeader.get(1), sad);
        listDataChild.put(listDataHeader.get(2), impulsive);
        listDataChild.put(listDataHeader.get(3), anxious);
        listDataChild.put(listDataHeader.get(4), control);
    }
}
