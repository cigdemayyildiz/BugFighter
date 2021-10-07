package BugFighter;

import java.util.Arrays;
import java.util.Scanner;

public class A27Arrays {

    public static void main(String[] args) {

        // Arrays = Diziler

        // Arrayler iclerinde degisken saklamamiza yarayan listelerdir. Diyelim ki bes adet int turunde degiskenlerimiz
        // var ve bunlari tek bir listede gormek istitoruz, bu durumda Array kullaniyoruz.

        // DataType arrayName [] = new DataType[data length]; --> Array syntax
        // DataType [] arrayName = new DataType[data length]; --> Array syntax
        // DataType [] arrayName = {data1, data2, data3....}; --> Array syntax
        // DataType arrayName [] = {data1, data2, data3....}; --> Array syntax

        int [] list = new int[4]; // bu yazim seklinde koseli parantez icine bu liste icin ne kadar yere ihtiyacimiz
        // oldugunu bastan belirtiyoruz. Bilgisayar saymaya 0'dan basladigi icin, 0'dan baslayarak yer ayirmaya
        // baslayacak. Bu da demek oluyor ki [4] boyutunda bir yer ayir demek, icine 5 veri koyabilecegimiz anlamina
        // geliyor. Basta liste icin kullanilacak alan belirtildigi icin ekstra bir veri girisi yapilamaz. 5 veri
        // girebilecegimiz kadar yer ayirttiysak 5 veri girmeliyiz.
        int [] list1 = {1,2,3,4,5}; // bu yazim seklinde ise baslangicta bilgisayardan listemiz icin yer rezerve etmesini
        // istemiyoruz, elimizdeki tum verileri yazdiktan sonra bilgisayar bu verilerin kapladigi yeri kesinlestiriyor.

        // list[4]=1; // Array index is out of bounds --> cunku 4 uzunlugunda bir alan istedik, bu liste icin
        // kullanilabilecek 5.bir alan yok.

        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        //list[3] = "abc"; --> listenin hangi tur datalardan olusacagini baslangica int olarak belirledigimiz icin
                                // String bir veri girisi yapamayiz.
        //list[3] = 2.5; --> ayni sekilde baslangicta int data turune ait Array olusturdugumuz icin double bir veri
                            // giremeyiz.

        System.out.println(Arrays.toString(list)); // [1, 2, 3, 4] --> girilen dort integer degerini bir arada liste
                                                  // halinde yazdirdik.


        System.out.println(list[0]); // 1
        System.out.println(list[1]); // 2
        System.out.println(list[2]); // 3
        System.out.println(list[3]); // 4

        System.out.println("For loop ile liste icindeki datalari tek tek yazdirma; ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }


        System.out.println("Kullanicidan deger isteyerek Array icinde listeleme; ");
        int [] list3 = new int[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Sayilari girmeye baslayin: ");
        for (int i = 0; i < list3.length; i++) {
            list3[i] = input.nextInt();
        }
        for (int i = 0; i < list3.length; i++) {
            System.out.println(list3[i]);
        }











    }
}
