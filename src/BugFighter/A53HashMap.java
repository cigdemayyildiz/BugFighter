package BugFighter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A53HashMap {

    public static void main(String[] args) {

        // HashMap


        HashMap b = new HashMap(); // HashMap sinifindan b adinda bir object olusturduk. Object ne idi; tanimlanan
        // object isminin basindaki sinifin methodlarina ulasabilmek icin bir yardimci, o siniflara girmek icin birer
        // anahtar.

        // HashMap'de Map'e element eklemek icin, diger Map cesitlerinde oldugu gibi put(); methodunu kullaniyoruz.

        //       K           V
        b.put("Turkiye", "Ankara");
        b.put("Fransa", "Paris");
        b.put("Ingiltere", "Londra");
        b.put("Amerika", "Washington");
        b.put("Ukrayna", "Kiev");

        b.put("Amerika", "Washington D.C"); // Yukarida ayni key ile girilen elementi bir kere daha girmeyi deneyince
        // ikinci elementi ilk elementin uzerine yaziyor.


        // Key ler unique oldugu icin ve Set'te sadece unique olabildigi icin Set'e key ler cevriliyor.

        Set set = b.entrySet(); // tum map icindeki elementleri gosteriyor, keySet(); yalnizca keyleri gosteriyor.
        // enrtySet(); adindan da belli oldugu gibi Set'e ceviriyor.
        // Set Interface inden almak istedigimiz methodlar icin set adinda bir yapi olusturduk ve b isimli objemize
        // entrySet(); methodunu cagirmasini soyledik. entrySet(); methodu Set Interface i icinde oldugu icin Map'i
        // Set'e cevirmek icin bu yontemi kullaniyoruz.

        // Iterator it = b.entrySet().iterator(); --> bu sekilde hepsi bir satirda da olabilir while icinde itr'yi
        // degil it i kullanmak gerekir.

        // Generic olarak olusturmadigimiz icin ForEach kullanamiyoruz, bu nedenle Iterator'la elementlere erisim
        // sagliyoruz.

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry item = (Map.Entry) itr.next();
            System.out.println(item.getKey() + " --> " + item.getValue());
        }
        /*

        b.put("Turkiye", "Ankara");                 Turkiye --> Ankara
        b.put("Fransa", "Paris");                   Fransa --> Paris
        b.put("Ingiltere", "Londra");               Ingiltere --> Londra
        b.put("Amerika", "Washington");             Ukrayna --> Kiev
        b.put("Ukrayna", "Kiev");                   Amerika --> Washington D.C

        Giris sirasi ile vermeme nedeni HashMap

         */
        System.out.println();

        System.out.println(b.size()); // 5
        System.out.println();

        System.out.println(b.values()); // [Ankara, Paris, Londra, Kiev, Washington D.C] --> sadece value elementlerini
        // Collection tipinde yazdirdi.

        System.out.println(b.keySet()); // [Turkiye, Fransa, Ingiltere, Ukrayna, Amerika] --> sadece key elementleri
        // SET tipinde yazdirdi.
        System.out.println();

        System.out.println(b.get("Turkiye")); // Ankara
        System.out.println();


        HashMap<Integer, String> c = new HashMap<>(); // Map iki ayri generic aliyor
        c.put(01, "Adana");
        c.put(06, "Ankara");
        c.put(34, "Istanbul");

        for (Integer key : c.keySet()){ // c isimli Map'in Set'e cevrilmis hali c.keySet(); --> c object i ile
                                        // keySet(); methodunu cagirma
            System.out.println("Key: " + key + " Value: " + c.get(key)); // HashMap'de oldugumuz icin sirasiz sekilde
        }
        System.out.println();

        for (String value : c.values()){
            System.out.println("Value: " + value);
        }






    }
}
