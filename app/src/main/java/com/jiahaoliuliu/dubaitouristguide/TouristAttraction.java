package com.jiahaoliuliu.dubaitouristguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class TouristAttraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_attraction);

        TextView title = (TextView) findViewById(R.id.title);
        String attractionName = getIntent().getStringExtra("name");
        title.setText(attractionName);

        ImageView image = (ImageView) findViewById(R.id.image);
        int imageId = getIntent().getIntExtra("image", 0);
        image.setImageDrawable(getResources().getDrawable(imageId));

        // Displaying the back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Capture the back action
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
