package Projects;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class A20CiftSayilariToplama {

    public static void main(String[] args) {

        /* Negatif Bir Deger Girilene Kadar Kullanicidan Girisleri Kabul Eden ve Girilen Degerlerden Cift Sayilari
                                                    Toplayan Program
        */

        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Lutfen sayi giriniz: ");
            sayi = input.nextInt();
            if (sayi % 2 == 0){
                toplam+=sayi;
            }
        }while (sayi > 0);
        System.out.println("Girilen cift sayilar toplami: " + toplam);


    }
}
