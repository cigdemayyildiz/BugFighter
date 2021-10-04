package Projects;

import java.util.Scanner;

public class A20YildizlarIleUcgen {

    public static void main(String[] args) {

        // Yildizlarla Ucgen Yapan Program

        /*

        *
        **
        ***
        ****
        *****

         */

        Scanner input = new Scanner(System.in); // kullanicidan deger almak icin Scanner sinifini calistirdik
        System.out.print("Bir sayi giriniz: "); // kullanicidan degeri girmesini istedik
        int star = input.nextInt(); // kullanicinin girdigi degeri storage ettik
        int i = 1; // i adinda donguyu kurmak icin bir degisken olusturduk

        while (i <= star) { // i kullanicinin girdigi degerden kucuk ya da esit oldugu surece donguyu calistir dedik
            int j = 1; // ikinci donguyu olusturmak icin yeni bir degisken tanimladik
            while (j <= i){ // ikinci donguyu j i'den kucuk ya da esit oldugu surece calistir dedik
                System.out.print("*"); // dongu dondugu surece bu mesaji yazdir dedik
                j++; // ikinci dongu icin dongunun nerede bitecegini belirlemesi icin bir komut yazdik.
            }
            i++; // birinci dongu icin dongunun nerede birecegini belirlemesi icin bir komut yazdik.
            System.out.println(); // bir onceki sout ln kullanmadan pritn seklinde olusturduk, bu bos sout da
            // yildizlarin alt alta ucgen seklinde yazilmasi icin gerekli. eger bunu yazmazsak yildizlar tek satirda yazdirilir.
        }

        // Diyelim ki kullanici 3 degerini girdi. star = 3
        // Birinci while dongusu i=1 oldugu icin 1 ile star=3 oldugu icin 3 u karsilastiracak, 1 3'den kucuk ya da 3'e
        // esit mi diye bakacak. 1 3'den kucuk oldugu icin dongu donmeye baslayacak. Bir sonraki donguye geldiginde j=1
        // ve i=1 oldugu icin while icindeki kosulu kontrol edecek ve 1 1'e esit oldugu icin ikinci while dongusunu
        // dondurecek. Dongu dondugu icin ikinci while dongusu govdesindeki * yazdirilacak ve arkasindan alt satira
        // inerek j'nin degerini bir artirip tekrar ikinci while dongusunu kontrol etmeye cikacak. j 1 artirildigi icin
        // j'nin yeni degeri 2 oldu ve bu durumda j=2 ve i=1 oldugu icin j artik i den buyuk oldugu icin dongu kirilacak
        // ve govdesini atlayarak govde disina cikacak. Govde disinda ilk while dongusune ait i++; oldugu icin i'yi 1
        // deger artirip birinci donguyu kontrol etmeye cikacak. Birinci dongude artik i=2 oldugu icin ve kullanici star
        // degiskeni icin 3 sayisini girdigi icin, 2 ile 3 u karsilastiracak ve i'nin hala star'dan kucuk oldugu sonucuna
        // varip donguyu dondurecek. Bir alt satira inecek ve orada j bir onceki donguden bagimsiz olarak, bir onceki
        // dongude j++; ile her ne kadar increase edilmis olsa da yeniden 1 degerini alacak. Cunku birinci dongu donup
        // ikinci dongu icine girdiginde ilk karsisina cikan satir int j = 1; satiri oldugu icin j yeniden 1 degerine
        // sahip. Ikinci dongu icine girecek ve ikinci while kosulunu kontrol edecek, j=1 ve i=2, bu durumda j i'den
        // kucuk oldugu icin donguyu dondurecek ve govdesindeki *'dan bir tane daha yazdiracak ve bir alt satira gecerek
        // j'yi 1 deger artiracak. j=2 ve i=2 kosulunu kontrol edece ve j i'den kucuk degil ama esit oldugu icin donguyu
        // bir kere daha dondurecek ve govdedeki mesajda yer alan *'dan bir tane daha yazdiracak. Su ana kadar toplam 3
        // tane * yazdirmis oldu. Mesaji yazdirdiktan sonra bir alt satira inerek j++; ile j'ye 1 deger ekleyecek ve j=3
        // olacak. Ikinci while a cikip kontrol edecek ve j artik i'den buyuk oldugu icin donguyu kiracak ve
        // calistirmayip govdeyi atlayarak govde disina cikacak. i++; ile i 1 deger artirilacak ve birinci while
        // dongusu kontrol ediecek, i=3 ve star=3 oldugu icin bir esitlik durumu oldugu icin dongu bir kere daha
        // calisacak ve bir satir alta inecek. int j = 1; satirindan dolayi j'nin degeri 1 oldugu icin ikinci while
        // kosulu j=1 ve i=3 seklinde kontrol edilecek. j i'den kucuk oldugu icin dongu donecek ve govdedeki mesaj
        // icerisinden bir * daha yazdirilacak ve boylece su ana kadar 4 adet * yazdirilmis olacak. bir satir alta
        // inecek ve j++; satiri ile j'ye 1 deger ekleyecek ve j=2 olacak, ikinci while kosulunu kontrol edecek ve
        // j=2 ve i=3 oldugu icin kosul yine saglanacak ve dongu donecek, govdedeki *'dan bir tane daha yazdirilip
        // toplamda 5 tane * yazdirilmis olacak. Bir alt satirda j++; ile j 1 deger daha artirilacak ve j=3 ve i=3
        // kosulunu saglayip saglamadigi ikinci while icinde kontrol edilecek. j i'den kucuk degil ama i'ye esit oldugu
        // icin dongu bir kere daha donecek ve govdeden bir * daha yazdiracak ve toplamda yazdirilan *'larin sayisi 6
        // olacak. Bir satir alta inip j++; ile j'ye 1 deger daha eklenecek ve j=4 olacak, ikinci while dongusune cikip
        // kontrol edilecek ve dongu kosulu saglanmadigi icin dongu burada kirilacak ve govdenin disina cikip i++;
        // satirina ulasacak ve burada i'ye 1 deger eklenecek. Birinci while dongusune cikilacak ve i=4 star=3 degerleri
        // ile birinci while kosulu saglaniyor mu kontrol edildiginde i star'dan buyuk oldugu icin kosul saglanmayacak
        // ve dongu kirilip program sonlandirilacak.

    }
}
