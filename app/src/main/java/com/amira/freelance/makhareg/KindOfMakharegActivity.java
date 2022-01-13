package com.amira.freelance.makhareg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.amira.freelance.databinding.ActivityKindOfMakharegBinding;
import com.amira.freelance.makhareg.model.Gawf;
import com.amira.freelance.makhareg.model.Halq;
import com.amira.freelance.makhareg.model.Kheshom;
import com.amira.freelance.makhareg.model.Shefaten;

public class KindOfMakharegActivity extends AppCompatActivity {
ActivityKindOfMakharegBinding kindOfMakharegBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        kindOfMakharegBinding=ActivityKindOfMakharegBinding.inflate(getLayoutInflater());
        setContentView(kindOfMakharegBinding.getRoot());


       int check =MakharegActivity.check;

       if(check!=4){
           kindOfMakharegBinding.textView5.setVisibility(View.GONE);
           kindOfMakharegBinding.textView52.setVisibility(View.GONE);
           kindOfMakharegBinding.txtDalil3.setVisibility(View.GONE);
           kindOfMakharegBinding.txtDalil32.setVisibility(View.GONE);
           kindOfMakharegBinding.img2.setVisibility(View.GONE);
           kindOfMakharegBinding.img3.setVisibility(View.GONE);
           kindOfMakharegBinding.img4.setVisibility(View.GONE);

       }

       if(check==1){
           kindOfMakharegBinding.textView.setText(Kheshom.title);
           kindOfMakharegBinding.txtTa3ref2.setText(Kheshom.t3ref);
           kindOfMakharegBinding.img.setImageResource(Kheshom.img);
           kindOfMakharegBinding.txtDalil.setText(Kheshom.dalil);
           kindOfMakharegBinding.txtDalil2.setText(Kheshom.dalil2);
           kindOfMakharegBinding.textView3.setVisibility(View.GONE);
           kindOfMakharegBinding.textView32.setVisibility(View.GONE);
           kindOfMakharegBinding.textView4.setVisibility(View.GONE);
           kindOfMakharegBinding.textView42.setVisibility(View.GONE);


       }else if(check==2){
           kindOfMakharegBinding.textView.setText(Halq.title);
           kindOfMakharegBinding.txtTa3ref2.setText(Halq.t3ref);
           kindOfMakharegBinding.img.setImageResource(Halq.img);
           kindOfMakharegBinding.txtDalil.setText(Halq.dalil);
           kindOfMakharegBinding.txtDalil2.setText(Halq.dalil2);
           kindOfMakharegBinding.textView3.setText(Halq.text3);
           kindOfMakharegBinding.textView32.setText(Halq.text32);
           kindOfMakharegBinding.textView4.setText(Halq.text4);
           kindOfMakharegBinding.textView42.setVisibility(View.GONE);

       }else if (check==3){
           kindOfMakharegBinding.textView.setText(Gawf.title);
           kindOfMakharegBinding.txtTa3ref2.setText(Gawf.t3ref);
           kindOfMakharegBinding.img.setVisibility(View.GONE);
           kindOfMakharegBinding.txtDalil.setText(Gawf.dalil);
           kindOfMakharegBinding.txtDalil2.setText(Gawf.dalil2);
           kindOfMakharegBinding.textView3.setText(Gawf.text3);
           kindOfMakharegBinding.textView32.setText(Gawf.text32);
           kindOfMakharegBinding.textView4.setText(Gawf.text4);
           kindOfMakharegBinding.textView42.setText(Gawf.text42);

       }else if(check==4){
           kindOfMakharegBinding.textView.setText(Shefaten.title);
           kindOfMakharegBinding.txtTa3ref2.setText(Shefaten.t3ref);
           kindOfMakharegBinding.img.setImageResource(Shefaten.img);
           kindOfMakharegBinding.txtDalil.setText(Shefaten.dalil);
           kindOfMakharegBinding.txtDalil2.setText(Shefaten.dalil2);
           kindOfMakharegBinding.textView3.setText(Shefaten.text3);
           kindOfMakharegBinding.textView32.setVisibility(View.GONE);
           kindOfMakharegBinding.textView4.setText(Shefaten.text4);
           kindOfMakharegBinding.textView42.setText(Shefaten.text42);
           kindOfMakharegBinding.textView5.setText(Shefaten.text5);
           kindOfMakharegBinding.textView52.setText(Shefaten.text52);
           kindOfMakharegBinding.txtDalil3.setText(Shefaten.dalil3);
           kindOfMakharegBinding.txtDalil32.setText(Shefaten.dalil32);
           kindOfMakharegBinding.img2.setImageResource(Shefaten.img2);
           kindOfMakharegBinding.img3.setImageResource(Shefaten.img3);
           kindOfMakharegBinding.img4.setImageResource(Shefaten.img4);



       }
    }
}