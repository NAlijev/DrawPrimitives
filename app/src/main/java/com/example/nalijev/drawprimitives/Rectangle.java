package com.example.nalijev.drawprimitives;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

import android.app.Activity;
import android.os.Bundle;


public class Rectangle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DrawRect rect = new DrawRect(this);
        setContentView(rect);
    }
}

