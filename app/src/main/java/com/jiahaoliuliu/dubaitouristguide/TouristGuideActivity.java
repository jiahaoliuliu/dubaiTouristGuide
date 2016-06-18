package com.jiahaoliuliu.dubaitouristguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

public class TouristGuideActivity extends AppCompatActivity {

    private String[] mTouristAttractionsList = {"Burj Khalifa", "Dubai Mall", "Burj Al Arab",
        "Dubai Fountains", "Aquaventure Waterpark", "Dolphin Bay", "Wild Wadi Water Park"};

    private int[] mTouristAttractionsImages = {R.drawable.burj_khalifa, R.drawable.dubai_mall,
        R.drawable.burj_al_arab, R.drawable.dubai_fountains, R.drawable.aquaventure_waterpark,
        R.drawable.dolphin_bay, R.drawable.wild_wadi_water_park};

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
        listView.setOnItemClickListener(new ListView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(TouristGuideActivity.this, TouristAttraction.class);
                intent.putExtra("name", mTouristAttractionsList[i]);
                intent.putExtra("image", mTouristAttractionsImages[i]);
                startActivity(intent);
            }
        });
    }
}
