package com.ohioguidestone.team2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Avatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);



    }

    public void buttonClicked(View view) {
        TextView nameTextBox = findViewById(R.id.textBoxName);
        String userNameStr = nameTextBox.getText().toString();
        if(userNameStr.isEmpty()){
            nameTextBox.setHint("Set a name...");
            return;
        }

        ImageButton clicked = (ImageButton)view;


        // store user information locally
        SharedPreferences.Editor userPrefEditor = getSharedPreferences("Profile", Context.MODE_PRIVATE).edit();

        userPrefEditor.putString("UserName", userNameStr);
        userPrefEditor.putString("Avatar", view.getResources().getResourceName(clicked.getId()));

        userPrefEditor.apply();


        // load next activity
        Intent myIntent = new Intent(this, profilePage2.class);
        startActivity(myIntent);

    }

}
