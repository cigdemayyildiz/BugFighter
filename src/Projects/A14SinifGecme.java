package Projects;

import java.util.Scanner;

public class A14SinifGecme {

    public static void main(String[] args) {

        // Not Ortalamasina Gore Sinif Gecme Programi

        // Turkce, Matematik, Fen Bilgisi, Sosyal Bilgisi ve Beden Egitimi ders notlari girilsim
        // Notlarin ortalamasi hesaplansin
        // Ortalama 50'den dusukse sinif tekrari, degilse sinifi gecsin.

        Scanner input = new Scanner(System.in);
        int turkce, matematik, fen, sosyal, beden;
        double ortalama;
        System.out.print("Turkce ders notunu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Matematik ders notunu giriniz: ");
        matematik = input.nextInt();
        System.out.print("Fen Bilgisi ders notunu giriniz: ");
        fen = input.nextInt();
        System.out.print("Sosyal Bilgisi ders notunu giriniz: ");
        sosyal = input.nextInt();
        System.out.print("Beden Egitimi ders notunu giriniz: ");
        beden = input.nextInt();
        ortalama = (turkce+matematik+fen+sosyal+beden)/5;
        System.out.println("Derslerin ortalamasi: " + ortalama);

        if (ortalama>=50){
            System.out.println("Sinifi " + ortalama + " ortalama ile gectiniz!");
        }else {
            System.out.println(ortalama+ " ortalama ile sinif tekrari yapacaksiniz!");
        }

    }
}
