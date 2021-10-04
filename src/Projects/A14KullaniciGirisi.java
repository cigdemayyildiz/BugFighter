package Projects;

import java.util.Scanner;

public class A14KullaniciGirisi {

    public static void main(String[] args) {

        // Kullanici Girisi Programi

        // Varsayilan Kullanici Adi: Java
        // Varsayilan Parola: 123

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici adinizi giriniz: ");
        String kullaniciAdi, parola;
        kullaniciAdi = input.nextLine();
        System.out.print("Parolanizi giriniz: ");
        parola = input.nextLine();

        if (kullaniciAdi.equalsIgnoreCase("java") && parola.equalsIgnoreCase("123")){
            System.out.println("Giris basarili!");
        }else {
            System.out.println("Giris basarisiz!");
        }

    }
}
