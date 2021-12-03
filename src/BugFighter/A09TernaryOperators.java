package BugFighter;

public class A09TernaryOperators {

    public static void main(String[] args) {

        /*
        syntax;
        variable x = (expression) ? value if true : value if false
         */

        int a = 5;
        int b = 15;

        boolean kosul = a < b; // a b den kucuk mudur --> true
        boolean kosul2 = a > b; // a b den buyuk mudur --> false

        String x = kosul ? "Evet" : "Hayir"; // eger kosul(a b den kucuktur) dogru ise "Evet", yanlis ise "Hayir" dondur.
        // String icine store etmemizin nedeni, soru isaretinden sonra gordugun deger tipi ne ise onun icine store etmek
        // zorundasin, eger soru isaretinden sonra integer bir deger olsaydi int icine store etmemiz gerekecekti.
        System.out.println(x); // Evet --> a b den kucuktur, kosul dogru, dogru ise soru isaretinden hemen sonraki
        // kosul dogru oldugu surece yazdirilacak Strin mesajini yazdirdi.

        String y = kosul2 ? "Evet" : "Hayir"; // eger kosul (a b den buyuktur) dogru ise "Evet", yanlis ise "Hayir" dondur.
        System.out.println(y); // Hayir --> a b den buyuk degildir, kosul false, bu yuzden kosul yanlis oldugunda : dan
        // sonraki mesaji donduruyor.
    }
}
