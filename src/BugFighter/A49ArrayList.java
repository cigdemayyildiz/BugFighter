package BugFighter;

import java.util.ArrayList;
import java.util.Iterator;

public class A49ArrayList {

    public static void main(String[] args) {

        // ArrayList

        // Insertion Order
        // Null Value
        // Duplicate Elements
        // There is get(); method to reach out for specific element

        // En cok kullanilan list, Array tutan bir list olarak tanimlanabilir.

        // ArrayList                                              // LinkedList
        // adding and removing element is slower                  // adding and removing is faster
        // reaching to element is faster                          // reaching to element is slower


        ArrayList city = new ArrayList();

        city.add("Austin");
        city.add("Chicago");
        city.add("New York");
        city.add("Austin");
        city.add("California");
        city.add(null);


        city.forEach(item -> System.out.println(item)); // elementleri girdigimiz sira ile veriyor

        city.add(0,"Istanbul"); // add(); methodunu Set'ten farkli olarak index numarasi belirterek
        // element eklemek icin de kullanabiliyoruz. Set'te index numarasi belli olmadigi icin bu method Set icin
        // kullanilamiyor ama List'te kullaniliyor. Burada 0.siradaki element Istanbul olsun dedigimizde halihazirda
        // 0.sirada Austin elementi oldugu icin Istanbul elementini ekleyerek Austin elementinini ve devamindakileri bir
        // sira ileri kaydiriyor. Bu sekilde index numarasi vererek araya element ekleme islemi yapabiliyoruz. Yalniz
        // burada index numarasi bu ornek icin 5 oldugu icin yeni bir index numarasi olustururak add(); methodunu
        // kullanmak istedigimizde index numarai takip etmeli. Eger 7 index numarasi icin veri girisi yapmak istersek
        // IndexOutOfBoundsException: Create breakpoint: Index: 7, Size: 6 hatasi verecektir. index numarasini 6 girip
        // o sekilde ekleme yapmak gerekiyor. index numaralari sirayi takip etmeli.

        System.out.println();

        city.forEach(item -> System.out.println(item));

        city.remove(3); // remove(); methodunda da add(); methodunda oldugu gibi index numarasi vererek aradan
        // veri silme yapabiliyoruz.

        System.out.println();

        city.forEach(item -> System.out.println(item));

        System.out.println();


        Iterator itr = city.iterator(); // Iterator interface bir yapi oldugu icin Iterator dan nesne uretemiyoruz.
        // burada Iterator itr adinda bir degisken olusturduk ve city object i ile iterator(); methodunu Iterator
        // sinifindan cagirdik. hasNext(); methodu Iterator interface ine ait bir method oldugu icin bu kodlama bize
        // city object imiz ile Iterator interface ine ait olan hasNext(); methodunu kullanma sansi verdi.
        while (itr.hasNext()){
            System.out.println(itr.next()); // ayni sekilde next(); methodu da Iterator interface ine ait bir method.
            // Iterator degiskeni olusturup liste icinde itr ile gezindigimiz icin Iterator methodlarini kullanmabiliyoruz.
        }
        System.out.println();

        // get(); methodu --> HashSet'ten farkli olarak index numaralarina ulasabildigimiz icin get(); methodu ile
        // specific bir index numarasini getirebiliyoruz.

        System.out.println(city.get(2)); // Chicago
        System.out.println();


        // GENERIC <>

        ArrayList<String> a = new ArrayList<>(); // Eger ArrayList icine tek turden elementler eklemek istiyorsak
                                                // bu sekilde ArrayList'lere Generic ekleyebiliriz. Generic eklenmis
                                                // ArrayList lere sadece o data tipinden elementler eklenebilir.

        a.add("Ali");
        a.add("Ahmet");
        a.add("Omer");
        a.add("Turkiye");
        a.add("Bugun hava cok guzel!");
        // a.add(12); --> String data tipinde generic i olan bir ArrayList e Integer ekleme yapamayiz.



        ArrayList<Integer> i = new ArrayList<>(); // int data tipinde bir ArrayList olusturmak istedigimizde int
                                  // primitive data type in sinifini(Integer) Generic olarak kullanmak gerekiyor.
        i.add(4);
        i.add(8);
        i.add(4536);

        for (Integer obj : i){ // Eger ArrayList i generic olmadan olusturursak, forEach Loop kullandigimizda Integer
            // yerine Object dersek yine istedigimiz listeye ulasiriz. Ama bu sadece goruntulemede ise yarayan bir
            // yontem olur. Cunku eger obj ile Integer bir islem yapmak istedigimizde o zaman hata ile karsilasiriz.
            System.out.println(obj.doubleValue()); // ornekte oldugu gibi eger Object olarak forEach loop kullanmis olsak
            // Integer in bu ozelliklerine erisemeyecektik.
        }

        ArrayList<Double> d = new ArrayList<>();
        ArrayList<Boolean> b = new ArrayList<>();
        ArrayList<Character> c = new ArrayList<>(); // char'in sinifi Character
        ArrayList list1 = new ArrayList(3);
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList(list1);
        ArrayList <Integer> list4 = new ArrayList<>();
        ArrayList <Double> list5 = new ArrayList<Double>();


        list2.add(11);
        System.out.println(list2); // [11]
        list2.add(22);
        System.out.println(list2); // [11, 22]
        list2.add("white");
        System.out.println(list2); // [11, 22, white]
        list2.add(11);
        System.out.println(list2); // [11, 22, white, 11]
        list2.add(2,44); // bu sekilde yazarsak ilk yazdigimiz sayi index icin ikincisi eklemek istedigimiz
        // element icin olacak, 2.index white oldugu icin onu saga dogru kaydirip yerine gececek, ama white yine de icerde
        // kalacak onu silmeyecek.
        System.out.println(list2); // [11, 22, 44, white, 11]


        // size(); --> checking size of ArrayList
        int sizeOfList2 = list2.size();
        System.out.println(sizeOfList2); // 5

        //list2.add(6,66); // size 5 index 4 eger 6 index numara icin element olusturmak istersen bunu yapmaz
        // System.out.println(list2); // IndexOutOfBoundsException Index: 6, Size: 5

        list2.add(5,55); // bunu yazmadan once size 5 di ve bu da demek oluyor ki index number is 4,
        // eger bir sonraki index i olusturmak istiyorsan buna izin veriyor ama 6.indexi olusturmak istersen o zaman
        // izin vermiyor. hemen bir sonrakine izin veriyor.
        System.out.println(list2); // [11, 22, 44, white, 11, 55]


        // get(); --> getting which element you want from the ArrayList
        System.out.println(list2.get(3)); // white --> get(); methodu index 3 u cagiriyor

        // System.out.println(list2.get(10)); // IndexOutOfBoundsException: Index: 10, Size: 6

        System.out.println(list2.size()); // 6


        // remove(); --> deleting the elements
        list2.remove("white");
        System.out.println(list2); // [11, 22, 44, 11, 55]
        list2.remove(1);
        System.out.println(list2); // [11, 44, 11, 55]
        list2.remove("55"); // if the element isn't on the list nothing happens
        System.out.println(list2); // [11, 44, 11, 55]
        list2.remove((Integer)55); // listedeki elementlerden birini spesifik olarak silmek istiyorsan bunu kullanabilirsin
        System.out.println(list2); // [11, 44, 11]


        // addAll(); --> you can add a whole collection to the ArrayList
        list3.addAll(list2); // list2 icindeki her seyi ekle list3'e ekle
        System.out.println("list3--> "+list3); // [11, 44, 11]
        list3.add(77);
        System.out.println("list3--> "+list3); // [11, 44, 11, 77]


        // removeAll(); --> you can remove a whole collection from to the ArrayList
        list3.removeAll(list2); // list2 ye ait olan tum elementleri sildi sadece kendine ait olan elementi tuttu
        System.out.println("list3--> "+list3); // [77]

        list3.add(88);
        list3.add(99);
        System.out.println("list3--> "+list3); // [77, 88, 99]


        // set(); --> updating elements
        list3.set(2,100); // 2 index numarali element i virgulden sonra yazdigim element ile degistir
        System.out.println(list3); // [77, 88, 100] --> 99 yerine 100 yazdi


        // you can use String methods --> String icin kullandigin methodlari kullanabilirsin
        System.out.println(list3.contains(88)); // true

        System.out.println(list3.get(0).toString().startsWith("x")); // false

        list3.set(0,"xxx"); // list3 un 0 index numarali elementini xxx olarak degistirdik

        System.out.println(list3.get(0).toString().startsWith("x")); // true

        System.out.println(list3.subList(1,3)); // 1 den 3 e kadar olan elementleri gosterecek substring() in Array hali


        // clear();
        list3.clear();
        System.out.println(list3); // []
        System.out.println(list3.size()); // 0
    }
}
