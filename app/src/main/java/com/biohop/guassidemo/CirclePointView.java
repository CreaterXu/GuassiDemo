package com.biohop.guassidemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016/8/22.
 */
public class CirclePointView extends View{
    public float currentX = 40;
    public float currentY = 50;
    //定义、并创建画笔
    Paint p = new Paint();
    public CirclePointView(Context context) {
        super(context);
    }

    public CirclePointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔的颜色
        p.setColor(Color.RED);
        //绘制一个小球
        canvas.drawCircle(currentX, currentY, 15, p);
    }

    /**
     * 为该组件的触碰事件重写事件处理方法
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //修改currentX、currentY两个属性
        currentX = event.getX();
        currentY = event.getY();
        //通知当前组件重绘自己
        invalidate();
        return true;
    }



}
