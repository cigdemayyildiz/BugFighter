package BugFighter;

public class A06ArithmeticOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int toplama = a + b;
        int cikarma = a - b;
        int carpma = a * b;
        int bolme = a / b;
        int modAlma = a % b;
        System.out.println("Toplama: " + toplama); // Toplama: 15
        System.out.println("Cikarma: " + cikarma); // Cikarma: 5
        System.out.println("Carpma: " + carpma); // Carpma: 50
        System.out.println("Bolme: " + bolme); // Bolme: 2
        System.out.println("Mod Alma: " + modAlma); // Mod Alma: 0 --> bolumunden kalan

        toplama++; // toplama = toplama + 1; anlamina geliyor, degere 1 ekliyor. --> toplama degeri 15 idi.
        System.out.println("Toplama yeni degeri: " + toplama); // Toplama yeni degeri: 16

        cikarma--; // cikarma degeri 5 idi
        System.out.println("Cikarma yeni degeri: " + cikarma); // Cikarma yeni degeri: 4

        System.out.println(a); // 10
        System.out.println(b); // 5

        int sonuc = a++ + b--; //  a++ ve b-- once degeri al ardindan bir ekle, eger ++ lar ve -- ler varible isminin
        // arkasinda ise o zaman bir sonraki variable isminin gectigi yerde o islem dikkate alinacak demek oluyor.

        System.out.println(a); // 11 --> a bir artti 10 iken 11 oldu
        System.out.println(b); // 4 --> b 1 azaldi 5 iken 4 oldu
        System.out.println(sonuc); // 15

        int sonuc2 = ++a + --b; // ++ lar ve -- ler degisken isminden once yazilirsa once artirma ya da eksiltme islemi
        // yapilir, aninda sonucta bu artirimi ya da eksiltmeyi gorebiliriz, bir sonraki herhangi bir yerde a ya da b
        // degisken ismini gormeyi beklemeye gerke yok.
        System.out.println(a); // 12 --> a 11 di bir artti 12 oldu
        System.out.println(b); // 3 --> b 4 du bir eksildi 3 oldu
        System.out.println(sonuc2); // 15
    }
}
