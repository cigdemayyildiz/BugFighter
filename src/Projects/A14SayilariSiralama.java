package Projects;

import java.util.Scanner;

public class A14SayilariSiralama {

    public static void main(String[] args) {

        // Sayilari Buyukten Kucuge Siralayan Program

        /*
        a > b > c veya a > c > b
        b > a > c veya b > c > a
        c > a > b veya c > b > a
         */

        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Lutfen birinci sayiyi giriniz: ");
        a = input.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        b = input.nextInt();
        System.out.print("Lutfen ucuncu sayiyi giriniz: ");
        c = input.nextInt();

        if (a > b && a > c){ // a nin en buyuk oldugu kosul
            if (b > c){ // b nin c den buyuk oldugu kosul
                System.out.println("a > b > c");
            }else{ // eger ikinci if kosulu dogru degilse demek ki b c den buyuk degil ve o zaman c b den buyuk
                System.out.println("a > c > b");
            }
        }else if (b > a && b > c) { // b nin en buyuk oldugu kosul
            if (a > c) { // a nin c den buyuk oldugu kosul
                System.out.println("b > a > c");
            } else { // eger ikinci if kosulu dogru degilse demek ki a c den buyuk degil ve o zaman c a dan buyuk
                System.out.println("b > c > a");
            }
        }else { // burada tekrar else if yapamaya gerek yok cunku yukarida zaten iki olasiligi da denedigimiz icin
            // buraya sadece c nin en buyuk olma kosulu kaliyor. buraya tekrar else if icerisinde kosul da
            // olusturabiliriz ama gerek yok cunku zaten karsilastirilacak son veri belli, c en buyuk sayi mi?
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }

    }
}
