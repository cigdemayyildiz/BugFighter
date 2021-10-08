package BugFighter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class A47LinkedHashSet {

    public static void main(String[] args) {

        // LinkedHashSet<E>

        // Insertion Order
        // Unique Element
        // Null Value

        /*

        LinkedHashSet syntax;

        LinkedHashSet set1 = new LinkedHashSet();
        LinkedHashSet <E> set2 = new LinkedHashSet<E>();
        Set<E> set3 = new LinkedHashSet<>();
        Set set4 = new LinkedHashSet<E>();
        Set <E> set5 = new LinkedHashSet<>();
        Set <E> set6 = new LinkedHashSet<E>();
        */



        // LinkedHashSet'te Set giris sirasi ne ise o sirada olusturuyor. HashSet'te oldugu gibi LinkedHashSet'te
        // null value kabul ediyor. Bir elementten birden fazla giris yapamiyoruz. Diger butun ozellikler ayni.



        LinkedHashSet days = new LinkedHashSet();

        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add(null);

        days.add("Sunday"); // ikinci kere eklenen veri yazdirilmadi cunku bir degeri iki kere yazdirmayi kabul etmiyor.

        days.remove("Friday"); // Friday'i sildik

        days.forEach(item -> System.out.println(item + " ")); // Iterator ile yaptigimiz islemin aynisi ama sadece
        // ekrana yazdirmak icin kullaniliyor, iterator da elementler uzerinde islem yapmaya olanak saglaniyor.

        /*
            Sunday
            Monday
            Tuesday
            Wednesday
            Thursday
            Saturday
            null
         */



        // GENERIC <>

        LinkedHashSet<Integer> link1 = new LinkedHashSet<>();

        link1.add(51);
        link1.add(22);
        link1.add(83);
        link1.add(14);
        link1.add(14); // ayni elementi birden fazla ekleyemiyorsun
        link1.add(null);
        System.out.println(link1); // [51, 22, 83, 14, null] --> insertion order --> hangi sira ile element eklediysek
        // o sira ile gosteriyor


        // [51, 22, 83, 14, null]
        Iterator iter1 = link1.iterator();
        while (iter1.hasNext()){
            System.out.println(iter1.next()); // 51, 22, 83, 14, null
        }


    }
}
