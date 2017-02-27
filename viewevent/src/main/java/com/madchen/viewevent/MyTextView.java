package com.madchen.viewevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by chenwei on 2017/2/23.
 */

public class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("MyTextView", "-----TouchEvent ACTION_DOWN-----");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("MyTextView", "-----TouchEvent ACTION_UP-----");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("MyTextView", "-----TouchEvent ACTION_MOVE-----");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d("MyTextView", "-----TouchEvent ACTION_CANCEL-----");
                break;
        }
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("MyTextView", "-----dispatchTouchEvent ACTION_DOWN-----");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("MyTextView", "-----dispatchTouchEvent ACTION_UP-----");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("MyTextView", "-----dispatchTouchEvent ACTION_MOVE-----");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d("MyTextView", "-----dispatchTouchEvent ACTION_CANCEL-----");
                break;
        }
        return true;
    }
}
