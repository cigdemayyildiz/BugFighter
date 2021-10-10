package BugFighter;

import java.util.LinkedList;

public class A50LinkedList {

    public static void main(String[] args) {

        // LinkedList

        // Insertion Order
        // Null Value
        // Duplicate Elements
        // There is get(); method to reach out for specific element

        // ArrayListler ile birebir ayni. Tek farklari algoritmalari.
        // Diyelim ki elimizde buyuk iki tane listemiz var. ArrayList in arama islemlerinde performansi daha yuksek.
        // ArrayList ile LinkedList algoritmalari farkli oldugu icin sik sik arama yapma ihtiyaci olan islemlerde
        // ArrayList kullanmak mantikli.

        // ArrayList                                              // LinkedList
        // adding and removing element is slower                  // adding and removing is faster
        // reaching to element is faster                          // reaching to element is slower


        LinkedList list = new LinkedList();

        list.add("Apple");
        list.add("Peach");
        list.add("Strawberry");
        list.add("Orange");
        list.add(32);
        list.add(63);
        list.add(11);

        // Direkt sout ile yazdirdigimizda Array list olarak goruntuluyoruz.
        System.out.println(list); // [Apple, Peach, Strawberry, Orange, 32, 63, 11] --> girilen sira ile
        System.out.println();

        list.forEach(item -> System.out.println(item)); // listeden bagimsiz olarak ayri ayri element olarak yazdiriyor.
        System.out.println();


        list.add(3,"Plum");
        list.forEach(item -> System.out.println(item)); // Plum'i araya ekleyerek sonrasindaki elementleri bir basamak
                                                       // kaydirdi.
        System.out.println();

        list.remove(5);
        list.forEach(item -> System.out.println(item)); // 32'yi aradan silip sonraki elemetleri bir basamak geri cekti.
        System.out.println();

        System.out.println(list.get(4)); // Orange
        System.out.println();


        // element(); --> listedeki ilk elementi getirir. Bu diger ArrayList ve Vector de yok.
        System.out.println(list.element()); // Apple

    }
}
