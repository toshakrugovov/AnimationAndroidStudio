package com.example.pr1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pervanimation = findViewById(R.id.button_animation1);
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        pervanimation.startAnimation(scaleAnimation);

        Button vtorayaanimation = findViewById(R.id.button_animation2);
        Animation scaleAnimation2 = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        vtorayaanimation.startAnimation(scaleAnimation2);


    }
    public void animation1(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void animation2(View v) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
