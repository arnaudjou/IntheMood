package com.example.nono.inthemood.controller;

import android.app.Activity;

import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.example.nono.inthemood.R;


public class MainActivity extends Activity implements OnGestureListener {

    GestureDetector gestureScanner;
    ImageButton happy = findViewById(R.id.View1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureScanner = new GestureDetector(this);
        findViewById(R.id.View1).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return gestureScanner.onTouchEvent(event);
            }
        });

    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onFling (MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.i("Test", "On Fling");
        return false;
    }

    @Override
    public void onLongPress (MotionEvent e){

    }

    @Override
    public boolean onScroll (MotionEvent e1, MotionEvent e2, float distanceX, float distanceY){

        return true;
    }

    @Override
    public void onShowPress(MotionEvent e){

    }
   @Override
   public boolean onSingleTapUp (MotionEvent e){
        return false;
   }

}
