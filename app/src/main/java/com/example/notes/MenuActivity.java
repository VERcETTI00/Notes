package com.example.notes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    private RecyclerView xRecyclerView;
    private RecyclerView.Adapter xAdapter;
    private RecyclerView.LayoutManager xLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);

        ArrayList<CardItems> exampleList = new ArrayList<>();
        exampleList.add(new CardItems("tellus in metus vulputate eu", "20 Apr 2021"));
        exampleList.add(new CardItems("asdfghjksdfghjkfghjkl", "20 Apr 2021"));
        exampleList.add(new CardItems("asdfghjksdfghjkfghjkl", "20 Apr 2021"));
        exampleList.add(new CardItems("asdfghjksdfghjkfghjkl", "20 Apr 2021"));
        exampleList.add(new CardItems("asdfghjksdfghjkfghjkl", "20 Apr 2021"));

        xRecyclerView = findViewById(R.id.recyclerView);
        xRecyclerView.setHasFixedSize(true);
        xLayoutManager = new LinearLayoutManager(this);
        xAdapter = new AdapterActivity(exampleList);

        xRecyclerView.setLayoutManager(xLayoutManager);
        xRecyclerView.setAdapter(xAdapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this,CreateActivity.class));
            }
        });
    }
    private int getTime(){
        int time = (int) (System.currentTimeMillis());
        return time;
    }

}
