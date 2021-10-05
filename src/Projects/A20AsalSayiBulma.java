package Projects;

import java.util.Scanner;

public class A20AsalSayiBulma {

    public static void main(String[] args) {

        // Asal Sayi Bulma Programi

        // Bir sayi sadece kendisine ve 1'e bolunuyorsa asal sayidir. Bu sayinin 2'den kucuk olmamasi gerekiyor.

        /* Ornegin 7 bir asal sayi midir diye baktigimizda; 7'den kucuk 2'ye kadar olan sayilari kontrol ettigimizde
        (6 - 5 - 4 - 3) bu sayilar 7'ye kalansiz bolunuyor mu bunu kontrol etmek gerekiyor. 7 sadece kendisine ve
        1'e bolundugu icin bir asal sayidir.
        */

        Scanner input = new Scanner(System.in);
        int sayi;
        boolean asal = true;

        do {
            System.out.print("Lutfen pozitif bir sayi giriniz: ");
            sayi = input.nextInt();
        }while (sayi < 2);

        for (int i=2; i < sayi; i++){
            if (sayi % i == 0){
                asal = false;
                break;
            }
        }
        if (asal){
            System.out.println(sayi + " bir asal sayidir.");
        }
        else {
            System.out.println(sayi + " bir asal sayi degildir!");
        }


    }
}
