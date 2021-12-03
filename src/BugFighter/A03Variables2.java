package BugFighter;

public class A03Variables2 {

    public static void main(String[] args) {

        byte abc = 100; // --> abc programimizda artik 100 degeri olarak algilanacak
        System.out.println("Byte degeri: "+abc); // Byte degeri: 100
        System.out.println("abc"); // abc --> tirnak icinde yazarsak bunu sayisal bir deger olarak degil harfsel
        // bir rakam olarak algilayacak

        short shortDegiskeni = 1000;
        System.out.println("Short degeri: "+shortDegiskeni); // Short degeri: 1000


        int intDegiskeni = 1_000_000;
        System.out.println("Integer degeri: "+intDegiskeni); // Integer degeri: 1000000


        long longDegiskeni = 1_000_000_000;
        System.out.println("Long degeri: "+longDegiskeni); // Long degeri: 1000000000


        float floatDegiskeni = 34.5f;
        float floatDegiskeni2 = 35.1f;
        float floatDegiskeni3 = 36; // ondalikli bir sayi girmesek bile ondalikli sayi olarak print ediyor
        System.out.println("Float degeri: "+floatDegiskeni); // Float degeri: 34.5
        System.out.println("Float degeri2: "+floatDegiskeni2); // Float degeri2: 35.1
        System.out.println("Float degeri3: "+floatDegiskeni3); // Float degeri3: 36.0


        double doubleDegeri = 3;
        double doubleDegeri2 = 3.14;
        System.out.println("Double degeri: "+doubleDegeri); // Double degeri: 3.0
        System.out.println("Double degeri2: "+doubleDegeri2); // Double degeri: 3.14
        doubleDegeri = 54.0; // yukarida doubleDegeri adinda zaten tanimlanmis olan degiskeni yeniden tanimladik,
        // bu eskisini silip yerine bu degeri aliyor, bu satirdan sonra doubleDegeri isimli degiskeni yazdirmak
        // istediginde artik ilk tanimlanan degeri goremezsin.
        System.out.println("Double degeri yeni deger: "+doubleDegeri); // Double degeri yeni deger: 54.0


        char charDegiskeni = 117;
        System.out.println("ASCII table dan 117 sayisina karsilik gelen Char degeri: "+charDegiskeni);
        // ASCII table dan 117 sayisina karsilik gelen Char degeri: u
        char charDegiskeni2 = 'u';
        System.out.println("Char degeri2: "+charDegiskeni2); // Char degeri2: u


        boolean booleanDegiskeni = true;
        boolean booleanDegiskeni2 = false;
        System.out.println("Boolean degeri: "+booleanDegiskeni); // Boolean degeri: true
        System.out.println("Boolean degeri2 "+booleanDegiskeni2); // Boolean degeri2 false
        // mantiksal degerlerle calisirken, sartlarda, kosullarda, methodlarda cok kullanilan veri tipidir.

    }
}
