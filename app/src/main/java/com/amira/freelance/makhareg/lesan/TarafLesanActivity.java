package com.amira.freelance.makhareg.lesan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amira.freelance.R;
import com.amira.freelance.databinding.ActivityTarafLesanBinding;

public class TarafLesanActivity extends AppCompatActivity {
ActivityTarafLesanBinding tarafLesanBinding;
public static int checkTaraf=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tarafLesanBinding=ActivityTarafLesanBinding.inflate(getLayoutInflater());
        setContentView(tarafLesanBinding.getRoot());

        tarafLesanBinding.textView2.setText("به خمس مخارج خاصة يخرج منهم إحدى عشر حرفا");

        tarafLesanBinding.btnHorofAsalya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkTaraf=1;
                Intent i=new Intent(TarafLesanActivity.this, KindOfTarafLesanActivity.class);
                startActivity(i);
            }
        });

        tarafLesanBinding.btnHorofLethawya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkTaraf=2;
                Intent i=new Intent(TarafLesanActivity.this, KindOfTarafLesanActivity.class);
                startActivity(i);

            }
        });

        tarafLesanBinding.btnHorofNat3ia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkTaraf=3;
                Intent i=new Intent(TarafLesanActivity.this, KindOfTarafLesanActivity.class);
                startActivity(i);

            }
        });

        tarafLesanBinding.btnHorofZalqya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkTaraf=4;
                Intent i=new Intent(TarafLesanActivity.this, KindOfTarafLesanActivity.class);
                startActivity(i);
            }
        });
    }
}