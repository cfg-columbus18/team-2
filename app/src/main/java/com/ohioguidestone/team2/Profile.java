package com.ohioguidestone.team2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void addFriend(View v){
        TableRow friends = (TableRow)findViewById(R.id.TableRowFriends);
        TableRow tr1 = new TableRow(this);
        tr1.setLayoutParams(new TableLayout.LayoutParams( TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
        TextView textview = new TextView(this);
        textview.setText("test");
        tr1.addView(textview);
        friends.addView(tr1);

    }


    public void nextClick(View v){

        // store user information locally
        SharedPreferences.Editor userPrefEditor = getSharedPreferences("Profile", Context.MODE_PRIVATE).edit();

        String userNameStr = ((TextView)findViewById(R.id.editText)).getText().toString();

        userPrefEditor.putString("UserName", userNameStr);



        // load next activity
        Intent intent = new Intent(Profile.this, profilePage2.class);
        startActivity(intent);
    }

}
