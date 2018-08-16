package com.example.dogu2.knowledgequiz;

import android.app.Activity;
import android.graphics.Color;
import android.nfc.NfcAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends Activity {

    TextView sorulanSoru, yanlisCevap, dogruCevap;
    RadioGroup soruGrubu;
    RadioButton cevap1, cevap2, cevap3, cevap4;
    Random random;
    int number;
    List<RadioButton> secenekler;
    int secenek, skor, secenek1, secenek2, secenek3;
    String sorulan,score;
    boolean dongu=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final questions quiz = new questions();

        random = new Random();

        number=0;
        skor=0;

        secenekler = new ArrayList<>();
        sorulanSoru = findViewById(R.id.soru);

        dogruCevap = findViewById(R.id.dogru);

        soruGrubu = findViewById(R.id.secenekler);
        cevap1 = findViewById(R.id.secenek1);
        cevap2 = findViewById(R.id.secenek2);
        cevap3 = findViewById(R.id.secenek3);
        cevap4 = findViewById(R.id.secenek4);

        secenekler.add(cevap1);
        secenekler.add(cevap2);
        secenekler.add(cevap3);
        secenekler.add(cevap4);

        sorulanSoru.setText(quiz.getSoru(number));
        secenek = random.nextInt(secenekler.size());
        secenekler.get(secenek).setText(quiz.getCevap(number));

        soruGrubu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton secilen = (RadioButton) soruGrubu.findViewById(soruGrubu.getCheckedRadioButtonId());
                if(secilen.getText().equals(quiz.getCevap(number))) {
                    secenekler.get(secenek).setText("");
                    secilen.setChecked(false);
                    secenekler.get(secenek).clearAnimation();
                    number++;
                    sorulanSoru.setText(quiz.getSoru(number));
                    secenek = random.nextInt(secenekler.size());
                    secenek1 = random.nextInt(secenekler.size());
                    secenek2 = random.nextInt(secenekler.size());
                    secenek3 = random.nextInt(secenekler.size());
                    secenekler.get(secenek).setText(quiz.getCevap(number));
                    secenekler.get(secenek1).setText(quiz.getCevap(number));
                    secenekler.get(secenek2).setText(quiz.getCevap(number));
                    secenekler.get(secenek3).setText(quiz.getCevap(number));
                }}
        });
    }
        //questions sorucevap = new questions();
        //sorulanSoru.setText(sorucevap.getSoru(number));
        //secenek = random.nextInt(secenekler.size());
        //secenekler.get(secenek).setText(sorucevap.getCevap(number));


}
