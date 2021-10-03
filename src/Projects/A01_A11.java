package Projects;

import java.util.Scanner;

public class A01_A11 {

    public static void main(String[] args) {

        // Not Ortalamasi Hesaplayan Program

        int quiz, vize, ffinal; // uc tane veri tipi tanimladik
        double ortalama; // ortalama icin ondalikli bir sayi sonucu cikabilecegi icin double olarak veri tanimladik

        Scanner input = new Scanner(System.in); // kullanicidan veri almak icin Scanner sinifini olusturduk
        System.out.println("Quiz notunu giriniz: "); // quiz notunu kullanicidan istedik
        quiz = input.nextInt();
        System.out.println("Vize notunu giriniz: "); // vize notunu kullanicidan istedik
        vize = input.nextInt();
        System.out.println("Final notunu giriniz: "); // final notunu kullanicidan istedik
        ffinal = input.nextInt();

        ortalama=(quiz*0.20)+(vize*0.35)+(ffinal*0.45); // quizin %20'si, vizenin %35 ve finalin %45 i gecme kalma
        // durumunu belirledigi icin ortalamayi bu degerlere gore hesapladik.
        System.out.println("Not ortalamaniz: "+ortalama); // ortalamayi ekrana yazdirdik

        String sonuc = (ortalama>=50) ? "Gectiniz!" : "Kaldiniz!"; // eger ortamala 50 uzerinde ise gectiniz, altindaysa
        // kaldiniz mesajlarini ekranda gorebilmek icin bir kosul operatoru olusturduk.
        System.out.println(sonuc); // sonucu ekrana yazdirdik.


        // Kdv Hesaplayan Program

        double tutar, kdvliFiyat, kdv = 0.18;

        System.out.println("Urun tutarini giriniz: ");
        tutar = input.nextDouble();
        kdvliFiyat = tutar + (tutar*kdv);
        System.out.println("Urunun tutari: "+tutar);
        System.out.println("Urunun KDV si: "+tutar*kdv);
        System.out.println("Urunun KDV li fiyati: "+kdvliFiyat);


        // Dairenin Alanini ve Hacmini Bulan Program

        int r;
        double alan, hacim, pi = 3.14;
        System.out.print("Daire yari capini giriniz: \n");
        r = input.nextInt();
        alan = 2 * pi * r;
        hacim = pi * (r*r);
        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairanin hacmi: "+ hacim);


    }
}
