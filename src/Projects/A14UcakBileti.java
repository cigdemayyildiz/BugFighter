package Projects;

import java.util.Scanner;

public class A14UcakBileti {

    public static void main(String[] args) {

        // Ucak Bileti Fiyati Hesaplayan Program

        /*
        - Km birim fiyati: 0.10$
        - 12 yasindan kucuk yolculara toplam fiyata %50 indirim
        - 12 ve 24 yas arasindaki yolculara %10 indirim
        - 65 yasindan buyuk yolculara %30 indirim
        - Gidis-donus biletlerde %20 indirim
        - Bu kosullara gore ucak bileti hesaplayan program
         */

        Scanner input = new Scanner(System.in);
        int km, yas, tip;
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();
        System.out.print("Yolcunun yasini giriniz: ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini seciniz: \n1- Tek Gidis\n2- Gidis/Donus");
        tip = input.nextInt();
        double biletTutari, yasIndirimi, tipIndirimi;

        if (km > 0 && yas > 0 && (tip==1) || (tip==2)){ // km ve(&&) yas 0 dan kucuk olamayacagi icin oncelikle bu
            // bilgileri fikslemek icin kullanicidan gelen km ve(&&) yas bilgilerinin sifirdan buyuk olmasi ve(&&)
            // tipin de 1 e ya da(||) 2 ye asit olmasi durumunda verilen verilerin hesaplamada calisacagini gostermek
            // icin bu kod satirini yazdik
            biletTutari = km * 0.10; // bilet tutarini km basina 0.10$ olacak sekilde hesapladik.
            if (yas < 12){ // eger yolcu 12 yasindan kucukse
                yasIndirimi = biletTutari * 0.50; // bilet tutari uzerinden %50 indirim hesaplamasini yaptik.
            }else if (yas >= 12 && yas <= 24){ // eger yolcu 12 yas ve uzeri ise ve 24 yas ve alti ise
                yasIndirimi = biletTutari * 0.10; // bilet tutari uzerinden %10 indirim hesaplamasini yaptik.
            }else if (yas >= 65){ // eger yolcu 65 yas ve uzeri ise
                yasIndirimi = biletTutari * 0.30; // bilet tutari uzerinden %30 indirim hesaplamasini yaptik.
            }else { // eger yukaridaki sartlarin hicbirini saglamiyorsa, mesela yolcu 25 yasindan buyuk ve 65 yasindan
                // kucukse yukaridaki kosullardan hicbirine dahil olmadigi icin yas indiriminden yararlanamiyor ve yas
                // indirimi onun icin sifir oluyor.
                yasIndirimi = 0;
            }
            biletTutari -= yasIndirimi; // if blogundan hemen sonra bu hesaplama, if blogu icindeki yas indirimi
            // hesaplamalarinin sonuclarini bilet tutarindan cikararak indirimli bilet tutarina ulasacak. else govdesinde
            // zaten yas indiriminden yararlanamayacak olan yolcular icin yas indirimine sifir degerini verdigimiz icin
            // bilet tutarindan sifir cikaracak ve kalan tutar normal(indirimsiz) bilet fiyati olacak.
            if (tip==2){ // eger yolcu bileti gidis-donus alirsa
                tipIndirimi = biletTutari * 0.20; // bilet tutari yas indirimi hesaplamalarindan sonra guncellendigi
                // icin indirimli bilet fiyatindan ekstra gidis-donus indirimi hak edenlerin hesaplamasi yapilacak.
                biletTutari -= tipIndirimi; // yas indiriminden sonraki bilet tutari - gidis/donus bilet indirimi
            }
            System.out.println("Bilet tutari: " + biletTutari + "$");
        }else { // eger kullanicidan km ve yas verilerinden biri sifirin altinda verilirse ve tip verisi icin
            // kullanicidan gelen veri 1 veya 2 den farkliysa, verilen verilerle hesaplama yapilamayacagi icin
            // kullaniciya uyari vermek icin bu kod satirid yazildi.
            System.out.println("Girilen degerler eksik veya yanlis, lutfen tekrar deneyin!");
        }

    }
}
