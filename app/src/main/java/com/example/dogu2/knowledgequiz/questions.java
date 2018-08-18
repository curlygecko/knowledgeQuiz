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
        cevaplar.put(1,"2.MURAT");
        cevaplar.put(2,"İNGİLTERE");
        cevaplar.put(3,"0");
        cevaplar.put(4,"SİNGAPUR");
        cevaplar.put(5,"PENGUEN");
        cevaplar.put(6,"SU");
        cevaplar.put(7,"EMEVİ DEVLETİ");

        others1 = new HashMap<>();
        others1.put(1,"8.OSMAN");
        others1.put(2,"ALMANYA");
        others1.put(3,"-7");
        others1.put(4,"TÜRKİYE");
        others1.put(5,"AYI");
        others1.put(6,"KARBON");
        others1.put(7,"MOĞOL İMPARATORLUĞU");

        others2 = new HashMap<>();
        others2.put(1,"KİM-JONG-UN");
        others2.put(2,"KANADA");
        others2.put(3,"3,14");
        others2.put(4,"KONGO");
        others2.put(5,"KÖPEK");
        others2.put(6,"AZOT");
        others2.put(7,"ROMA İMPARATORLUĞU");

        others3 = new HashMap<>();
        others3.put(1,"5.SÜLEYMAN");
        others3.put(2,"İTALYA");
        others3.put(3,"0,1");
        others3.put(4,"RUSYA");
        others3.put(5,"YUNUS");
        others3.put(6,"KRYPTON");
        others3.put(7,"ÇİN İMPARATORLUĞU");
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



