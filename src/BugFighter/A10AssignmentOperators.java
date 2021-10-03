package BugFighter;

public class A10AssignmentOperators {

    public static void main(String[] args) {

        int a = 5; // = int data tipindeki a degiskenine 5 degerini atamak icin kullanildi.
        int b = 20;

        System.out.println(a); // 5 --> a = 5, a ya 5 degerini ata, a bundan sonra 5 olsun anlamina geliyor.
        System.out.println(b); // 20 --> b = 20, b ye 20 degerini ata, b bundan sonra 20 olsun anlamina geliyor.

        a+=2; // a degiskenini 2 artir --> bunun acilimi (a = a + 2) a ya 2 ekle ve a nin icine koy
        System.out.println(a); // 7

        b-=5; // b degiskeninden 5 cikar --> bunun acilimi (b = b - 5) b den 5 cikar ve b nin icine koy,
        // b nin yeni degeri 5 eklenmis hali olsun.
        System.out.println(b); // 15

        a*=5; // 7 * 5 = 35
        System.out.println(a); // 35

        b/=3; // 15 / 3 = 5
        System.out.println(b); // 5

        a%=b; // 35 / 5 = 7 --> 35  5 e kalansiz bolundugu icin kalan sifir
        System.out.println(a); // 0

    }
}
