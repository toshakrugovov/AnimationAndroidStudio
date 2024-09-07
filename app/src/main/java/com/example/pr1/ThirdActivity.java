package com.example.pr1;

import android.content.Intent;
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

public class ThirdActivity extends AppCompatActivity {

    private ImageView img;
    private Button startBtn;
    private Button pauseBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button nazad_button = findViewById(R.id.button_exit);
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        nazad_button.startAnimation(scaleAnimation);

        img=findViewById(R.id.img_blink);
        startBtn=findViewById(R.id.start_tween);
        pauseBtn=findViewById(R.id.pause_tween);

        Animation blinkAnimation= AnimationUtils.loadAnimation(this,R.anim.blink_animation);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(blinkAnimation);
            }
        });
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.clearAnimation();
            }
        });

        Button startanim = findViewById(R.id.start_tween);
        Animation scaleAnimation1 = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        startanim.startAnimation(scaleAnimation1);

        Button pauseanim = findViewById(R.id.pause_tween);
        Animation scaleAnimation2 = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        pauseanim.startAnimation(scaleAnimation2);

        Button anim = findViewById(R.id.button_exit);
        Animation scaleAnim = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        anim.startAnimation(scaleAnim);

    }

    public void nazad(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}