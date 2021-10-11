package BugFighter;

import java.util.*;

public class A46HashSet {

    public static void main(String[] args) {

        // HashSet<E>

        // No Order
        // Unique Element
        // Null Value

        // Hash --> icine verilen deger karsiliginda karmasik bir deger ureten fonksiyonlardir

        // HashSet'te girilen veriler HashCode lara gore siralandigi icin, girdigimiz degerin HashCode'una gore
        // siralama yapiliyor. Ornegin; a elementinin HashCode'u 576 olabiliyorken z elementinin degeri 108 olabilir. Bu
        // durumda siralama HashCode lara gore yapildigindan z elementini a elementinden once listeyecektir.


        /*

        HashSet syntax's;

        HashSet set1 = new HashSet();
        HashSet <E> set2 = new HashSet();
        Set<E> set3 = new HashSet();
        Set set4 = new HashSet<E>();
        Set <E> set5 = new HashSet<>();
        Set <E> set6 = new HashSet<E>();

        */


        HashSet h = new HashSet(); // h adinda yeni bir HashSet olusturduk. Tipki olusturdugumuz siniflardan
        // methodlar cagirmak gibi dusunulebilir. Biz de bazi siniflar olusturup iclerine methodlar yazdik ve daha sonra
        // o methodlari main methodu icinde cagirdik. Ayni mantik HashSet sinifi icin Java tarafindan olusturulmus ve icine
        // bazi methodlar yazilmis. Biz de HashSet sinifindan bir object olusturdugumuzda HashSet sinifi icerisinde
        // Java tarafindan olusturulmus methodlara ulasabiliyoruz.

        // HashSet object ini olusturduktan sonra normalde de herhangi bir object olusturma amacimiz ait oldugu sinifin
        // methodlarina ulasmak oldugu gibi, object isminin arkasindan .(nokta) ya bastigimizda HashSet sinifina ait
        // tum methodlari goruntuleyebiliyoruz. Bu methodlardan bazilari;

        // add(); methodu --> olusturdugumuz HashSet sinifindan gelen h object ine element eklememizi sagliyor.

        h.add("100");
        h.add(12);
        h.add(2.5);
        h.add(true);
        h.add(null);
        h.add(12);
        h.add("Texas");
        h.add('H');
        

        System.out.println(h); // [null, 100, 2.5, Texas, H, 12, true] --> gordugumuz gibi HashSet elementleri
        // listelerken herhangi bir sirayi takip etmiyor. Bunun nedeni her olusturdugumuz element icin bir HashCode
        // olusturuyor olmasi. Bu HashCode lara gore siralama yapiyor. 12 elementini iki kere eklemis olmamiza ragmen
        // sadece bir kere yazdirdi, cunku HashSet duplicate elemente izin vermiyor. Her element sadece bir kere
        // eklenebiliyor.


        // contains(); --> iceriyor mu?

        System.out.println(h.contains("12")); // false --> contains ile aramak istedigimiz elementin set listesinde
        // olup olmadigini kontrol edebiliriz, sonucu tabii ki boolean dondurur. Var mi yok mu sorusuna var ya da yok
        // diye cevap vermek gibi. int data tipinde 12 var ama String data tipinde 12 yok bu yuzden false dondurdu.


       // remove(); --> sil, kaldir

        h.remove(null); // sirali bir indexleme mantigi olmadigi icin direkt elementin degerini vererek sildirme islemi
                            // yaptiriyoruz.

        System.out.println(h); // [100, 2.5, Texas, H, 12, true] --> null elementini sildi


        // equals(); --> buyuk/kucuk harf duyarli olarak karsilastirma yapilmak istenen degerle listedeki elementin
        // birebir esit olup olmadigini kontrol ediyor. Liste icindeki element ile karsilastirma yapilacak veri
        // birebir ayni olmali.

        for (Object hSet : h){
            if (hSet.equals("Texas")){
                System.out.println(hSet); // Texas
            }
        }


        // size(); --> h objectsinin size ini gosteriyor

        System.out.println(h.size()); // 6 --> normalde 8 tane element ekledik ama bir tanesi zaten listede var olan
        // 12 elementiydi ve null elementini de remove(); methodu ile sildik. Boylece elimizde 6 element kaldi.


        // isEmpty();

        System.out.println(h.isEmpty()); // false --> h objectine ait listenin bos olup olmadigini kontrol ediyor.


        // Iterator

        // Iterator Interface inin iki tane methodu var hasNext(); ve next();


        Iterator itr = h.iterator(); // Iterator, Iterable interface inden gelen bir interface yapi. Interface lerden
        // object olusturamiyoruz. Iterator ile bu HashSet listesinin tum elemanlarini tek tek gezebiliyoruz. Burada
        // h object i ile iterator(); methodunu cagirdigimizda, h HashSet'ine ait elementler icin Iterator interface inin
        // methodlarini kullanabiliyoruz.


        while (itr.hasNext()){ // hasNext(); sonrasi var mi? hasNext(); methodu while dongusunun donerken bir deger
            // bulduktan sonra bu donguyu daha ne kadar dondurmeye devam edecegini hasNext(); methodu ile kontrol ediyor.
            // Donguyu dondurmeye basliyor bir element buluyor ve sonrasinda baska bir element var mi diye kontrol ediyor,
            // varsa dondurmeye devam ediyor yoksa donguyu bitiriyor.
            System.out.println(itr.next()); // 100, 2.5, Texas, H, 12, true
        }
        System.out.println();


        // forEach(); --> normal for each ile yaptigimiz islemin aynisini yapiyor. Bir ustteki while dongusunun birebir
        // aynisi gibi gorunse de, forEach(); methodu sadece ekrana yazdirmak icin kullaniliyor. While dongusu daha
        // spesifik islemler de yapabilmemize olanak taniyor.

        System.out.println("h.forEach(); methodu ile yazdirma");
        h.forEach (item -> System.out.println(item + " ")); // item burada reference name, istenen isim verilebilir.
        //


        // clear(); --> listenin tum elementlerini siliyor

        h.clear();
        System.out.println();

        System.out.println(h.size()); // 0 --> clear(); methodu ile tum set'i sildigimiz icin size 0.
        System.out.println();


        // GENERIC<>

        // <> parantez icine yazdigimiz data tipleri olusturmak istedigimiz HashSet'e bir ozellik getiriyor. Sadece
        // bu data tipindeki elementleri depolayabiliyor. Integer data tipindeki bir Set'e double element eklenemez.

        HashSet<String> h1 = new HashSet<>();
        HashSet<Double> h2 = new HashSet<>();
        HashSet<Character> h3 = new HashSet<>();
        HashSet<Object> h4 = new HashSet<>();

        HashSet <Integer> hash1 = new HashSet<>();

        hash1.add(91);
        hash1.add(82);
        hash1.add(33);
        hash1.add(64);
        hash1.add(91); // ayni elementi birden fazla ekleyemiyorsun
        hash1.add(null);
        System.out.println(hash1); // [64, null, 33, 82, 91] --> random order --> hernagi bir siralama kurali yok
                                // set halinde yazdiriyor, elementlere tek tek ulasmadan
        System.out.println();

        // [64, null, 33, 82, 91]
        Iterator iter2 = hash1.iterator();

        while (iter2.hasNext()){
            System.out.println(iter2.next()); // 64, null, 33, 82, 91
                                            // tek tek tum elementleri yazdiriyor, tek tek hespine ulasarak.
        }
        System.out.println();

        hash1.forEach(item -> System.out.println(item)); // while dongusunun yaptigi islemin aynisini yapiyor ama
        // while dongusunden farki burada elementler sadece ekranda goruntuleniyor, uzerlerinde tek tek islem yapilmak
        // istense bu mumkun olmayacak. Bunu denemek icin System.out.println(item)'dan sonra .(nokta) koyarak herhangi
        // bir methoda erisime musade ediyor mu bakilabilir.
        System.out.println();



        // Once A49ArrayList sinifindaki islemlere bakmadan buradan sonrasina gecme

        // String turunde bir ArrayList olusturduk

        ArrayList <String> veggies = new ArrayList();

        veggies.add("tomato");
        veggies.add("lettuce");
        veggies.add("carrot");
        veggies.add("lettuce");

        // looping over ArrayList by using iterator
        Iterator vegIter = veggies.iterator();
        while (vegIter.hasNext()){
            System.out.println(vegIter.next()); // tomato, lettuce, carrot, lettuce
        }
        System.out.println();

        // sorting collection via sort(); method --> sort(); methodu ile set icindeki elementleri siraladik.
        // ArrayList'in turu String oldugu icin siralama a'dan z'ye oldu.

        Collections.sort(veggies);
        System.out.println(veggies); // [carrot, lettuce, lettuce, tomato]
        System.out.println();


        // convert ArrayList to Set --> ArrayList'i Set'e cevirme islemi

        HashSet set1 = new HashSet(veggies); // Ayni bir HashSet object olusturuyormus gibi olusturup, Constructor
        // icine ArrayListimizin adini yazdik. Boylece ArrayList'i HashSet'e cevirmis olduk.
        System.out.println("This is list to set: " + set1); // This is list to set: [tomato, lettuce, carrot]
        System.out.println();


        // set to ArrayList --> Set'i ArrayList'e cevirme islemi

        ArrayList list = new ArrayList(set1); // Ayni ArrayList'i HashSet'e cevirirken oldugu gibi bu sefer de ArrayList
        // icin bir object olusturuyoruz. Bu sefer ArrayList Constructor unun icine Set'imizin adini yaziyoruz.
        System.out.println("This is new ArrayList from set: "+list);
                                                        // This is new ArrayList from set: [tomato, lettuce, carrot]
        System.out.println();

    }
}
