package Projects;

import java.util.Scanner;

public class A20IkininKuvvetleri {

    public static void main(String[] args) {

        // Girilen Sayiya Kadar Olan 2'nin Kuvvetlerini Hesaplayan Program

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int kullanici = input.nextInt();
        int k = 1; // 0'dan baslayamaz cunku 2'nin katlarini almak icin carpma kullanacagiz, carpmada sifir yutan eleman
        while (k <= kullanici){ // sayacimiz kullanicidan gelen sayidan kucuk oldugu surece bu dongu donecek
            System.out.println(k); // k 1'e esit oldugu icin 1'den baslayacak yazdirmaya
            k*=2; // k'yi 2 ile carpip k'ya ekleme komutu
        }
        // kullanicinin sayiyi 10 girdigini varsayarsak; while dongusu calismaya baslayacak ve k'nin 10'dan kucuk olup
        // olmadigina bakacak. k'nin degeri 1 oldugu icin, 1 10'dan kucuk oldugu icin donguyu dondurmeye baslayacak.
        // k'yi ekrana yazdiracak ve k'yi 2 ile carpacak. k'nin degeri bu islemden sonra 2 olacak, 2'yi kullanicidan
        // gelen 10'la karsilastiracak, 2 10'dan kucuk oldugu icin donguye devam edecek. k icin ekrana 2 yazdiracak,
        // k'yi 2 ile carpacak. k'nin degeri 4 olacak. basa donecek ve donguyu kontrol edecek 4 10'dan kucuk oldugu
        // icin donguye devam edecek. k icin ekrana 4 yazdiracak, k'yi 2 ile carpacak. basa donecek donguyu kontrol
        // edecek, k'nin yeni degeri 8 oldugu icin ve 8 10'dan kucuk oldugu icin donguyu dondurmeye devam edecek. k'nin
        // degeri olan 8'i ekrana yazdiracak, k'yi 2 ile carpacak ve 16'ya ulasacak. basa donecek donguyu kontrol edecek
        // 16 10'dan buyuk oldugu icin dongu orada bitecek.


    }
}
