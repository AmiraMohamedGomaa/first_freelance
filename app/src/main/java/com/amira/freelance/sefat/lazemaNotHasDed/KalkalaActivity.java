package com.amira.freelance.sefat.lazemaNotHasDed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.amira.freelance.databinding.ActivityKalkalaMainBinding;
import com.amira.freelance.databinding.ActivityMainBinding;

public class KalkalaActivity extends AppCompatActivity {
   ActivityKalkalaMainBinding kalkalaMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        kalkalaMainBinding=ActivityKalkalaMainBinding.inflate(getLayoutInflater());
        setContentView(kalkalaMainBinding.getRoot());

        kalkalaMainBinding.txtQlqalaKobra2.setText("لأن الإنسان يبذل في آدائها مجهود أكبر مما يؤديه في القلقلة الصغرى حيث يقع حرف القلقة بين حرفين متحركين ");
         kalkalaMainBinding.txtNotQalqala.setText("لماذا لا تقلقل حروف قطب جد إذا كانت متحركة رغم انحباس الصوت والنفس؟");
         kalkalaMainBinding.txtNotQalqala2.setText("(1)\tلأن الحركة تعي الحرف قوة فاستغنى عن القلقة بالحركة\n" +
                 "(2)\tلا يحدث إزعاج لجهاز النطق كما في الحروف الساكنة\n");

         kalkalaMainBinding.txtKindChar.setText("الحروف إما ساكنة وإما متحركة:");
         kalkalaMainBinding.txtKindChar2.setText("(1)\tيخرج الحرف المتحرك بالتباعد بين طرفي عضو النطق ويصاحبه انفتاح أو انخفاض أو انضمام\n\n" +
                 "(2)\tيخرج الحرف الساكن بالتصادم بين طوفي عضو النطق أما الحروف المقلقلة الساكنة فقة خالف فيها العرب القاعدة الأم من أنها تخرج بالتصادم\n\n" +
                 "(3)\tنظرا لأنها تسبب إزعاجا لجهاز النطق لشدتها وجهرها فأخرجوها بالتباعد بين طرفي عضو النطق مشبهة بذلك الحروف المتحركة ولكن دون أن يصاحبها إنفتاح للفم أو انضمام للشفتين أو إنخفاض للفك السفلي ولو صاحبها ذلك لأصبحت حروف القلقلة الساكنة متحركة\n\n");

         kalkalaMainBinding.txtConc.setText("ونستنتج من ذلك:");
         kalkalaMainBinding.txtConc2.setText("(1)\tأن حروف القلقلة لا تميل للفتح أو الكسر أو الضم\n\n" +
                 "(2)\tولا تتبع الحرف الذي قبلها أو الذي بعدها\n\n" +
                 "(3)\tوليست ساكنة سكونا محضا ولا متحركة حركة محضة\n\n");
    }
}