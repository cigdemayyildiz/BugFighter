package BugFighter;

import java.util.Scanner;

public class A11Scanner {

    public static void main(String[] args) {

        /*
        Scanner kullanicidan veri almak icin kullaniliyor. Scanner sinifini kullanmadan once bu sinifa ait verileri
        kullanabilmek icin kendi kod dosyamiza import etmemiz gerekir. Bu Java ya ben bu sinifin ozelliklerini kullanmak
        istiyorum bunun icin bana yetki ver gibi bir anlama geliyor gibi dusunulebilir. Sadece Scanner sinfinda degil,
        tum siniflarda kendi kod dosyamizda kullanmak istedigimizde ilgili sinifi kod dosyamiza import etmemiz gerekir.

        syntax:
        Scanner input = new Scanner(System.in); --> buradaki nesne ismine istedigin ismi verebilirisin.

        byte a = input.nextByte();
        short b = input.nextShort();
        int c = input.nextInt();
        long d = input.nextLong();
        float e = input.nextFloat();
        double f = input.nextDouble();
        boolean g = input.nextBoolean();
        String h = input.nextLine();
        String i = input.next();
         */

        Scanner input = new Scanner(System.in);

        int a, b; // ayni data tipinde birden fazla null deger tanimlamak icin ayni satir icine aralarina virgul koyarak
        // birden fazla deger icin yer tanimlamasi yapabiliyoruz.

        System.out.println("A sayisini giriniz: ");
        a = input.nextInt();
        System.out.println("B sayisini giriniz: ");
        b = input.nextInt();
        System.out.println("A sayisi: " + a);
        System.out.println("B sayisi: " + b);

        double c;
        System.out.println("C sayisini giriniz: ");
        c = input.nextDouble();
        System.out.println("C sayisi: " + c);

        input.nextLine();
        String str;
        System.out.println("Bir String degeri girin");
        str = input.nextLine(); // nextLine --> birden fazla kelime girebilirsin
        System.out.println(str);

        System.out.println("Bir baska String degeri girin");
        str = input.next(); // next(); de sadece bir kelime girebilirsin, bosluk yaptigin anda bosluktan sonraki
        // kelimeleri dikkate almiyor, sadece ilk kelimeyi yazdiriyor.
        System.out.println(str);
    }
}
