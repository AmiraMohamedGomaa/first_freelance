package com.amira.freelance.sefat.lazemaHasDed;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amira.freelance.databinding.ActivitySefatHasDedBinding;

public class SefatHasDedActivity extends AppCompatActivity {
ActivitySefatHasDedBinding sefatHasDedBinding;
public static int chechHasDed=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sefatHasDedBinding=ActivitySefatHasDedBinding.inflate(getLayoutInflater());
        setContentView(sefatHasDedBinding.getRoot());



        sefatHasDedBinding.btnEstala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chechHasDed=1;
              Intent i=new Intent(SefatHasDedActivity.this,HamsActivity.class);
              startActivity(i);
            }
        });

        sefatHasDedBinding.btnEtbaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chechHasDed=2;
                Intent i=new Intent(SefatHasDedActivity.this,HamsActivity.class);
                startActivity(i);
            }
        });

        sefatHasDedBinding.btnHams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chechHasDed=3;
                Intent i=new Intent(SefatHasDedActivity.this,HamsActivity.class);
                startActivity(i);
            }
        });

        sefatHasDedBinding.btnSheda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SefatHasDedActivity.this,ShedaActivity.class);
                startActivity(i);
            }
        });

        sefatHasDedBinding.btnEzlaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chechHasDed=4;
                Intent i=new Intent(SefatHasDedActivity.this,HamsActivity.class);
                startActivity(i);
            }
        });
    }
}