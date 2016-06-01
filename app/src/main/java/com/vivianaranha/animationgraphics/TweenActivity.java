package com.vivianaranha.animationgraphics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class TweenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
    }

    public void animateMe(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.tween_animation);
        view.startAnimation(animation);
    }
}
