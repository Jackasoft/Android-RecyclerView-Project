package com.example.recyclebin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<FarmTools> items = new ArrayList<>();
        FarmTools farmTools = new FarmTools(10,20,30);
        farmTools.setPanga(13);

        items.add(new FarmTools(10,20,10));
        items.add(new FarmTools(10,20,10));
        items.add(new FarmTools(10,20,10));
        items.add(new FarmTools(10,20,10));
        items.add(new FarmTools(10,20,10));
        items.add(new FarmTools(10,20,10));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}