package com.amira.freelance.sefat.lazemaNotHasDed;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amira.freelance.databinding.ActivitySefatLazemaBinding;

public class SefatNotHasDedActivity extends AppCompatActivity {
   ActivitySefatLazemaBinding activitySefatNotHasDedBinding;
   public static int checkSefat=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySefatNotHasDedBinding=ActivitySefatLazemaBinding.inflate(getLayoutInflater());
        setContentView(activitySefatNotHasDedBinding.getRoot());

        activitySefatNotHasDedBinding.btnEnhraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkSefat=1;
                Intent i=new Intent(SefatNotHasDedActivity.this,SaferActivity.class);
                startActivity(i);
            }
        });

        activitySefatNotHasDedBinding.btnEstetala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkSefat=2;
                Intent i=new Intent(SefatNotHasDedActivity.this,SaferActivity.class);
                startActivity(i);
            }
        });

        activitySefatNotHasDedBinding.btnGonaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkSefat=3;
                Intent i=new Intent(SefatNotHasDedActivity.this,SaferActivity.class);
                startActivity(i);
            }
        });

        activitySefatNotHasDedBinding.btnKalkala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SefatNotHasDedActivity.this,KalkalaActivity.class);
                startActivity(i);
            }
        });

        activitySefatNotHasDedBinding.btnKhfaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkSefat=4;
                Intent i=new Intent(SefatNotHasDedActivity.this,SaferActivity.class);
                startActivity(i);
            }
        });

        activitySefatNotHasDedBinding.btnLen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkSefat=5;
                Intent i=new Intent(SefatNotHasDedActivity.this,SaferActivity.class);
                startActivity(i);
            }
        });

        activitySefatNotHasDedBinding.btnSafer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkSefat=6;
                Intent i=new Intent(SefatNotHasDedActivity.this,SaferActivity.class);
                startActivity(i);
            }
        });

        activitySefatNotHasDedBinding.btnTafashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkSefat=7;
                Intent i=new Intent(SefatNotHasDedActivity.this,SaferActivity.class);
                startActivity(i);
            }
        });
        activitySefatNotHasDedBinding.btnTakrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkSefat=8;
                Intent i=new Intent(SefatNotHasDedActivity.this,SaferActivity.class);
                startActivity(i);
            }
        });
    }
}