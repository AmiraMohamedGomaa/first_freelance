package com.amira.freelance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amira.freelance.databinding.ActivityAdgeOfLettersBinding;
import com.amira.freelance.sefat.AridaActivity;
import com.amira.freelance.sefat.SefatActivity;

public class AdgeOfLetters extends AppCompatActivity {
  String t3reef,estlah,benfitCharStuding,typeOfSefat;
    ActivityAdgeOfLettersBinding adgeBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adgeBinding = ActivityAdgeOfLettersBinding.inflate(getLayoutInflater());
        setContentView(adgeBinding.getRoot());

         t3reef="هي ماقام للشيء من معاني سواء كانت حسية أو معنوية.";
         estlah="هي الكيفية التي تحدث للحرف عند خروجه من مخرجه لتمييزه عن غيره.\n";
         benfitCharStuding="فائدة دراسة الحروف:\n" +
                 "1)تمييز الحروف المشتركة في المخرج .\n" +
                 "2)تمييز قوي الحروف من ضعيفها ( لمعرفة ما يدغم ومالا يدغم).\n" +
                 "3)تحسين لفظ الحرف.\n";
         typeOfSefat="تنقسم الصفات إلى قسمين";

         adgeBinding.txtLogatan.setText(estlah);
         adgeBinding.txtEstelah.setText(t3reef);
         adgeBinding.txtInfo.setText(benfitCharStuding);
         adgeBinding.btnSefatlazema.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(AdgeOfLetters.this, SefatActivity.class);
                 startActivity(i);
             }
         });

         adgeBinding.btnSefatAreda.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(AdgeOfLetters.this, AridaActivity.class);
                 startActivity(i);
             }
         });

    }
}