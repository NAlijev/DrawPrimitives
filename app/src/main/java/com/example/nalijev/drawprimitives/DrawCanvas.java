package com.example.nalijev.drawprimitives;

/**
 * Created by NAlijev on 29.09.2015.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by andreyutkin on 17/04/15.
 */
public class DrawCanvas extends View {

    protected Paint mPaint = new Paint();

    public DrawCanvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.MAGENTA);
        mCanvas.drawPaint(mPaint);


    }


}
