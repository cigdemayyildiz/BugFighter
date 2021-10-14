package BugFighter;

import java.util.Scanner;

public class A20BreakAndContinue {

    public static void main(String[] args) {

        // Break; --> donguyu durdurur
        // Continue; --> donguyu durdurmaz ama bir sonraki adima gecirir

        // Break;

        while (true){ // while true oldugu surece govdesindeki kod/mesaj sonsuza kadar doner (infinite loop)
            System.out.println("**");
            break; // break; komutunu ekledigimiz anda donguyu durdururuz
        }

        Scanner input = new Scanner(System.in);


        while (true){
            System.out.print("Donguyu durdurmak icin dogru sayiyi giriniz: ");
            int sayi = input.nextInt();
            if (sayi == 0){
                System.out.println("Donguyu durduran dogru sayiyi buldunuz!");
                break;
            }
            System.out.println(sayi);
        }
        // bu gibi kullanicidan veri istedigimiz ve verinin dogrulugunu kontrol etmemiz gereken durumlarda ya da
        // kullaniciya kullanici adi ve parolasini uc kere yanlis girmesi durumunda hesabini bloke edecegimiz durumlarda
        // bu sonsuz donguleri kullanir ve donguyu bitirmek istedigimiz noktada break; komutunu kullaniriz.

        System.out.println();

        // Continue;

        for (int i = 1; i <=10 ; i++) {
            if (i == 4 || i == 9) {
                System.out.println("atladi = " + i);
                continue;
            }
            System.out.println("i = " + i);
        }
        // continue; komutu if kosuluna bagli olarak calisir. ornekte de goruldugu gibi eger if 4'e veya 9'a esitse
        // 4 ve 9 gordugun yerleri atla kodu yazdirmaya, donguyu calistirmaya devam et anlamina geliyor. Ornekte dongu
        // calismaya basladi 4 e geldiginde 4'e esit oldugu durumda continue; komutunu kullan dedigimiz icin 4'u atladi,
        // donguyu dondurmeye devam etti ve 9'a geldiginde yine 9'u gordugunde atla anlamina gelen continue; komutu
        // kullaniyor olmamizdan oturu 9'u atlayip kodu calistirmaya/donguyu dondurmeye devam etti.
    }
}
