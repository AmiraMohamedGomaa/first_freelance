package com.amira.freelance.makhareg.lesan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.amira.freelance.makhareg.model.AqsaLesan;
import com.amira.freelance.makhareg.model.HafatLesan;
import com.amira.freelance.makhareg.model.WasatLesan;
import com.amira.freelance.databinding.ActivityKindOfLesanBinding;

public class KindOfLesanActivity extends AppCompatActivity {
ActivityKindOfLesanBinding kindOfLesanBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        kindOfLesanBinding=ActivityKindOfLesanBinding.inflate(getLayoutInflater());
        setContentView(kindOfLesanBinding.getRoot());

        //check which button clicked
        int check=LesanActivity.lesanCheck;

        if(check!=2){
            kindOfLesanBinding.img4.setVisibility(View.GONE);
            kindOfLesanBinding.textView62.setVisibility(View.GONE);
            kindOfLesanBinding.txtDalil3.setVisibility(View.GONE);
            kindOfLesanBinding.txtDalil32.setVisibility(View.GONE);
            kindOfLesanBinding.img5.setVisibility(View.GONE);
        }

        if(check==1){
            kindOfLesanBinding.textView.setText(AqsaLesan.title);
            kindOfLesanBinding.txtTa3ref2.setText(AqsaLesan.t3ref);
            kindOfLesanBinding.textView3.setText(AqsaLesan.text3);
            kindOfLesanBinding.img.setImageResource(AqsaLesan.img);
            kindOfLesanBinding.textView4.setText(AqsaLesan.text4);
            kindOfLesanBinding.img2.setImageResource(AqsaLesan.img2);
            kindOfLesanBinding.textView5.setText(AqsaLesan.text5);
            kindOfLesanBinding.textView52.setText(AqsaLesan.text52);
            kindOfLesanBinding.txtDalil.setText(AqsaLesan.dalil);
            kindOfLesanBinding.txtDalil2.setText(AqsaLesan.dalil2);

        }else if(check==2){
            kindOfLesanBinding.textView.setText(HafatLesan.title);
            kindOfLesanBinding.txtTa3ref.setVisibility(View.GONE);
            kindOfLesanBinding.txtTa3ref2.setVisibility(View.GONE);
            kindOfLesanBinding.textView3.setVisibility(View.GONE);
            kindOfLesanBinding.img.setVisibility(View.GONE);
            kindOfLesanBinding.textView4.setVisibility(View.GONE);
            kindOfLesanBinding.img2.setVisibility(View.GONE);
            kindOfLesanBinding.textView5.setText(HafatLesan.text5);
            kindOfLesanBinding.textView52.setText(HafatLesan.text52);
            kindOfLesanBinding.txtDalil.setText(HafatLesan.dalil);
            kindOfLesanBinding.txtDalil2.setText(HafatLesan.dalil2);
            kindOfLesanBinding.img4.setImageResource(HafatLesan.img4);
            kindOfLesanBinding.textView62.setText(HafatLesan.text62);
            kindOfLesanBinding.txtDalil3.setText(HafatLesan.dalil3);
            kindOfLesanBinding.txtDalil32.setText(HafatLesan.dalil32);
            kindOfLesanBinding.img5.setImageResource(HafatLesan.img5);



        }else if(check==3){
            kindOfLesanBinding.textView.setText(WasatLesan.title);
            kindOfLesanBinding.txtTa3ref.setVisibility(View.GONE);
            kindOfLesanBinding.txtTa3ref2.setText(WasatLesan.t3ref);
            kindOfLesanBinding.textView3.setVisibility(View.GONE);
            kindOfLesanBinding.img.setImageResource(WasatLesan.img);
            kindOfLesanBinding.textView4.setVisibility(View.GONE);
            kindOfLesanBinding.img2.setImageResource(WasatLesan.img2);
            kindOfLesanBinding.textView5.setText(WasatLesan.text5);
            kindOfLesanBinding.textView52.setText(WasatLesan.text52);
            kindOfLesanBinding.txtDalil.setText(WasatLesan.dalil);
            kindOfLesanBinding.txtDalil2.setText(WasatLesan.dalil2);


        }

    }
}