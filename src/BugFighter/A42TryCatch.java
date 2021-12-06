package BugFighter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A42TryCatch {

    public static void main(String[] args) {


        // Try-Catch = Try islemde hata var mi diye kontrol ediyor ve catch hatayi yakalayip ekrana hata ile ilgili
        // mesaj donduruyor. Program calismaya kaldigi yerden devam ediyor.

        // Try if() mantigi ile calisiyor, eger hata varsa govdesindeki baska hicbir kodu hicbir mesaji yazdirmayip
        // direk govde disina cikiyor.

        /*

        System.out.println("Program basladi!");
        int a = 2/0;
        System.out.println(a); // ArithmeticException: / by zero
        System.out.println("Program bitti!"); // kod yazarken eger herhagni bir yerde Exception alirsak kod orada
                                             // bitiyor, devam etmiyor.
         */

        System.out.println("Program basladi!"); // Program basliyor
        int b = 0, c = 0, d = 0, f = 0, g = 0, h;
        try { // burada programa govdenin icine yazacagimiz islemin dogru olup olmadigini denemesini soyluyoruz
            b = 2/0; // 2/0 islemi dogru calisacak bir islem olacak mi
        }catch (ArithmeticException e){ // eger try{} govdesindeki islen dogru calismiyorsa hatayi yakala ve catch
            // govdesindeki mesaji ekrana yazdir. catch(){} kismi nasil calisiyor diyecek olursak; Java kutuphanesinde
            // bu olasi hatalar icin olusturulmus siniflar var, catch() parantezinin icinde bi siniftan bir object
            // cagiriyoruz. Biz burada adina e dedigimiz bir object cagirdik. Bu ornek icin catch() methodu
            // ArithmeticException sinifindan bir object ile calisiyor. Eger try{} govdesine girilen islemin hatali
            // bir sonuc verecegini bulursa catch(){} bu hatayi yakaliyor ve ekrana hata ile ilgili mesaj yaziyor.
            // bu islemden sonraki kodlarimiz calismaya devam ediyor ama programin bu kisminda bir hata oldugunu
            // ekrana gelen hata mesaji ile gorebiliyoruz. Bu hata programin calismasina engel olmuyor.
            System.out.println(e.getMessage()); // Yine Java'nin kendi icerisinde her hatanin kendine ozel mesajlari
            // oldugu icin bu ornek icin '/ by zero' hata mesajini ekrana bastirdi. Bir sayi 0'a bolunemeyecegi icin
            // ekranda bu hata mesajini gormemizi sagladi.
        }
        System.out.println(b); // 0
        System.out.println("Program bitti!"); // programin calismaya devam ettigini gostermek icin ekrana bu mesaji
        // yazdirdik.
        System.out.println();

        // Genellikle Array de try-catch kullanimi yaygin cunku rezerv edilen alandan daha fazla bir alan icin veri
        // tanimlamasi yapmak yaygin bir davranis

        /*
        System.out.println("Program Array icin basladi!");
        int [] arr = new int[3]; // Array icinde 3 uzunlugunda yer ayirttik
        arr[4] = 10; // ama Array in 4.uzunlugundaki alana veri girmek istiyoruz. Burada alacagimiz hata
                    // ArrayIndexOutOfBoundsException: Create breakpoint: 4
        System.out.println("Program Array icin bitti!");
        */

        System.out.println("Program Array icin basladi!");
        int [] arr = new int[3];
        try{
            arr[4] = 10;
        }catch (ArrayIndexOutOfBoundsException err){
            System.out.println(err.getMessage());
        }
        System.out.println("Program Array icin bitti!");
        System.out.println();


        // Hatanin ekranda bir diger gosterim sekli toString();

        System.out.println("Program Array icin basladi!");
        int [] arr1 = new int[3];
        try{
            arr1[4] = 10;
        }catch (ArrayIndexOutOfBoundsException err){
            System.out.println(err.toString()); // java.lang.ArrayIndexOutOfBoundsException: 4
            // hatanin kutuphanesini, sinifini ve hatanin neden kaynaklandigini ekrana yazdiriyor
        }
        System.out.println("Program Array icin bitti!");
        System.out.println();


        // Birden fazla hatayi ayni try-catch icinde yazma

        System.out.println("Program birden fazla islemin ayni try-catch icine yazilmasi icin basladi!");
        int [] array = new int[3];
        try {
            c = 3/0;
            array[5] = 8;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()); // '/ by zero' --> ekrana yalnizca 3'un 0'a bolunmesi ile ilgili islem
            // hakkinda mesaj verdi, Array ile ilgili olan hatali islemi dikkate almadi, cunku catch'e try icindeki
            // hatalarin ArithmeticException sinifi icindeki mesajlardan uygun olanini ekrana yazdir komutunu verdik.
            // Ama Array ile ilgili olan hata mesaji bu sinif icinde degil. Bunun icin asagidaki gibi yapmaliyiz.
        }
        System.out.println("Program birden fazla islemin ayni try-catch icine yazilmasi icin bitti!");
        System.out.println();


        // Birden fazla hata ayiklama DOGRU kullanim

        System.out.println("Birden fazla islem DOGRU kullanim basladi!");
        int [] array1 = new int[3];
        try {
            d = 3/1;
            array1[5] = 8;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Birden fazla islem DOGRU kullanim bitti!");
        System.out.println();

        // tek satir Catch icinde gosterim

        System.out.println("Tek satir catch basladi!");
        int [] array2 = new int[3];
        try {
            f = 3/1;
            array2[5] = 8;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException er){ // ayni satirda birden fazla catch hata
            // yakalama taramasi yapabiliyoruz.
            System.out.println(er.toString()); // burada er.getMessage(); yerine er.toString(); kullanmak daha iyi olur
            // cunku ekranda hangi islem ile ilgili hata alindigi ile ilgili daha ayrintili bir mesaja ulasabiliriz.
        }
        System.out.println("Tek satir catch bitti!");
        System.out.println();


        // Kullanicidan hatali veri girisi hatasi yakalama

        System.out.println("Kullanicidan hatali veri girisi!");
        int [] array3 = new int[3];
        Scanner scan = new Scanner(System.in); // Kullanicidan veri girisi isteyecegimiz icin Scanner olusturduk.
        System.out.print("Lutfen bir sayi giriniz: "); // Kullanicidan sayi girmesini istedik ama kullanici String girdi
        // Boyle bir durumda alacagimiz exception: InputMismatchException.
        try {
            g = 3/1;
            array3[2] = 8;
            h = scan.nextInt(); // h degiskeni icin kullanicinin girdigi degerin yazilacagi alan.
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException er){
            System.out.println(er.toString()); // java.util.InputMismatchException --> InputMismatchException sinifini
            // calistirabilmek icin bu sinifi import etmek gerekiyor cunku bu sinif util kutuphanesinden geliyor.
        }catch (Exception err){ // yukaridaki ozellestirilmis siniflarin hepsini icerdigi icin onlarin yerine direkt
            // bu sinifdan da object cagirabilirsin diyor ancak asagida da belirttigimiz gibi ozellestirilmesi sart
            // olan durumlarda bu Exception sinifi digerlerinden ayri tutulup en catch lerin en sonuna yazilmalidir.
            // Exception kullandigimizda getMessage(); yerine toString(); kullanmak daha dogrudur cunku Exception tum
            // hatalari kontrol ettigi icin ekrana yazdirdigi hata hangi islemden geliyor bunu ayrintili bir mesajla
            // ekranda gorebilmek icin toString(); daha kullanisli olacaktir.
            System.out.println(err.toString());
        } finally {
            System.out.println("Finally satiri!!");
        }
        System.out.println("Kullanicidan hatali veri girisi!");

        // Peki boyle her hata icin ayri ayri ozellestirme yapmak zorunda miyiz? Hayir degiliz, tum hata kodlarinin
        // bagli oldugu Ata Sinif --> Exception sinifi. Eger hata bulucunun getirmesini istedigimiz mesajlari tek tek
        // islem bazinda ozellestirmek istemiyorsak catch() parametresi olarak Exception sinifindan bir object
        // olusturabiliriz. Bu ayiklanan tum hatalar icin kendi siniflarindan ilgili mesajlari ekrana getirecektir.
        // Ozellestirmek su acilardan isimize yarar; eger kullanicidan bir sayi girmesini istedik ve yanlislikla harf
        // girdiyse bir kere daha denemesini istedigimiz durumlar olabilir. Bu gibi durumlarda tekrar deneme hakki
        // tanimak isteyecegimiz icin o hataya ozel bir ozellestirme yapabiliriz. Ozellestirme dedigimiz sey ise;
        // (ArithmeticException) - (ArrayIndexOutOfBoundsException) - (InputMismatchException) lar.
        // Eger aralarinda ozellestirmek istedigimiz hata catch leri varsa sadece onlari ozellestirip geri kalan
        // ozellestirme ihtiyaci olmayan catch ler icin Exception sinifini listenin en sonuna yazabiliriz. Boylece
        // ozellestirilmis olanlar kendi ozellestirilmis catch leri ile denetlenecek ozellestirilmemiz olanlar da
        // Exception ile denetlenip uygun mesaj ekrana yazdirilacaktir.

        // finally{} --> try-catch in en sonuna yazilir. Try-catch calistiginda sorun bulsa da bulmasa da yazdirmak
        // istedigimiz mesaj burada gorunur.
    }
}
