package BugFighter;

public class A17DoWhileLoop {

    public static void main(String[] args) {

        /*
        Do While Dongusu Syntax;

        do{
            kodlama

        } while(kosul);
         */

        int i = 10; // i esittir 10'a
        System.out.println("Dongu basladi");
        do { // do once govdedeki isi yap, Java yukaridan asagiya calistigi icin once do govdesindeki isleri yapip
            // sonra kosulu kontrol etmeye gidecek.
            System.out.println(i); // 10 --> i'yi yazdir
            i++; // i'yi 1 artir
        }while (i<=5); // i 5'e esit ve 5'den kucuk mu kontrol et
        // i 5'den buyuk oldugu icin dongu calismadi, sadece bir kere do govdesi icindeki sout u yazdirdi ve bitti.
        System.out.println("Dongu bitti");

        System.out.println();

        i = 10; // i'ye yeniden deger atadik
        System.out.println("Ikinci dongu basladi");
        do {
            System.out.println(i); // 10 11 12 13 14 15
            i++;
        }while (i<=15);
        System.out.println("Ikinci dongu bitti");

        System.out.println();

        i = 10 ; // i'ye yeniden deger atadik
        System.out.println("Ucuncu dongu basladi");
        do {
            i++; // eger i++; komutunu sout tan once konumlandirirsak kosula 10'dan degil 11 den baslayacagi icin
            // yazdirdiginda ilk cikti 11 olacak.
            System.out.println(i); // 11 12 13 14 15 16
        }while (i<=15);
        System.out.println("Ucuncu dongu bitti");

        System.out.println();
    }
}
