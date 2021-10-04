package Projects;

import java.util.Scanner;

public class A14HesapMakinesiIfElse {

    public static void main(String[] args) {

        // If - Else If ve Else ile Hesap Makinesi Programi

        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz: ");
        int sayi1, sayi2, secim;
        sayi1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        sayi2 = input.nextInt();
        System.out.print("\nLutfen yapmak istediginiz islemi seciniz: ");
        System.out.print("\n1- Toplama\n2- Cikarma\n3- Carpma\n4- Bolme\n");
        secim = input.nextInt();

        if (secim == 1){
            System.out.println("Toplama: " + sayi1+" + "+sayi2+" = "+((sayi1+sayi2)));
        } else if (secim == 2){
            System.out.println("Cikarma: " + (sayi1+" - "+sayi2)+" = "+((sayi1-sayi2)));
        } else if (secim == 3){
            System.out.println("Carpma: " + (sayi1+" * "+sayi2)+" = "+((sayi1*sayi2)));
        } else if (secim == 4){
            if (sayi2 == 0){
                System.out.println("Ikinci sayi 0'a esittir ve sonuc belirsizdir.");
            }else {
                System.out.println("Bolme: " + (sayi1+" / " +sayi2)+" = "+((sayi1/sayi2)));
            }
        }else {
            System.out.println("Gecersiz bir islem girdiniz tekrar deneyiniz!");

        }

    }
}
