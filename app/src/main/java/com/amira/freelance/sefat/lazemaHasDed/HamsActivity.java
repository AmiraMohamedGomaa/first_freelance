package com.amira.freelance.sefat.lazemaHasDed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.amira.freelance.R;
import com.amira.freelance.databinding.ActivityHamsBinding;
import com.amira.freelance.sefat.model.has_ded_model.Estala;
import com.amira.freelance.sefat.model.has_ded_model.Etbaq;
import com.amira.freelance.sefat.model.has_ded_model.Ezlaq;
import com.amira.freelance.sefat.model.has_ded_model.Hams;
import com.amira.freelance.sefat.model.not_has_ded_model.Estetala;

public class HamsActivity extends AppCompatActivity {
ActivityHamsBinding hamsBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hamsBinding=ActivityHamsBinding.inflate(getLayoutInflater());
        setContentView(hamsBinding.getRoot());

        int check=SefatHasDedActivity.chechHasDed;

        if(check==1){
            hamsBinding.titleTxt1.setText(Estala.title);
            hamsBinding.txtLogatan.setText(Estala.loqtan);
            hamsBinding.txtEstelah.setText(Estetala.estlah);
            hamsBinding.txtHorof.setText(Estala.horof);
            hamsBinding.dalilTxt1.setText(Estala.dalil);
            hamsBinding.textView3.setVisibility(View.GONE);
            ////////////////////////
            hamsBinding.titleTxt2.setText(Estala.title2);
            hamsBinding.txtLogatan2.setText(Estala.loqtan2);
            hamsBinding.txtEstelah2.setText(Estala.estlah2);
            hamsBinding.txtHorof2.setText(Estala.horof2);

        }else if(check==2){
            hamsBinding.titleTxt1.setText(Etbaq.title);
            hamsBinding.txtLogatan.setText(Etbaq.loqtan);
            hamsBinding.txtEstelah.setText(Etbaq.estlah);
            hamsBinding.txtHorof.setText(Etbaq.horof);
            hamsBinding.dalilTxt1.setText(Etbaq.dalil);
            hamsBinding.textView3.setText(Etbaq.text3);
            ////////////////////////
            hamsBinding.titleTxt2.setText(Etbaq.title2);
            hamsBinding.txtLogatan2.setText(Etbaq.loqtan2);
            hamsBinding.txtEstelah2.setText(Etbaq.estlah2);
            hamsBinding.txtHorof2.setText(Etbaq.horof2);

        }else if(check==3){
            hamsBinding.titleTxt1.setText(Hams.title);
            hamsBinding.txtLogatan.setText(Hams.loqtan);
            hamsBinding.txtEstelah.setText(Hams.estlah);
            hamsBinding.txtHorof.setText(Hams.horof);
            hamsBinding.dalilTxt1.setText(Hams.dalil);
            hamsBinding.textView3.setVisibility(View.GONE);
            ////////////////////////
            hamsBinding.titleTxt2.setText(Hams.title2);
            hamsBinding.txtLogatan2.setText(Hams.loqtan2);
            hamsBinding.txtEstelah2.setText(Hams.estlah2);
            hamsBinding.txtHorof2.setText(Hams.horof2);

        }else if(check==4){
            hamsBinding.titleTxt1.setText(Ezlaq.title);
            hamsBinding.txtLogatan.setText(Ezlaq.loqtan);
            hamsBinding.txtEstelah.setText(Ezlaq.estlah);
            hamsBinding.txtHorof.setText(Ezlaq.horof);
            hamsBinding.dalilTxt1.setText(Ezlaq.dalil);
            hamsBinding.textView3.setVisibility(View.GONE);
            ////////////////////////
            hamsBinding.titleTxt2.setText(Ezlaq.title2);
            hamsBinding.txtLogatan2.setText(Ezlaq.loqtan2);
            hamsBinding.txtEstelah2.setText(Ezlaq.estlah2);
            hamsBinding.txtHorof2.setText(Ezlaq.horof2);

        }




    }
}