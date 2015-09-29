package com.example.nalijev.drawprimitives;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void screenRectangle(View a) {
        Intent goRectangle = new Intent(this, Rectangle.class);
        startActivity(goRectangle);
    }

    public void screenCircle(View a) {
        Intent goCircle = new Intent(this, Circle.class);
        startActivity(goCircle);
    }

    public void screenLine(View a) {
        Intent goLine = new Intent(this, Line.class);
        startActivity(goLine);
    }

    public void screenPicture(View a) {
        Intent goPicture = new Intent(this, Picture.class);
        startActivity(goPicture);
    }

}
