package com.jiahaoliuliu.dubaitouristguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TouristAttraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_attraction);

        TextView title = (TextView) findViewById(R.id.title);
        title.setText("Burj Khalifa 2");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageDrawable(getResources().getDrawable(R.drawable.burj_khalifa_2));
    }
}
