package com.example.dogu2.knowledgequiz;

import android.app.Activity;
import android.content.Intent;
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
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity {

    TextView sorulanSoru, dogruCevap, hakk;
    RadioGroup soruGrubu;
    RadioButton cevap1, cevap2, cevap3, cevap4;
    Random random;
    int number;
    ArrayList<String> secenekler;
    public int p1, p2 , p3, p4,skor,kalanHak;
    String sorulan,skorr, kalanHakk;
    boolean dongu=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final questions quiz = new questions();
        Intent intent = new Intent(this, MainActivity.class);
        number=1;
        p1=0;
        p2=1;
        p3=2;
        p4=3;
        skor=0;
        skorr="";
        kalanHak=3;
        kalanHakk="";

        secenekler = new ArrayList<String>();
        sorulanSoru = findViewById(R.id.soru);
        dogruCevap = findViewById(R.id.dogru);
        hakk = findViewById(R.id.hak);
        hakk.setText(Integer.toString(kalanHak));
        soruGrubu = findViewById(R.id.secenekler);
        cevap1 = findViewById(R.id.secenek1);
        cevap2 = findViewById(R.id.secenek2);
        cevap3 = findViewById(R.id.secenek3);
        cevap4 = findViewById(R.id.secenek4);


        secenekler.add(quiz.getCevap(number));
        secenekler.add(quiz.getOthers1(number));
        secenekler.add(quiz.getOthers2(number));
        secenekler.add(quiz.getOthers3(number));
        Collections.shuffle(secenekler);

        sorulanSoru.setText(quiz.getSoru(number));
        cevap1.setText(secenekler.get(p1));
        cevap2.setText(secenekler.get(p2));
        cevap3.setText(secenekler.get(p3));
        cevap4.setText(secenekler.get(p4));


        soruGrubu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton secilen = (RadioButton) soruGrubu.findViewById(soruGrubu.getCheckedRadioButtonId());
                if(secilen.getText().equals(quiz.getCevap(number))) {
                    hakk.setText(kalanHakk);
                    skor++;
                    skorr = Integer.toString(skor);
                    p1=0;
                    p2=1;
                    p3=2;
                    p4=3;
                    secenekler.clear();
                    cevap1.setText("");
                    cevap2.setText("");
                    cevap3.setText("");
                    cevap4.setText("");
                    soruGrubu.clearAnimation();
                    secilen.setChecked(false);
                    number++;
                    sorulanSoru.setText(quiz.getSoru(number));
                    secenekler.add(quiz.getCevap(number));
                    secenekler.add(quiz.getOthers1(number));
                    secenekler.add(quiz.getOthers2(number));
                    secenekler.add(quiz.getOthers3(number));
                    Collections.shuffle(secenekler);
                    cevap1.setText(secenekler.get(p1));
                    cevap2.setText(secenekler.get(p2));
                    cevap3.setText(secenekler.get(p3));
                    cevap4.setText(secenekler.get(p4));
                    dogruCevap.setText("SKOR: "+skorr);
                }else if(!secilen.getText().equals(quiz.getCevap(number))) {
                    kalanHak--;
                    kalanHakk = Integer.toString(kalanHak);
                    hakk.setText(kalanHakk);
                    if(kalanHak <= 0){
                        sorulanSoru.setText("OYUN BİTTİ");
                        cevap1.setEnabled(false);
                        cevap2.setEnabled(false);
                        cevap3.setEnabled(false);
                        cevap4.setEnabled(false);
                    }

                }

            }
        });
    }

    public void delay(){
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
