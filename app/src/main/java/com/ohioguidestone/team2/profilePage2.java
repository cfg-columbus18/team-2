package com.ohioguidestone.team2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.util.*;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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



        for(String header : listDataHeader) {
            SeekBar newSeekBar = new SeekBar(this);
            newSeekBar.setMax(7);
            listDataChild.put(header, newSeekBar);
        }
    }

    public void emotionNextClick(View v){
        //List<Integer> choices = new ArrayList<>();
        int[] choices = new int[5];
        for (int x = 0; x < 5; x++){
            choices[x] = listDataChild.get(listDataHeader.get(x)).getProgress();
        }

        String[] selectedActivities = ActivityRecs.GenerateActivities(choices);


        // load next activity
        Intent myIntent = new Intent(this, ActivitiesPage.class);
        myIntent.putExtra("Suggestions", selectedActivities);
        startActivity(myIntent);

    }
}
