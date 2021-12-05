package BugFighter;

import java.util.Scanner;

public class A14SwitchCase {

    public static void main(String[] args) {

        // Switch yapisi if e benziyor ama birden fazla if-else yazmaktan kurtaran bir yapidir.

        Scanner input = new Scanner(System.in); // kullanicidan bir deger istemek icin Scanner sinifini kullandik.
        System.out.println("Bir sayi giriniz: "); // kullanicidan sayi girmesini istedik.
        int sayi = input.nextInt(); // kullanicinin girecegi sayiyi store edecegimiz data type icine kullanicinin
        // konsola sayi girebilmesini saglayan kodu yazdik.

        switch (sayi){ // switch olusturduk ve switch icine kullanicidan gelecek olan sayinin degisken ismini yazdik.
            // burada kullanicinin girdigi sayiyi asagidaki case lerde karsilastiracagimiz icin ana karsilastirma
            // elemanimiz kullanicinin girdigi sayi olmali.
            case 1: // case 1 de kullanicinin girdigi sayi 1 e esit mi diye karsilastirma yaptik.
                System.out.println("Sayi " + sayi + "'e esittir."); // eger kullanici 1 girerse bu mesaji print et dedik.
                break; // eger her case sonunda break; komutunu kullanilmazsa diger case leri de yazdirmaya devam eder.
            case 2: // case 2 de kullanicinin girdigi sayi 2 ye esit mi diye karsilastirma yaptik.
                System.out.println("Sayi " + sayi + "'ye esittir."); // eger kullanici 2 girerse bu mesaji print et dedik.
                break; // break i her case sonunda kullanicinin girdigi sayi ile case sayisi birbirine esit mi kosulu
            // saglandigi takdirde bir sonraki case i consola yazdirmamasi icin kullandik.
            case 3: // case 3 de kullanicinin girdigi sayi 3 e esit mi diye karsilastirma yaptik.
                System.out.println("Sayi " + sayi + "'e esittir."); // sayi ile case 3 birbirine esit mi kosulu saglandigi
                // takdirde ekrana yazdirilmasini istedigimiz mesaji yazdik.
                break; // case 3 den sonra kodu yazdirmaya devam etmemesi icin break komutunu tekrar kullandik.
            default: // eger yukaridaki sartlarin hicbiri saglanamazsa o zaman default olarak bir deger girmek icin
                // default komutunu kullandik.
                System.out.println("Sayi 1, 2 ve 3'e esit degildir."); // kullanicinin girdigi sayi case 1, case 2 ve case
                // 3 karsilastirmalarinin hicbiri ile eslesmiyorsa, hicbir case de true koculu saglanmiyorsa ekrana yazdirmak
                // istedigimiz mesaji yazdik.
        }
    }
}
