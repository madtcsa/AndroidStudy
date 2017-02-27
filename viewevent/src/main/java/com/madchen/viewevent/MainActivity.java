package com.madchen.viewevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text_view).setOnClickListener(this);
        findViewById(R.id.text_view).setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_view:
                Log.d("MainActivity", "----MyTextView onClick----- ");
                break;
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()) {
            case R.id.text_view:
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.d("MainActivity", "----MyTextView onTouch ACTION_DOWN---- ");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.d("MainActivity", "----MyTextView onTouch ACTION_MOVE---- ");
                        break;

                    case MotionEvent.ACTION_UP:
                        Log.d("MainActivity", "----MyTextView onTouch ACTION_UP---- ");
                        break;
                }
                break;
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("MainActivity", "-----onTouchEvent ACTION_DOWN-----");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("MainActivity", "-----onTouchEvent ACTION_UP-----");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("MainActivity", "-----onTouchEvent ACTION_MOVE-----");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d("MainActivity", "-----onTouchEvent ACTION_CANCEL-----");
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("MainActivity", "-----dispatchTouchEvent ACTION_DOWN-----");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("MainActivity", "-----dispatchTouchEvent ACTION_UP-----");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("MainActivity", "-----dispatchTouchEvent ACTION_MOVE-----");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d("MainActivity", "-----dispatchTouchEvent ACTION_CANCEL-----");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }
}
