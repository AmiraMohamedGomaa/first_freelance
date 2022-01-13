package com.amira.freelance.makhareg;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.amira.freelance.databinding.ActivityMakharegBinding;
import com.amira.freelance.makhareg.lesan.LesanActivity;

public class MakharegActivity extends AppCompatActivity {
   ActivityMakharegBinding makharegBinding;
   public static int check=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        makharegBinding=ActivityMakharegBinding.inflate(getLayoutInflater());
        setContentView(makharegBinding.getRoot());


        makharegBinding.btnReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MakharegActivity.this,ReadMoreActivity.class);
                startActivity(i);
            }
        });

        makharegBinding.btnGawf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check=3;
                Intent i=new Intent(MakharegActivity.this,KindOfMakharegActivity.class);
                startActivity(i);
            }
        });

        makharegBinding.btnHalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check=2;
                Intent i=new Intent(MakharegActivity.this,KindOfMakharegActivity.class);
                startActivity(i);
            }
        });


        makharegBinding.btnKheshom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check=1;
                Intent i=new Intent(MakharegActivity.this,KindOfMakharegActivity.class);
                startActivity(i);

            }
        });

        makharegBinding.btnLsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MakharegActivity.this, LesanActivity.class);
                startActivity(i);
            }
        });

        makharegBinding.btnShefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check=4;
                Intent i=new Intent(MakharegActivity.this,KindOfMakharegActivity.class);
                startActivity(i);
            }
        });
    }
}