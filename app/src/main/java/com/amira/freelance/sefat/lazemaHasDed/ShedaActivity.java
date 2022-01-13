package com.amira.freelance.sefat.lazemaHasDed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.amira.freelance.databinding.ActivityShedaBinding;

public class ShedaActivity extends AppCompatActivity {
   ActivityShedaBinding shedaBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        shedaBinding=ActivityShedaBinding.inflate(getLayoutInflater());
        setContentView(shedaBinding.getRoot());

        shedaBinding.txtQlqalaKobra.setText("تنقسم حروف الشدة إلى ثلاثة أقسام:");
        shedaBinding.txtQlqalaKobra2.setText("الهمزة     -     قطب جد   -   ك / ت");
        shedaBinding.txtNotQalqala.setText(" كيف تتخلص العرب من اجتماع الشدة مع الهمس؟");
        shedaBinding.txtNotQalqala2.setText("( 1) الهمزة: عن طريق الإبدال أو الحذف أو النقل أو التسهيل أو السكت أو التحقيق\n" +
                "( 2) قطب جد: انحباس النفس ( الجهر) +انحباس النفس (الشدة) = القلقلة\n");

        shedaBinding.txtKindChar.setText("لماذا لم تقلقل الهمزة مع حروف \" قطب جد\" رغم اجتماع صفتي الشدة والجهر بها؟");
        shedaBinding.txtKindChar2.setText("( 1) بعد مخرجها \" أقصى الحلق\" فلم تسبب إزعاج في جهاز النطق.\n" +
                "( 2) خلص العرب من شدة وجهر الهمزة بعدة طرق منها النقل والإبدال وغيرها.\n" +
                "( 2) لأن قلقلة الهمزة عطي صوت مستبشع عند العرب كالمتهوع.\n");

        shedaBinding.txtConc.setText("كيف تجتمع الشدة مع الهمس في \" ك / ت\"؟");
        shedaBinding.txtConc2.setText("هما صفتان متعاقبتان: صادم بشدة في المخرج ثم بعيد الشدة مباشرة تكون صفة الهمس. ");

       shedaBinding.txtBeniaQuest.setText("ماهو سبب بينية هذه الحروف دون غيرها؟\n" +
                "طبيعة مخرجها كالتالي:\n");

        shedaBinding.txtMem.setText("الميم\n" +
                "مخرج شفوي: تخرج من الشفتين \" شديد\"\n" +
                "مخرج خيشومي \" الغنة\": تخرج من الخيشوم\n" +
                " \" رخو\"");
        shedaBinding.txtNon.setText("النون: \n" +
                "مخرج لساني: خرج من طرف اللسان الدقيق مع لثة الثنايا العليا \" شديد\"\n" +
                "مخرج خيشومي \" الغنة\"  خرج من الخيشوم \" رخو\"");
        shedaBinding.txtAyn.setText("مخرج العين:\n" +
                "تخرج من وســط الحــلق \n" +
                "*أولاً : جــريــان الصــوت جـريـانا نــاقصـاً \" رخاوة \"\n" +
                "*ثانيا: ثم انحباس الصوت انحباسا ناقصا \" شدة\"");
        shedaBinding.txtRaa.setText("مخرج الراء:\n" +
                "تخرج من طرف اللســان الدقــيق \n" +
                "أدخــل إلى ظهــره مع ما يحـاذيه \n" +
                "مـن لــثة الثنــايــا العليــا  \n" +
                "*انحبـاس الصـوت انحبـاسًا نــاقصــًا     \" شدة \" \n" +
                "*ثـم جـريـان الصـوت جـريـانًا نـاقصـًا \" رخاوة \"");
        shedaBinding.txtLam.setText("مخرج اللام:\n" +
                "تخرج  من أدنى حافتي اللسان إلى المنتهى مع ما يحاذيه \n" +
                "من لثة الأسنان العليا.");

        shedaBinding.txtFinal.setText("فائدة دراسة صفات الرخاوة والبينية والشدة:");
        shedaBinding.txtFinal2.setText("*معـرفــة أن الـزمن الحـرف السـاكـن الــرخــو أطــول\n" +
                "    مـن زمـن الحرف الساكـن البـيـني وهـو أطـول مـن \n" +
                "    زمـن الحـرف السـاكن الشـديد \t\t\n" +
                "* معـرفــة أن الـزمن الحـروف الشـديـدة والبـيـنيـة والـرخوة المتحـركة كلــها متــساويـة فى زمـن الحــركة\n");


    }

}