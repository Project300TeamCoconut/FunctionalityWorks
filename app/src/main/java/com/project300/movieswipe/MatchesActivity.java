package com.project300.movieswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MatchesActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private RecyclerView.Adapter mMatchesAdapter;

    private RecyclerView.LayoutManager mMatchesLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches2);



        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);


        //this will allow us to scroll freely through the recycler view with no hicups
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setHasFixedSize(true);



        //set a linear layout manager
        mMatchesLayoutManager = new LinearLayoutManager(MatchesActivity.this);

        //pass this layout manager to the recycler view
        mRecyclerView.setLayoutManager(mMatchesLayoutManager);


        //adapter
        mMatchesAdapter = new MatchesAdapter(getDataSetMatches(), MatchesActivity.this);


        //set the adapter to the recycler view
        mRecyclerView.setAdapter(mMatchesAdapter);



        for(int i=0; i< 100; i++)
        {
            MatchesObject obj = new MatchesObject("asd");
            resultsMatches.add(obj);
        }


        mMatchesAdapter.notifyDataSetChanged();








    }

    private ArrayList<MatchesObject> resultsMatches = new ArrayList<MatchesObject>();

    private List<MatchesObject> getDataSetMatches() {

        return resultsMatches;

    }
}