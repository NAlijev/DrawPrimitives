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
public class DrawRect extends DrawCanvas {

    public DrawRect(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.GRAY);
        mCanvas.drawRect(10, 10, 200, 250, mPaint);
    }

}
