package Projects;

import java.util.Scanner;

public class A20TekSayilariToplama {

    public static void main(String[] args) {

         /* Negatif Bir Deger Girilene Kadar Kullanicidan Giris Kabul Eden ve
         Girilen Sayilardan Tek Sayilari Toplayan Program
         */

        Scanner input = new Scanner(System.in);
        int toplam = 0; // tek sayilari bir araya toplayabilecegimiz bir data olusturduk, degerine bilmedigimiz icin
        // baslangic degeri olarak sifir verdik.

        while (true){ // kosul true olduguna gore sonsuz bir dongu
            System.out.print("Lutfen bir sayi giriniz: "); // kullanicidan sayi istedik
            int sayi = input.nextInt(); // kullanicinin sayiyi consola girebilmesi icin kod yazdik
            if (sayi<0){ // eger kullanicinin girdigi sayi 0'dan kucukse
                System.out.println("Program negatif deger girildigi icin sonlandi!"); // bu mesaji
                System.out.println("Girilen tek sayilar toplami: " + toplam); // bu mesaji ve kullanicidan 0'in altinda
                // bir deger gelene kadar toplam storage imizda biriken tek sayilarin toplamini gormek istedigimiz
                // mesaji gosteren satirlari yazdik
                break; // ve donguyu burada bitir komutunu verdik
            }
            if (sayi % 2 == 1){ // tek sayilari girilen sayilar arasindan ayiklayabilmesi icin bir if kosulu olusturduk,
                // kosulda girilen sayi 2'ye bolundugunde kalan 1 oluyorsa statementini yazdik, bu tek sayilari
                // bulma statementi
                toplam+=sayi; // eger if kosulu sagliyorsa buldugu tek sayilari storage etmesi icin baska bir kod yazdik
                // yukarida olusturdugumuz toplam storage ini if kosulundan elde ettigimi tek sayilarla guncellemis
                // olduk.

                // Bu dongu yukaridan baslayacak ve su sekilde donecek;
                // while dongusu true olduguna gore sonsuz bir dongu olacak. Kullanicidan deger girmesini istiyoruz ve
                // ilk if statementta kullanicidan gelen sayinin sifirdan kucuk olup olmadigi kosulunu calistiyoruz.
                // Programimiz negatif bir sayi girildiginde sonlanacagi icin eger girilen sayi sifirin altindaysa
                // programin orada sonlanmasi icin bu if kosulunun govdesine break; komutunu yerlestiriyoruz.
                // Komuttan once ekrana yazdirmak istedigimiz mesajlari yaziyoruz. Ikinci if kosuluna tek sayilari
                // ayiklamak icin kullanilan statement i giriyoruz ve if statement govdesine en basta olusturdugumuz
                // toplam variableinin icine konulmak uzere ayikladigimiz tek sayilari ekliyoruz.
                // Yani toplam isimli olusturdugumuz variable i guncelliyoruz. Negatif bir sayi girildiginde break
                // komutu calismadan once ekrana getirmek istedigimiz mesajla birlikte toplam icinde biriken tek
                // sayilarin toplamini da yazdirma komutunu giriyoruz. Bu komut en son en alttaki if statement hangi
                // tek sayiyi aldiysa onu da toplam variable i icine koyuyor ve break komutunun calismasi icin negatif
                // bir deger girilmis olmasi gerektigi icin elimizdeki en son tek sayilar toplami guncel hali ile ekrana
                // getiriliyor.
            }
        } //System.out.println("Girilen tek sayilar toplami: " + toplam); // burada da yazdirilabilir

    }
}
