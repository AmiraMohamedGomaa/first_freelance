package com.amira.freelance.makhareg.lesan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.amira.freelance.R;
import com.amira.freelance.databinding.ActivityKindOfTarafLesanBinding;
import com.amira.freelance.makhareg.model.HorofAslia;
import com.amira.freelance.makhareg.model.HorofLethwya;
import com.amira.freelance.makhareg.model.HorofNataia;
import com.amira.freelance.makhareg.model.HorofZalqya;

public class KindOfTarafLesanActivity extends AppCompatActivity {
ActivityKindOfTarafLesanBinding tarafLesanBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tarafLesanBinding=ActivityKindOfTarafLesanBinding.inflate(getLayoutInflater());
        setContentView(tarafLesanBinding.getRoot());


        int check=TarafLesanActivity.checkTaraf;

        if(check!=4){
            tarafLesanBinding.textView52.setVisibility(View.GONE);
            tarafLesanBinding.txtDalil3.setVisibility(View.GONE);
            tarafLesanBinding.txtDalil32.setVisibility(View.GONE);
            tarafLesanBinding.img3.setVisibility(View.GONE);
        }

        if(check==1){
            tarafLesanBinding.textView.setText(HorofAslia.title);
            tarafLesanBinding.txtTa3ref2.setText(HorofAslia.t3ref);
            tarafLesanBinding.textView3.setText(HorofAslia.text3);
            tarafLesanBinding.txtDalil.setText(HorofAslia.dalil);
            tarafLesanBinding.txtDalil2.setText(HorofAslia.dalil2);
            tarafLesanBinding.img.setImageResource(HorofAslia.img);
            tarafLesanBinding.img2.setImageResource(HorofAslia.img2);



        }else if(check==2){
            tarafLesanBinding.textView.setText(HorofLethwya.title);
            tarafLesanBinding.txtTa3ref2.setText(HorofLethwya.t3ref);
            tarafLesanBinding.textView3.setText(HorofLethwya.text3);
            tarafLesanBinding.txtDalil.setText(HorofLethwya.dalil);
            tarafLesanBinding.txtDalil2.setText(HorofLethwya.dalil2);
            tarafLesanBinding.img.setImageResource(HorofLethwya.img);
            tarafLesanBinding.img2.setImageResource(HorofLethwya.img2);


        }else if(check ==3){
            tarafLesanBinding.textView.setText(HorofNataia.title);
            tarafLesanBinding.txtTa3ref2.setText(HorofNataia.t3ref);
            tarafLesanBinding.textView3.setText(HorofNataia.text3);
            tarafLesanBinding.txtDalil.setText(HorofNataia.dalil);
            tarafLesanBinding.txtDalil2.setText(HorofNataia.dalil2);
            tarafLesanBinding.img.setImageResource(HorofNataia.img);
            tarafLesanBinding.img2.setImageResource(HorofNataia.img2);


        }else if(check==4){
            tarafLesanBinding.textView.setText(HorofZalqya.title);
            tarafLesanBinding.txtTa3ref2.setText(HorofZalqya.t3ref);
            tarafLesanBinding.textView3.setText(HorofZalqya.text3);
            tarafLesanBinding.textView3.setTextColor(getResources().getColor(R.color.black));
            tarafLesanBinding.txtDalil.setText(HorofZalqya.dalil);
            tarafLesanBinding.txtDalil2.setText(HorofZalqya.dalil2);
            tarafLesanBinding.img.setImageResource(HorofZalqya.img);
            tarafLesanBinding.img2.setVisibility(View.GONE);
            tarafLesanBinding.textView52.setText(HorofZalqya.text4);
            tarafLesanBinding.txtDalil3.setText(HorofZalqya.dalil3);
            tarafLesanBinding.txtDalil32.setText(HorofZalqya.dalil32);
            tarafLesanBinding.img3.setImageResource(HorofZalqya.img3);

        }
    }
}