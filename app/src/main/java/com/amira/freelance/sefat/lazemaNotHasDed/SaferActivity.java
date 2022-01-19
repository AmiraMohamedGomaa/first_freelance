package com.amira.freelance.sefat.lazemaNotHasDed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.amira.freelance.databinding.ActivitySaferBinding;
import com.amira.freelance.sefat.model.not_has_ded_model.Enhraf;
import com.amira.freelance.sefat.model.not_has_ded_model.Estetala;
import com.amira.freelance.sefat.model.not_has_ded_model.Gona;
import com.amira.freelance.sefat.model.not_has_ded_model.Khafa;
import com.amira.freelance.sefat.model.not_has_ded_model.Len;
import com.amira.freelance.sefat.model.not_has_ded_model.Safer;
import com.amira.freelance.sefat.model.not_has_ded_model.Tafasi;
import com.amira.freelance.sefat.model.not_has_ded_model.Takrer;

public class SaferActivity extends AppCompatActivity {
 ActivitySaferBinding saferBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        saferBinding=ActivitySaferBinding.inflate(getLayoutInflater());
        setContentView(saferBinding.getRoot());

        int check=SefatNotHasDedActivity.checkSefat;



        if(check==1){
            saferBinding.textView3.setText(Enhraf.title);
            saferBinding.txtLogatan.setText(Enhraf.loqtan);
            saferBinding.txtEstelah.setText(Enhraf.estlah);
            saferBinding.txtHorof.setText(Enhraf.horof);
            saferBinding.txtDalil.setText(Enhraf.dalil2);
            saferBinding.textView33.setText(Enhraf.text3);
            saferBinding.txt4.setVisibility(View.GONE);
            saferBinding.txt42.setVisibility(View.GONE);
            saferBinding.txt5.setVisibility(View.GONE);
            saferBinding.txt52.setVisibility(View.GONE);
            saferBinding.txt62.setVisibility(View.GONE);


        }else if(check==2){
            saferBinding.textView3.setText(Estetala.title);
            saferBinding.txtLogatan.setText(Estetala.loqtan);
            saferBinding.txtEstelah.setText(Estetala.estlah);
            saferBinding.txtHorof.setText(Estetala.horof);
            saferBinding.txtDalil.setText(Estetala.dalil2);
            saferBinding.textView33.setText(Estetala.text3);
            saferBinding.txt4.setText(Estetala.text4);
            saferBinding.txt42.setText(Estetala.text42);
            saferBinding.txt5.setText(Estetala.text5);
            saferBinding.txt52.setText(Estetala.text52);
            saferBinding.txt62.setText(Estetala.text62);

        }else if(check==3){
            saferBinding.textView3.setText(Gona.title);
            saferBinding.txtLogatan.setText(Gona.loqtan);
            saferBinding.txtEstelah.setText(Gona.estlah);
            saferBinding.txtHorof.setText(Gona.horof);
            //saferBinding.txtDalil.setText(Gona.dalil2);
            saferBinding.txtDalil.setVisibility(View.GONE);
            saferBinding.textView33.setText(Gona.text3);
            saferBinding.txt4.setVisibility(View.GONE);
            saferBinding.txt42.setVisibility(View.GONE);
            saferBinding.txt5.setVisibility(View.GONE);
            saferBinding.txt52.setVisibility(View.GONE);
            saferBinding.txt62.setVisibility(View.GONE);


        }else if(check==4){
            saferBinding.textView3.setText(Khafa.title);
            saferBinding.txtLogatan.setText(Khafa.loqtan);
            saferBinding.txtEstelah.setText(Khafa.estlah);
            saferBinding.txtHorof.setText(Khafa.horof);
            saferBinding.txtDalil.setVisibility(View.GONE);
            saferBinding.textView33.setVisibility(View.GONE);
            saferBinding.txt4.setText(Khafa.text4);
            saferBinding.txt42.setText(Khafa.text42);
            saferBinding.txt5.setText(Khafa.text5);
            saferBinding.txt52.setText(Khafa.text52);
            saferBinding.txt62.setVisibility(View.GONE);

        }else if(check==5){
            saferBinding.textView3.setText(Len.title);
            saferBinding.txtLogatan.setText(Len.loqtan);
            saferBinding.txtEstelah.setText(Len.estlah);
            saferBinding.txtHorof.setText(Len.horof);
            saferBinding.txtDalil.setText(Len.dalil2);
            saferBinding.textView33.setVisibility(View.GONE);
            saferBinding.txt4.setVisibility(View.GONE);
            saferBinding.txt42.setVisibility(View.GONE);
            saferBinding.txt5.setVisibility(View.GONE);
            saferBinding.txt52.setVisibility(View.GONE);
            saferBinding.txt62.setVisibility(View.GONE);


        }else if(check==6){
            saferBinding.textView3.setText(Safer.title);
            saferBinding.txtLogatan.setText(Safer.loqtan);
            saferBinding.txtEstelah.setText(Safer.estlah);
            saferBinding.txtHorof.setText(Safer.horof);
            saferBinding.txtDalil.setText(Safer.dalil2);
            saferBinding.textView33.setVisibility(View.GONE);
            saferBinding.txt4.setVisibility(View.GONE);
            saferBinding.txt42.setVisibility(View.GONE);
            saferBinding.txt5.setVisibility(View.GONE);
            saferBinding.txt52.setVisibility(View.GONE);
            saferBinding.txt62.setVisibility(View.GONE);


        }else if(check==7){
            saferBinding.textView3.setText(Tafasi.title);
            saferBinding.txtLogatan.setText(Tafasi.loqtan);
            saferBinding.txtEstelah.setText(Tafasi.estlah);
            saferBinding.txtHorof.setText(Tafasi.horof);
            saferBinding.txtDalil.setText(Tafasi.dalil2);
            saferBinding.textView33.setVisibility(View.GONE);
            saferBinding.txt4.setVisibility(View.GONE);
            saferBinding.txt42.setVisibility(View.GONE);
            saferBinding.txt5.setVisibility(View.GONE);
            saferBinding.txt52.setVisibility(View.GONE);
            saferBinding.txt62.setVisibility(View.GONE);


        }else if(check==8){
            saferBinding.textView3.setText(Takrer.title);
            saferBinding.txtLogatan.setText(Takrer.loqtan);
            saferBinding.txtEstelah.setText(Takrer.estlah);
            saferBinding.txtHorof.setText(Takrer.horof);
            saferBinding.txtDalil.setText(Takrer.dalil2);
            saferBinding.textView33.setText(Takrer.text3);
            saferBinding.txt4.setVisibility(View.GONE);
            saferBinding.txt42.setVisibility(View.GONE);
            saferBinding.txt5.setVisibility(View.GONE);
            saferBinding.txt52.setVisibility(View.GONE);
            saferBinding.txt62.setVisibility(View.GONE);

        }


    }
}