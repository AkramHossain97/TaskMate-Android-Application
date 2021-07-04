package com.example.taskmate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Build;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView SplashScreenView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.white)); //status bar or the time bar at the top
        }

        SplashScreenView = findViewById(R.id.splashScreenVariable);

    }
}