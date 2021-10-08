package BugFighter;

import java.util.*;

public class A48TreeSet {

    public static void main(String[] args) {

        // TreeSet

        // Ascending Order
        // Unique Element
        // No Null Value

        /*

        TreeSet syntax;

        TreeSet set1 = new TreeSet();
        TreeSet <E> set2 = new TreeSet<E>();
        Set<E> set3 = new TreeSet<>();
        Set set4 = new TreeSet<E>();
        Set <E> set5 = new TreeSet<>();
        Set <E> set6 = new TreeSet<E>();
        */


        // TreeSet'te Set olusturuldugunda Set sayisal degerleri olan elementlerde kucukten buyuge, alfabetik degerleri
        // olan elementlerde ise a'dan z'ye seklinde siralaniyor. Her element bir kere girilebiliyor ve TreeSet'te
        // HashSet ve LinkedHashSet'ten farkli olarak null value girisi yapilamiyor. Diger butun ozellikler ayni.



        TreeSet t = new TreeSet();

        t.add(90);
        t.add(34);
        t.add(54);
        t.add(98);
        t.add(3);
        t.add(18);
        // t.add(null); null veri ekleyemiyoruz.

        t.forEach(item -> System.out.println(item));



        // GENERIC<>

        /*
        TreeSet<Byte> t1 = new TreeSet<>();
        TreeSet<Short> t2 = new TreeSet<>();
        TreeSet<Integer> t3 = new TreeSet<>();
        TreeSet<Long> t4 = new TreeSet<>();
        TreeSet<Float> t5 = new TreeSet<>();
        TreeSet<Double> t6 = new TreeSet<>();
        TreeSet<Boolean> t7 = new TreeSet<>();
        TreeSet<Character> t8 = new TreeSet<>();
        TreeSet<String> t9 = new TreeSet<>();
        TreeSet<Object> t10 = new TreeSet<>();
        TreeSet<Arrays> t14 = new TreeSet<>();
        */

        TreeSet<Integer> tree1 = new TreeSet<>();

        tree1.add(61);
        tree1.add(32);
        tree1.add(13);
        tree1.add(94);
        tree1.add(13); // ayni elementi birden fazla ekleyemiyorsun
        //tree1.add(null); // treeSet e null value ekleyemiyorsun
        System.out.println(tree1); // [13, 32, 61, 94] --> ascending order --> kucukten buyuge siraliyor

        // [13, 32, 61, 94]
        Iterator iter = tree1.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next()); // 13, 32, 61, 94
        }

    }
}
