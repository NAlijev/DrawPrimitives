package com.example.nalijev.drawprimitives;

/**
 * Created by NAlijev on 29.09.2015.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;



/**
 * Created by andreyutkin on 17/04/15.
 */
public class DrawLine extends DrawCanvas {

    public DrawLine(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.WHITE);
        mCanvas.drawLine(100, 100, 500, 50, mPaint);
    }

    }