package Projects;

import java.util.Scanner;

public class A20UsluSayilar {

    public static void main(String[] args) {

        // Uslu Sayi Hesaplayan Program

        int sayi1, sayi2, sonuc=1, i=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("Us olacak sayiyi giriniz: ");
        sayi2 = input.nextInt();

        while (i <= sayi2){ // govdedeki islemi kac kere yaptirmak istedigimizi belirliyor
            sonuc = sonuc * sayi1; // sonuc degiskeninin icine sonuc ile sayi1'in carpimini yaz
            i++; // donguyu nerede bitirmek istedigimizi belirliyor.
        }
        System.out.println("Sonuc: " + sonuc);

        // Bu ornekte sayi1 = 3 ve sayi2 = 2 olsun.
        // Eger i kullanicidan gelen sayi2'den kucuk ve esitse donguyu bu kosul saglanamayana kadar dondur.
        // Uslu bir sayi hesaplarken usteki sayi bizim ussu alinacak sayiyi kac kere carpacagimizi gosterdigi icin
        // while dongu kosulunu bu islemi kac kere yapacagimizi belirleyecek olan sayi2 ile kurduk.
        // Birinci asamada sonuc=1 oldugu icin, sonuc * sayi1 = 3 olacak. Cunku kullanici sayi1 icin 3 degerini girdi,
        // ve sonuctaki halihazirda var olan deger 1 oldugu icin 3 X 1 = 3. Dongu ikinci kere dondugunde bu sefer
        // sonuc icinde 3 oldugu icin sonuc, sayi1'in degeri olan 3 ile carpilacak ve sonuc 3 X 3 = 9 olacak.
        // Kullanici sayi2'yi yani us olacak sayiyi 2 sectigi icin islem iki kere yapildi, cunku donguyu sayi2 uzerinden
        // kurduk. Eger sayi2 = 3 olsaydi dongu 3 kere donecekti.

    }
}
