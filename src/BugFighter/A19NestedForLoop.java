package BugFighter;

public class A19NestedForLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) { // bu for loop calismaya baslayacak ve eger kosul saglaniyorsa bir alt satira
                                        // gececek
            for (int j = 1; j <= 5 ; j++) { // bu satirda kosul saglaniyorsa once bu for loop un calismasinin bitmesi
                // beklenecek, ne zaman kosul artik saglanamiyorsa o zaman icerideki dongunun isi bitecek ve bir ustteki
                // donguye gidip onun calismasini tamamlamasi beklenecek.
                System.out.println("i = " + i + " / j = " + j);
            }
        }
        // disaridaki dongu 1'den baslayacak ve i 5'den kucuk ve 5'e esit oldugu surece, i 1 deger artirarak devam et
        // olarak tanimlaniyor. Java yukaridan asagiya okudugu icin disaridaki dongu i 1'e esit ve 5'den kucuk mu diye
        // soruyor ve bu kosula true yanitini aliyor, kosul saglandigi icin bir alt satira geiyor ve bir alttaki satirda
        // da baska bir for dongusunu calistirmaya basliyor. Icerdeki for dongusu de j 1'e esit ve j 5'den kucuk ve 5'e
        // esit oldugu surece bu donguyu dondur komutunu iceriyor. Icerideki donguyu calistirmaya basliyor ve icerideki
        // dongu kosulu artik saglamadigi duruma geldiginde satiri bitiriyor ve yukaridaki henuz dongusunu bitirmemis
        // donguye geri donuyor. distaki dongu da kosulu saylayana kadar dongusunu donduruyor ve kosul artik saglanmadigi
        // noktada donguyu durduruyor.

        /*

        disaridaki dongu            icerdeki dongu
        i = 1           /           j = 1
        i = 1           /           j = 2
        i = 1           /           j = 3       disardaki dongu bir kere donup ilk kosulu saglayinca icerdeki dongu
        i = 1           /           j = 4       tum kosullarini saglayip kosul tamamlaninca dongusunu bitiriyor.
        i = 1           /           j = 5

        i = 2           /           j = 1       disardaki dongu degerini bir artirip diger degerini karsilatirip
        i = 2           /           j = 2       kosulunun hala gecerli olup olmadigini kontrol ediyor ve kosul
        i = 2           /           j = 3       gecerli oldugu icin dongusunu donduruyor ve bir alt satira, icerdeki
        i = 2           /           j = 4       donguye geciyor. icerdeki dongu kendi dongusune bir kere daha basliyor.
        i = 2           /           j = 5

        i = 3           /           j = 1
        i = 3           /           j = 2
        i = 3           /           j = 3
        i = 3           /           j = 4
        i = 3           /           j = 5

        i = 4           /           j = 1
        i = 4           /           j = 2
        i = 4           /           j = 3
        i = 4           /           j = 4
        i = 4           /           j = 5

        i = 5           /           j = 1
        i = 5           /           j = 2
        i = 5           /           j = 3
        i = 5           /           j = 4
        i = 5           /           j = 5
         */
        
    }
}
