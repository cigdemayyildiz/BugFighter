package Projects;

import java.util.Scanner;

public class A11Kdv {

    public static void main(String[] args) {

        // Kdv Hesaplayan Program

        Scanner input = new Scanner(System.in);
        double tutar, kdvliFiyat, kdv = 0.18;

        System.out.print("Urun tutarini giriniz: ");
        tutar = input.nextDouble();
        kdvliFiyat = tutar + (tutar*kdv);
        System.out.println("Urunun tutari: "+tutar);
        System.out.println("Urunun KDV si: "+tutar*kdv);
        System.out.println("Urunun KDV li fiyati: "+kdvliFiyat);

    }
}
