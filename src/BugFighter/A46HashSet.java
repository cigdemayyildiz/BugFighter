package BugFighter;

import java.util.HashSet;
import java.util.Iterator;

public class A46HashSet {

    public static void main(String[] args) {

        // HashSet<E>

        // Hash --> icine verilen deger karsiliginda karmasik bir deger ureten fonksiyonlardir

        // HashSet'te girilen veriler HashCode lara gore siralandigi icin, girdigimiz degerin HashCode'una gore
        // siralama yapiliyor. Ornegin; a verisinin HashCode'u 576 olabiliyorken z verisinin degeri 108 olabilir. Bu
        // durumda siralama HashCode lara gore yapildigindan z verisini a verisinden once listeyecektir.

        HashSet h = new HashSet(); // h adindan yeni bir HashSet olusturduk. Ayni bizim olusturdugumuz siniflardan
        // methodlar cagirmak gibi dusunulebilir. Biz de bazi siniflar olusturup iclerine methodlar yazdik ve daha sonra
        // o methodlari main methodu icinde cagirdik. Ayni mantik HashSet sinifi Java tarafindan olusturulmus ve icine
        // bazi methodlar olusturulmus. Biz de HashSet sinifindan bir object olusturdugumuzda HashSet sinifi icerisinde
        // Java tarafindan olusturulmus methodlara ulasabiliyoruz.

        h.add("12");
        h.add(12);
        h.add(2.5);
        h.add(true);
        h.add(null);

        h.remove(12); // sirali bir indexleme mantigi olmadigi icin direkt verinin degerini vererek sildirme islemi
                        // yaptiriyoruz.

        System.out.println(h.contains(2.5)); // true --> veriyi iceriyor mu
        System.out.println(h.contains(12)); // false cunku remove(); methodu ile 12 yi silmistik.

        System.out.println(h.size()); // 4


        Iterator itr = h.iterator(); // Iterator bu sinif icinde geziniyorum manasina gelebilir. Iterator sinifindan itr
        // isimli bir object olusturup, polimorphism de oldugu gibi Iterator sinifi ile nesne olusturup bu nesnenin
        // HashSet gibi davranmasini istiyorum. h objesi HashSet sinifina ait.

        while (itr.hasNext()){ // hasNext() sonrasi var mi? hasNext() methodu while dongusunun donerken bir deger
            // bulduktan sonra bu donguyu daha ne kadar dondurmeye devam edecegini hasNext(); methodu ile kontrol ediyor.
            // Donguyu dondurmeye basliyor bir veri buluyor ve sonrasinda baska bir veri var mi diye kontrol ediyor,
            // varsa dondurmeye devam ediyor yoksa donguyu bitiriyor.
            System.out.println(itr.next());
        }

        h.clear(); // tamamini siliyor









    }

}
