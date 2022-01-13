package com.amira.freelance.makhareg.lesan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amira.freelance.R;
import com.amira.freelance.databinding.ActivityLesanBinding;

public class LesanActivity extends AppCompatActivity {
   ActivityLesanBinding lesanBinding;
   public static int lesanCheck=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lesanBinding=ActivityLesanBinding.inflate(getLayoutInflater());
        setContentView(lesanBinding.getRoot());

        lesanBinding.txtTa3ref2.setText("هو عضلة شبه بيضاوية قابلة للانقباض والانبساط ، ثابتة في آخرها متحركة في أولها");
        lesanBinding.textView2.setText("وهو مخرج عام محقق به 10 مخارج خاصة يخرج منهم 18 حرف. ويقسم اللسان إلى 4 مناطق ");
        lesanBinding.img.setImageResource(R.drawable.lesan);

        lesanBinding.btnAqsaLesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lesanCheck=1;
                Intent i=new Intent(LesanActivity.this, KindOfLesanActivity.class);
                startActivity(i);
            }
        });

        lesanBinding.btnHafaLesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lesanCheck=2;
                Intent i=new Intent(LesanActivity.this, KindOfLesanActivity.class);
                startActivity(i);
            }
        });

        lesanBinding.btnTrafLesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LesanActivity.this, TarafLesanActivity.class);
                startActivity(i);
            }
        });

        lesanBinding.btnWasatLesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lesanCheck=3;
                Intent i=new Intent(LesanActivity.this, KindOfLesanActivity.class);
                startActivity(i);
            }
        });

    }
}