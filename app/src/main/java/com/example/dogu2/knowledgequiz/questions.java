package com.example.dogu2.knowledgequiz;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class questions {

    ArrayList<String> sorular, cevaplar, soru1;
    String soruu;
    String cevap;

    public questions() {
        sorular = new ArrayList<String>();
        sorular.add("Fatih Sultan Mehmet'in babası kimdir?");
        sorular.add("Magna Carta sözleşmesi hangi ülke ile yapılmıştır?");
        sorular.add("Hangisi bir doğal sayıdır?");
        sorular.add("Hangi ülke Asya kıtasındadır ?");
        sorular.add("Hangi hayvan memeli değildir ?");
        sorular.add("Hangisi periyodik tabloda bulunan bir element değildir?");
        sorular.add("Hangisi tarihteki Türk devletlerinden biri değildir?");

        cevaplar = new ArrayList<String>();
        cevaplar.add("2.Murat");
        cevaplar.add("İngiltere");
        cevaplar.add("0");
        cevaplar.add("Singapur");
        cevaplar.add("Penguen");
        cevaplar.add("Su");
        cevaplar.add("Emevi Devleti");


    }

    public String getSoru(int sira){
        if(sira >= sorular.size()){
            return  "OYUN BİTTİ";
        }else
            soruu = sorular.get(sira);
            return soruu;
    }

    public String getCevap(int sira){
        if(sira >= cevaplar.size()){
           return  "OYUN BİTTİ";
        }else
            cevap = cevaplar.get(sira);
            return cevap;
    }
}



