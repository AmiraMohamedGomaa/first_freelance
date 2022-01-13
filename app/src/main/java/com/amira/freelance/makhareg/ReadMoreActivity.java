package com.amira.freelance.makhareg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;

import com.amira.freelance.databinding.ActivityReadMoreBinding;

public class ReadMoreActivity extends AppCompatActivity {
 ActivityReadMoreBinding readMoreBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        readMoreBinding=ActivityReadMoreBinding.inflate(getLayoutInflater());
        setContentView(readMoreBinding.getRoot());


        Spannable spannable;


        readMoreBinding.txtHorofHagaa.setText("(1)أصلية: 29 حرفا أولهم أ وآخرهم ي.\n" +
                "(2)فرعية: وهي التي تخرج من مخرجين أو تتردد بين حرفين أو صفتين.\n");

        readMoreBinding.txtReadmoreEx.setText("مثال:\n" +
                " الألف الممالة – الألف المفخمة – اللام المغلظة – النون المخفاة – الميم المخفاة – الهمزة المسهلة بين بين – الصاد المشمة زاي – الياء المشمة صوت الواو.\n");

        readMoreBinding.txtMakharegKind.setText("(1)محققة: أي تعتمد على مكان ثابت وأكيد للحرف ونستطيع تحديد مكانه بدقة مثل الحلق واللسان.\n" +
                "(2)مقدرة: لا تعتمد على مكان ثابت وأكيد للحرف ولا نستطيع تحديد مكانه بدقة. مثل مخرج الجوف.\n");

        readMoreBinding.txtHowAswatCome.setText("(1)اصطدام جسمين.\n" +
                "(2)افتراق جسمين\n" +
                "(3)احتكاك جسم بجسم.\n" +
                "(4)النفخ في جسم مجوف.\n" +
                "(5)اهتزاز جسم.\n");



        readMoreBinding.txtSaken.setText("(أ)حروف مد ولين:\n" +
                "ــــَا : قـــاَل (ألف وما قبلها مفتوح)\n" +
                "ــــُو: يقــُول ( واو وما قبلها مضموم)\n" +
                "ـــِي: قـــِيل  (ياء وماقبلها مكسور)\n" +
                "تخرج باهتزاز الأحبال الصوتية  مع:\n" +
                "-انفتاح الفم مع الألف المدية.\n" +
                "-انخفاض للفك مع الياء المدية\n" +
                "-انضمام للشفتين مع الواو المدية.\n" +
                "(ب)غير ذلك: \n" +
                "تخرج بالتصادم بين طرفي عضو النطق");

        readMoreBinding.txtMtharek.setText("يخرج بالتباعد بين طرفي عضو النطق ويصاحبها:\n" +
                "-انفتاح الفم مع الحرف المفتوح.\n" +
                "-انخفاض للفك مع الحرف المكسور.\n" +
                "-انضمام للشفتين مع الحرف المضموم.\n");

        readMoreBinding.txtDalil.setText("تنقسم المخارج إلى خمسة مخارج عامة بها سبعة عشر مخرج خاص ( طبقا لمذهب الامام ابن الجزري).\n" +
                "الدليل من متن الجزرية: \n" +
                "مخارجُ الحروفِ سبعةَ عشرْ   على الذي يختارهُ منِ اختبرْ\n");
    }
}