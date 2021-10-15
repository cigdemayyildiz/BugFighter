package BugFighter;

public class A16WhileLoop {

    public static void main(String[] args) {

        /*
        While Dongusu Syntax;

        while (kosul){
            kodlama
        }
        */

        int i = 1; // int bir deger olusturduk
        System.out.println("Dongu basladi");
        while (i<=5){ // i 5'den kucuk ve 5'e esit oldugu surece kosulunu verdik
            System.out.println(i); // dongu govdesindeki ciktisini almak istedigimiz degeri yazdirma komutunu ekledik.
            i++; // i yi while dongusu icerisindeki kosulu saglamayi bitirene kadar artir komutunu verdik. i++ --> i
            // degerine her seferinde bir deger ekle anlamina geliyordu.
        }
        System.out.println("Dongu bitti"); // while dongusu govdesindeki islemler bitmeden bu satira gecmedi, once dongu
        // icindeki tum kosullari sagladi ve dongu isini bitirdikten sonra bu mesaji ekrana yazdirdik.

        System.out.println();

        System.out.println("Ikinci dongu basladi");
        int a = 5;
        while (a>=1){ // a 1'den kucuk ve 1'e esit oldugu surece
            System.out.println(a); // bu mesaji yazdir
            a--; // ve a'yi birer deger azalt, ta ki a 1 e esit olana kadar
        }
        System.out.println("Ikinci dongu bitti");

        System.out.println();

        System.out.println("Ucuncu dongu basladi");
        int b = 1;
        while (b<=5){ // 1'den 6'ya kadar(6 haric) 5 adim oldugu icin, Java bu dongunun icine 5 nesne koyacak.
            b++; // Normalde b'ye atadigimiz deger 1'di ve 5 dahil olacak sekilde ekrana yazdirmasini istemistik.
            // Java yukaridan asagiya sekilde kodlari okudugu icin while kosulu icindeki durumu kontrol etti,
            // b esittir 1'e ve b 5'ten kucuk ve 5'e esit oldugu kosulda donguyu calistirmaya devam et dedi ve hemen
            // bir alt satira gectiginde b'nin bir deger artirilmasini komutunu aldi. Eger ekrana yazdirma isleminden
            // once b++; komutunu girersek once artirim olacak ve ardindan ekrana yazdirilacak. Bu durumda b 1 iken b++;
            // satirindan sonra b'nin degeri 2 oldu ve bir alt satirdaki yazdirma komutu ile ekrana 2 yazdirildi. Eger
            // b++; komutunu sout tan once koymasaydik donguyu, 1 2 3 4 5 seklinde cevirecekken, b++; ile bir deger
            // artirdigimiz icin 2 3 4 5 6 seklinde dondurdu. Nedeni bu dongunun icine 5 eleman koymasi gerektigi icin.
            System.out.println(b); // b++; komutu sout komutundan once oldugu icin dongu 2 3 4 5 6 seklinde dondu.
        }
        System.out.println("Ucuncu dongu bitti");

        System.out.println();

        System.out.println("Dorduncu dongu basladi");
        int c = 5;
        while (c>=1){
            c--;
            System.out.println(c);
        }
        System.out.println("Dorduncu dongu bitti");

        System.out.println();

        System.out.println("Besinci dongu basladi");
        int d = 10;
        while (d<=5){
            System.out.println(d);
            d++;
        }
        System.out.println("Besinci dongu bitti");
        // bu dongu kosul saglanmadigi icin calismadi
    }
}
