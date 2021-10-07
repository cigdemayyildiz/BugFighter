package BugFighter;

import java.util.Locale;

public class A32StringClass {

    public static void main(String[] args) {

        // String Class

        /*
            str.length(); --> girilen karakterin uzunlugunu(sayi cinsinden) dondurur (int)
            str.concat(str2); --> iki String'i birbiri ile birlestirir
            str.indexOf('I'); --> karakterin konumunu verir (int)
            str.charAt(5); --> indexOf(); methoduna benzer, konumu verilen karakteri okur
            str.compareTo("Istanbul"); --> buyuk/kucuk harf duyarli olarak parantez icindeki degeri str ile karsilastirir
            str.compareToIgnoreCase("ISTanbul"); --> buyuk/kucuk harfe duyarli olmadan icindeki degeri str ile karsilastirir.
            str.contains("tan"); --> girilen deger str icinde geciyor mu kontrol eder (boolean)
            str.startsWith("I"); --> str belirtilen karakter(ler) ile mi basliyor kontrol eder (boolean)
            str.endsWith("L"); --> str belirtilen karakter(ler) ile mi bitiyor kontrol eder (boolean)
            str.replace("ISTANBUL", "MISTANBUL"); --> string degistirme icin kullanilir
            str.toLowerCase(); --> str in tum harflerini kucuk harf yapar
            str.toUpperCase(); --> str in tum harflerini buyuk harf yapar
            str.equals("ISTANBUL"); --> str parantez icindeki veri ile birebir ayni mi konrtol eder buyuk/kucuk harfe duyarli
            str.equalsIgnoreCase("IsTAnbuL"); --> str parantez icindeki veri ile birebir ayni mi konrtol eder b/k harfe duyarli degil
            str.trim(); --> verinin basinda ya da sonunda varsa bosluklari temizler
            str.substring(1); --> 1.index'ten sonrasini yazdir
            str.substring(0,4); --> 0.indexten basla 4.index'e kadar yazdir
            parantez icine verinin ne kadarlik kismini yazdirmak istiyorsak index numaralari ile mudahale edebiliyoruz
         */

        String wrd = "JAVA"; // Java'da String diye bir data tipi olmadigi icin, metin olarak yazmak istedigimiz
        // verileri Java'nin kendi icinde var olan String siniflarinda mevcut olan methodlar yardimi ile
        // olusturabiliyoruz. Biz bu sekilde bir String olusturdugumuzda aslinda Java arka planda asagidaki kodlamayi
        // calistirmis oluyor. Tum metni harfler olarak Array de listeliyor ve sonra char[]'i String Class dan
        // olusturdugu yeni method ile String e ceviriyor.
        char[] ch = {'J', 'A', 'V', 'A'};
        String word = new String(ch); // char Array i String'e ceviriyoruz
        System.out.println(word);



        String str = "ISTANBUL";
        System.out.println(str.length()); // 8
        System.out.println(str.concat(" IS BEAUTIFUL")); // ISTANBUL IS BEAUTIFUL
        System.out.println(str.indexOf('L')); // 7 --> ilk olan L'i veriyor, index saymaya 0'dan basliyor
        System.out.println(str.charAt(2)); // T
        System.out.println(str.compareTo("ISTAN")); // 3
        System.out.println(str.compareToIgnoreCase("ist")); // 5
        System.out.println(str.contains("S")); // true
        System.out.println(str.startsWith("i")); // false --> buyuk/kucuk harf duyarli oldugu icin false donduruyor
        System.out.println(str.endsWith("L")); // true
        System.out.println(str.replace("IST", "MIST")); // MISTANBUL
        System.out.println(str.toLowerCase()); // istanbul
        System.out.println(str.toUpperCase()); // ISTANBUL
        System.out.println(str.equals("ISTANBUL")); // true --> str parantez icindeki veriye esit mi kontrol ediyor
        System.out.println(str.equalsIgnoreCase("istANbul")); // true --> buyuk/kucuk harfi dikkate almiyor
        System.out.println(str.trim()); // eger datanin basinda ve sonunda bosluklar varsa onlari siliyor
        System.out.println(str.substring(1)); // STANBUL --> 1.index den sonrasini yazdiriyor
        System.out.println(str.substring(0,4)); // ISTA --> 0.index'den baslayip 4.index e kadar olan kismi yazdiriyor


    }

}
