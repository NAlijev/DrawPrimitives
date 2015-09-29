package com.example.nalijev.drawprimitives;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by NAlijev on 29.09.2015.dsdasdasdasdasda
 */



public class Picture extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mImageView;
        mImageView = (ImageView) findViewById(R.id.imageView1);

        mImageView.setImageResource(R.drawable.android);

    }
}
