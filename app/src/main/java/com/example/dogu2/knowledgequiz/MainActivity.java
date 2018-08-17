package com.example.dogu2.knowledgequiz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity {

    TextView sorulanSoru, dogruCevap, hakk;
    RadioGroup soruGrubu;
    RadioButton cevap1, cevap2, cevap3, cevap4;
    ArrayList<String> secenekler;
    int p1, p2 , p3, p4,skor,kalanHak, number;
    String skorr, kalanHakk;

    @Override
    public void recreate() {
        super.recreate();
    }

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
        hakk.setText("HAK: "+Integer.toString(kalanHak));
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
                    hakk.setText("HAK: "+kalanHakk);
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
                    hakk.setText("HAK: " + kalanHakk);
                }
                if(kalanHak <= 0){
                    Intent intent = new Intent(MainActivity.this, gameOver.class);
                    intent.putExtra("deneme", Integer.toString(skor).toString());
                    startActivity(intent);
                    }

            }
        });
    }

    public void delay(){
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
