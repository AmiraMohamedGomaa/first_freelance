package com.amira.freelance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.amira.freelance.databinding.ActivityMainBinding;
import com.amira.freelance.makhareg.MakharegActivity;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);

        Thread splThread=new Thread(){
         @Override
         public void run() {
             try {
                 mainBinding.profileImage.startAnimation(animation);
                 sleep(3000);
                 Intent i=new Intent(MainActivity.this,CheckActivity.class);
                 startActivity(i);
                 finish();
             }catch (Exception e){
                 e.getMessage();
             }
         }
     };
     splThread.start();


    }

}