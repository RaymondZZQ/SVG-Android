package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_stop_screen_share extends SVGRenderer {

    public ic_stop_screen_share(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(21.22f, 18.02f);
        mPath.rLineTo(2.0f, 2.0f);
        mPath.lineTo(24.0f, 20.02f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-2.78f, 0f);
        mPath.close();
        mPath.moveTo(21.22f, 18.02f);
        mPath.rMoveTo(0.77f, -2.0f);
        mPath.rLineTo(0.01f, -10.0f);
        mPath.rCubicTo(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.lineTo(7.22f, 4.0200005f);
        mPath.rLineTo(5.23f, 5.23f);
        mPath.rCubicTo(0.18f, -0.04f, 0.36f, -0.07f, 0.55f, -0.1f);
        mPath.lineTo(13.0f, 7.02f);
        mPath.rLineTo(4.0f, 3.73f);
        mPath.rLineTo(-1.58f, 1.47f);
        mPath.rLineTo(5.54f, 5.54f);
        mPath.rCubicTo(0.61f, -0.33f, 1.03f, -0.99f, 1.03f, -1.74f);
        mPath.close();
        mPath.moveTo(21.99f, 16.02f);
        mPath.moveTo(2.39f, 1.73f);
        mPath.lineTo(1.11f, 3.0f);
        mPath.rLineTo(1.54f, 1.54f);
        mPath.rCubicTo(-0.4f, 0.36f, -0.65f, 0.89f, -0.65f, 1.48f);
        mPath.rLineTo(0f, 10.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.lineTo(0.0f, 18.02f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(18.13f, 0f);
        mPath.rLineTo(2.71f, 2.71f);
        mPath.rLineTo(1.27f, -1.27f);
        mPath.lineTo(2.39f, 1.73f);
        mPath.close();
        mPath.moveTo(2.39f, 1.73f);
        mPath.moveTo(7.0f, 15.02f);
        mPath.rCubicTo(0.31f, -1.48f, 0.92f, -2.95f, 2.07f, -4.06f);
        mPath.rLineTo(1.59f, 1.59f);
        mPath.rCubicTo(-1.54f, 0.38f, -2.7f, 1.18f, -3.66f, 2.47f);
        mPath.close();
        mPath.moveTo(7.0f, 15.02f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}