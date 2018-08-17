package com.example.dogu2.knowledgequiz;

import java.util.HashMap;

public class questions {

    HashMap<Integer, String> sorular, cevaplar, others1, others2, others3;
    String cevap,other1,other2, other3, soruu;

    public questions() {
        sorular = new HashMap<>();
        sorular.put(1,"Fatih Sultan Mehmet'in babası kimdir?");
        sorular.put(2,"Magna Carta sözleşmesi hangi ülke ile yapılmıştır?");
        sorular.put(3,"Hangisi bir doğal sayıdır?");
        sorular.put(4,"Hangi ülke Asya kıtasındadır ?");
        sorular.put(5,"Hangi hayvan memeli değildir ?");
        sorular.put(6,"Hangisi periyodik tabloda bulunan bir element değildir?");
        sorular.put(7,"Hangisi tarihteki Türk devletlerinden biri değildir?");

        cevaplar = new HashMap<>();
        cevaplar.put(1,"2.Murat");
        cevaplar.put(2,"İngiltere");
        cevaplar.put(3,"0");
        cevaplar.put(4,"Singapur");
        cevaplar.put(5,"Penguen");
        cevaplar.put(6,"Su");
        cevaplar.put(7,"Emevi Devleti");

        others1 = new HashMap<>();
        others1.put(1,"8.Osman");
        others1.put(2,"Almanya");
        others1.put(3,"-7");
        others1.put(4,"Tayland");
        others1.put(5,"Ayı");
        others1.put(6,"Karbon");
        others1.put(7,"Moğol İmparatorluğu");

        others2 = new HashMap<>();
        others2.put(1,"Kanuni Süleyman");
        others2.put(2,"Kanada");
        others2.put(3,"3,14");
        others2.put(4,"Kongo");
        others2.put(5,"Muhabbet Kuşu");
        others2.put(6,"Azot");
        others2.put(7,"Roma İmparatorluğu");

        others3 = new HashMap<>();
        others3.put(1,"5.Süleyman");
        others3.put(2,"İtalya");
        others3.put(3,"0,1");
        others3.put(4,"Rusya");
        others3.put(5,"Yunus");
        others3.put(6,"Krypton");
        others3.put(7,"Çin İmparatorluğu");
    }

    public String getSoru(int sira){
        soruu = sorular.get(sira);
        return soruu;
    }

    public String getCevap(int sira){
        cevap = cevaplar.get(sira);
        return cevap;
    }

    public String getOthers1(int sira){
        other1 = others1.get(sira);
        return other1;
    }

    public String getOthers2(int sira){
        other2 = others2.get(sira);
        return other2;
    }

    public String getOthers3(int sira){
        other3 = others3.get(sira);
        return other3;
    }
}



