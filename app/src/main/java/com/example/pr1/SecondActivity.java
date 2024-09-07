package com.example.pr1;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    private ImageView animationIV;
    private Button startBtn;
    private Button pauseBtn;
    private AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        animationIV = findViewById(R.id.animImageView);
        startBtn = findViewById(R.id.startButton);
        pauseBtn = findViewById(R.id.pauseButton);
        Button nazad_button = findViewById(R.id.button_nazad);
        frameAnimation = (AnimationDrawable) animationIV.getDrawable();


        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        nazad_button.startAnimation(scaleAnimation);

        startBtn.setOnClickListener(v->{
            if (!frameAnimation.isRunning()) {
                frameAnimation.start();
            }
        });
        pauseBtn.setOnClickListener(v->{
            if (frameAnimation.isRunning()) {
                frameAnimation.stop();
            }
        });

        Button startanim = findViewById(R.id.startButton);
        Animation scaleAnimation1 = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        startanim.startAnimation(scaleAnimation1);

        Button pauseanim = findViewById(R.id.pauseButton);
        Animation scaleAnimation2 = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        pauseanim.startAnimation(scaleAnimation2);

        Button anim = findViewById(R.id.button_nazad);
        Animation scaleAnim = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        anim.startAnimation(scaleAnim);

    }

    public void nazad(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}