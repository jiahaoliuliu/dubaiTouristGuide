package com.jiahaoliuliu.dubaitouristguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TouristGuideActivity extends AppCompatActivity {

    private String[] mTouristAttractionsList = {"Burj Khalifa", "Dubai Mall", "Burj Al Arab",
        "Dubai Fountains", "Aquaventure Waterpark", "Dolphin Bay", "Wild Wadi Water Park"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_guide);

        ListView listView = (ListView)findViewById(R.id.list);

        // Defines a new adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,
                mTouristAttractionsList);

        listView.setAdapter(adapter);
    }
}
