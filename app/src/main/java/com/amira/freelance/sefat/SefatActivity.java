package com.amira.freelance.sefat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amira.freelance.sefat.lazemaNotHasDed.SefatNotHasDedActivity;
import com.amira.freelance.databinding.ActivitySefatBinding;
import com.amira.freelance.sefat.lazemaHasDed.SefatHasDedActivity;

public class SefatActivity extends AppCompatActivity {
     ActivitySefatBinding activitySefatBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySefatBinding=ActivitySefatBinding.inflate(getLayoutInflater());
        setContentView(activitySefatBinding.getRoot());

        String t3refSefat="وهي التي تلازم الحرف ولا تنفك عنه بأي حال من الأحوال";
        activitySefatBinding.textView2.setText(t3refSefat);

        activitySefatBinding.btnHasDed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SefatActivity.this, SefatHasDedActivity.class);
                startActivity(i);
            }
        });


        activitySefatBinding.btnNotHasDed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SefatActivity.this, SefatNotHasDedActivity.class);
                startActivity(i);
            }
        });
    }
}