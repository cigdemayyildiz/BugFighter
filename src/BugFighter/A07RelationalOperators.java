package BugFighter;

public class A07RelationalOperators {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 5;

        boolean kosul = sayi1 == sayi2; // sayi1 sayi2 ye esit midir
        System.out.println(kosul); // false --> degildir bu yuzden false

        boolean kosul2 = sayi1 > sayi2; // sayi1 sayi2 den buyuk mudur
        System.out.println(kosul2); // true

        boolean kosul3 = sayi1 < sayi2; // sayi1 sayi2 den kucuk mudur
        System.out.println(kosul3); // false

        boolean kosul4 = sayi1 <= sayi2; // sayi1 sayi2 den kucuk veya esit midir
        System.out.println(kosul4); // false

        boolean kosul5 = sayi1 >= sayi2; // sayi1 sayi2 den buyuk ya da esit midir
        System.out.println(kosul5); // true

        boolean kosul6 = sayi1 != sayi2; // sayi1 sayi2 ye esit degil midir
        System.out.println(kosul6); // true

        boolean kosul7 = (sayi1 / sayi2) == 0; // sayi1 in sayi2 ye bolumu sifira esit midir
        System.out.println(kosul7); // false --> degildir cunku 10 / 5 = 2

        boolean kosul8 = (sayi1 / sayi2) == 2; // sayi1 in sayi2 ye bolumu 2 ye esit midir
        System.out.println(kosul8); // true --> esittir cunku 10 / 5 = 2

        boolean kosul9 = sayi1 == sayi2; // sayi1 sayi2 ye esit midir
        System.out.println(!kosul9); // true --> sayi1 sayi2 ye esittir ama kosul9 u ekrana yazdirmak istedigimizde
        // basina unlem(!) isareti koydugumuzda bu gordugun sonucun tersini yazdir anlamina geldigi icin true dondurdu.
    }
}
