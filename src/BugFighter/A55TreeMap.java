package BugFighter;

import java.util.*;

public class A55TreeMap {

    public static void main(String[] args) {

        // HashMap den tek farki HashMap karisik bir sira ile depoluyor, TreeMap elementleri int tipinde bir elementse
        // kucukten buyuge, alfabetik bir elementse a'dan z'ye depoluyor.

        TreeMap ogrenci = new TreeMap();

        ogrenci.put("Ali", 90);
        ogrenci.put("Veli", 80);
        ogrenci.put("Ahmet", 70);
        ogrenci.put("Ayse", 100);

        // Generic olarak olusturmadigimiz icin ForEach kullanamiyoruz, bu nedenle Iterator'la elementlere erisim
        // sagliyoruz.

        Set set = ogrenci.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry item = (Map.Entry) itr.next();
            System.out.println(item.getKey() + " --> " + item.getValue());
        }
    }
}
