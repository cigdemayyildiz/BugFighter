package BugFighter;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A54LinkedHashMap {

    public static void main(String[] args) {

        // LinkedHashMap

        // HashMap den tek farki HashMap karisik bir sira ile depoluyor, LinkedHashMap elementlerin giris sirasi ile
        // depoluyor.

        LinkedHashMap ogrenci = new LinkedHashMap();

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
