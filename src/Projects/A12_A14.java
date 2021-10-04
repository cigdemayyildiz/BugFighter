package Projects;

import java.util.Scanner;

public class A12_A14 {

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

        // Switch ile Hesap Makinesi Programi

        switch (secim){
            case 1:
                int toplama = sayi1 + sayi2;
                System.out.println("Toplama: " + (sayi1+" + "+sayi2+" = "+toplama));
                break;
            case 2:
                int cikarma = sayi1 - sayi2;
                System.out.println("Cikarma: " + (sayi1+" - "+sayi2+" = "+cikarma));
                break;
            case 3:
                int carpma = sayi1 * sayi2;
                System.out.println("Carpma: " + (sayi1+" * "+sayi2+" = "+carpma));
                break;
            case 4:
                if (sayi2 == 0){
                    System.out.println("Ikinci sayi 0'a esittir ve sonuc belirsizdir.");
                }else {
                System.out.println("Bolme: " + (sayi1+" / " +sayi2+" = "+(sayi1/sayi2)));
                }
                break;
            default:
                System.out.println("Gecersiz bir islem girdiniz tekrar deneyiniz!");
        }
        System.out.println();


        // Kullanici Girisi Programi


        // Varsayilan Kullanici Adi: Java
        // Varsayilan Parola: 123

        input.nextLine();
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
        System.out.println();


        // Not Ortalamasina Gore Sinif Gecme Programi

        // Turkce, Matematik, Fen Bilgisi, Sosyal Bilgisi ve Beden Egitimi ders notlari girilsim
        // Notlarin ortalamasi hesaplansin
        // Ortalama 50'den dusukse sinif tekrari, degilse sinifi gecsin.

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
        System.out.println();


        // Ucak Bileti Fiyati Hesaplayan Program

        /*
        - Km birim fiyati: 0.10$
        - 12 yasindan kucuk yolculara toplam fiyata %50 indirim
        - 12 ve 24 yas arasindaki yolculara %10 indirim
        - 65 yasindan buyuk yolculara %30 indirim
        - Gidis-donus biletlerde %20 indirim
        - Bu kosullara gore ucak bileti hesaplayan program
         */

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
        System.out.println();


        // Etkinlik Oneren Program

        /*
         - Hava sicakligi al
         - Sicaklik 30 derece veya daha yuksekse yuzme etkinligini oner
         - 5 ile 30 derece arasindaysa sinema etkinligini oner
         - 4 ve daha az ise kayak etkinligini oner
         */

        System.out.print("Lutfen hava sicakligini giriniz:");
        int havaSicakligi = input.nextInt();
        String yuzmeEtkinligi = "Bugun yuzme etkinligine gidebilirsiniz.";
        String sinemaEtkinligi = "Bugun sinemaya gidebilirsiniz.";
        String kayakEtkinligi = "Bugun kayaga gidebilirsiniz.";

        if (havaSicakligi>30){
            System.out.println(yuzmeEtkinligi);
        }else if (havaSicakligi>=5 && havaSicakligi<=30){
            System.out.println(sinemaEtkinligi);
        }else {
            System.out.println(kayakEtkinligi);
        }
        System.out.println();

        // Sayilari Buyukten Kucuge Siralayan Program

        /*
        a > b > c veya a > c > b
        b > a > c veya b > c > a
        c > a > b veya c > b > a
         */

        int a, b, c;
        System.out.print("Lutfen birinci sayiyi giriniz: ");
        a = input.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        b = input.nextInt();
        System.out.print("Lutfen ucuncu sayiyi giriniz: ");
        c = input.nextInt();

        if (a > b && a > c){ // a nin en buyuk oldugu kosul
            if (b > c){ // b nin c den buyuk oldugu kosul
                System.out.println("a > b > c");
            }else{ // eger ikinci if kosulu dogru degilse demek ki b c den buyuk degil ve o zaman c b den buyuk
                System.out.println("a > c > b");
            }
        }else if (b > a && b > c) { // b nin en buyuk oldugu kosul
            if (a > c) { // a nin c den buyuk oldugu kosul
                System.out.println("b > a > c");
            } else { // eger ikinci if kosulu dogru degilse demek ki a c den buyuk degil ve o zaman c a dan buyuk
                System.out.println("b > c > a");
            }
        }else { // burada tekrar else if yapamaya gerek yok cunku yukarida zaten iki olasiligi da denedigimiz icin
            // buraya sadece c nin en buyuk olma kosulu kaliyor. buraya tekrar else if icerisinde kosul da
            // olusturabiliriz ama gerek yok cunku zaten karsilastirilacak son veri belli, c en buyuk sayi mi?
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }

    }
}
