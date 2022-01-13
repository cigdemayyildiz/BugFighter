package BugFighter;

public class A31MathClass {

    public static void main(String[] args) {

        // Hazir olarak Java tarafindan yazilmis matematik islemlerine ait sinif

        // Math class methods
        /*
            Match.ceil(x) --> bir buyuk tam sayiya yuvarlama yapar
            Math.floor(x) --> kucuk tam sayiya yuvarlama yapar
            Match.cos(x) --> cos degerini doner
            Math.sin(x) --> sin degerini doner
            Math.max(x,y) --> buyuk sayiyi verir
            Math.min(x,y) --> kucuk sayiyi verir
            Math.pow(3,5) --> 3^5 us alir
            Math.random() --> 1 ve 0 arasinda rastgele deger
            Math.round(x) --> yakin olan tam sayiya doner
            Math.abs(x) --> mutlak deger
            Math.sqrt(x) --> karekok alma
         */

        System.out.println(Math.ceil(3.2)); // bir ust tam sayiya yuvarlama
        System.out.println(Math.floor(3.8)); // bir alt tam sayiya yuvarlama
        System.out.println(Math.cos(300)); //
        System.out.println(Math.sin(75)); //
        System.out.println(Math.max(4,7)); // girilen degerler arasindan buyuk olanini verdi
        System.out.println(Math.min(6,2)); // girilen sayilardan kucuk olanini verdi
        System.out.println(Math.pow(3,5)); //
        System.out.println(Math.random()); // her defasinda 1 ile sifir arasinda rastgele bir sayi donuyor
        System.out.println(Math.round(3.4)); // yakin olan tam sayiyi verdi
        System.out.println(Math.abs(-1)); // mutlak degerini aldi
        System.out.println(Math.sqrt(16)); // karekok alma



    }
}
