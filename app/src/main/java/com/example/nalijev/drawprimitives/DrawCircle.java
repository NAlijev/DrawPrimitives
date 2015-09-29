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
public class DrawCircle extends DrawCanvas {

    public DrawCircle(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.GRAY);
        mCanvas.drawCircle(100, 200, 50, mPaint);
    }

}
