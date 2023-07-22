package com.yousef.food_hub_final_project.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.yousef.food_hub_final_project.R;

public class Splash extends AppCompatActivity {

    private  static  int SPLASH_SCREEN =2500;

    ImageView imageView ,imageViewTxt;
    Animation top, bottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        imageView = findViewById(R.id.imageView);
        imageViewTxt = findViewById(R.id.imageViewTxt);


        top = AnimationUtils.loadAnimation(this, R.anim.top);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom);
        imageView.setAnimation(top);
        imageViewTxt.setAnimation(bottom);
        imageViewTxt.setAnimation(bottom);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {

                Intent intent = new Intent(Splash.this, Onboarding_one.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}