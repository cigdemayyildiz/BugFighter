package BugFighter;

public class A21Methods {

    public static void main(String[] args) {

        // Methods = Functions

        // f(x) = (x + 2) * 6

        // f methodunun main method icine cagrilmasi
        f(3); // f(3) = (x + 2) * 6 : 30
        f(2); // f(2) = (x + 2) * 6 : 24
        f(6); // f(6) = (x + 2) * 6 : 48

        // power methodunun main method icine cargilmasi
        power(2,3); // Result: 8
        power(3,3); // Result: 27

        // bu methodlarin return typelari void oldugu icin sadece ekranda gostermek icin kullaniliyorlar.
        // Uzerlerinde herhangi bir islem yapilamiyor.
    }

     static void f(int x){ // method static oldugunda baska bir static method icerisine safece method ismi kullanilarak
                          // cagrilabilir.
        int result = (x + 2) * 6;
        System.out.println("f("+x+") = (x + 2) * 6 : " + result );
    }

    static void power(int num1, int num2){ // power isimli methodda uslu bir sayi hesaplamasi yapmak istedigimiz icin,
        // iki ayri parametreye ihticamiz oldugundan method parantez icine iki ayri int tanimladik. ilk int degeri ussu
        // alinacak sayiyi, ikinci int degeri ise ussu ifade ediyor.
        int result = 1; // sonuclari storage etmek icin bir degisken olusturduk
        for (int i = 0; i < num2 ; i++) { // for loop u dongunun ne kadar donmesi gerektigini belirleyecek olan num2
            // yani us ile olusturduk. Bu demek oluyor ki dongu govdesindeki islemi us icin girilen deger ne ise o deger
            // sayisi kadar hesapla.
            result *= num1; // result icine yapilan hesaplamayi koyduk
            //System.out.println(result); // eger adim adim ne islemler yapildigini gormek istiyorsak o zaman print
            // komutunu loop icine yazabiliriz.
        }
        System.out.println("Result: " + result); // for loop disinda gormek istedigimiz mesaji tanimladik. Eger bu
        // printi for loop icine yerlestirseydik, yapilan islemlerin detaylarini ekrana yazdirmis olacaktik.
    }
}
