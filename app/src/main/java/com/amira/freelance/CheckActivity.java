package com.amira.freelance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amira.freelance.databinding.ActivityCheckBinding;
import com.amira.freelance.makhareg.MakharegActivity;

public class CheckActivity extends AppCompatActivity {
ActivityCheckBinding checkBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkBinding=ActivityCheckBinding.inflate(getLayoutInflater());
        setContentView(checkBinding.getRoot());

        checkBinding.btnMakhareg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CheckActivity.this, MakharegActivity.class);
                startActivity(i);
            }
        });
        checkBinding.btnSefat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CheckActivity.this,AdgeOfLetters.class);
                startActivity(i);
            }
        });
    }
}