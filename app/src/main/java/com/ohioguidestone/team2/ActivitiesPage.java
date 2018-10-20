package com.ohioguidestone.team2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class ActivitiesPage extends AppCompatActivity {
    private String[] Suggestions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getIntent().hasExtra("Suggestions")){
            Suggestions = getIntent().getStringArrayExtra("Suggestions");
        }
        RecyclerView myView = findViewById(R.id.activityView);
        myView.setLayoutManager(new LinearLayoutManager(this));
        myView.setAdapter(new MyAdapter());
    }



    public class MyAdapter extends Adapter<MyAdapter.MyViewHolder>{
        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            //inflate view and put inside viewholder
            return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_recycler_view, viewGroup, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
            myViewHolder.text.setText(Suggestions[i]);
        }

        @Override
        public int getItemCount() {
            return 2;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder{

            ImageView image;
            TextView text;

            public MyViewHolder(View view){
                super(view);
                image = view.findViewById(R.id.imageView);
                text = view.findViewById(R.id.textView);

            }
        }
    }

}
