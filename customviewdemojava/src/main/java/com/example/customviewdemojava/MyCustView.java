package com.example.customviewdemojava;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;


/**
 * Created by LENOVO on 30/03/2018.
 */


public class MyCustView extends android.support.v7.widget.AppCompatEditText {

    private Paint paint;

    public MyCustView(Context context) {
        super(context);
        ininPaint();
        //Create view using code
    }

    public MyCustView(Context context, AttributeSet set) {
        super(context, set);
        //create view using xml
        ininPaint();
    }

    private void ininPaint() {
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //canvas.drawCircle(20, 20, 30, paint);
        for (int i = 1; i < 2000; i += 20)
            canvas.drawLine(0, 10 + i, 100, 10 + i, paint);
        canvas.drawLine(10, 10, 10, 2000, paint);
    }

   /* @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }*/
}
