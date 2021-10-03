package BugFighter;

public class A08LogicalOperators {

    public static void main(String[] args) {

        /*
                True / False Table
         A            B          &&          ||
       false        false       false       false
       true         true        true        true
       false        true        false       true
       true         false       false       true
         */

        int a = 5;
        int b = 10;

        boolean kosul = a == b; // a b ye esit midir --> false
        boolean kosul2 = a < b; // a b den kucuk mudur --> true
        boolean kosul3 = a > b; // a b den buyul mudur -- > false
        boolean kosul4 = a != b; // a b ye esit degil midir --> true

        boolean mantiksal = kosul && kosul2; // kosul = false ve kosul2 = true
        System.out.println(mantiksal); // false --> && operatoru kullanildiginda her iki kosulun da dogru olmasi
        // bekleniyor. iclerinden biri yanlis olursa false donduruyor.

        boolean mantiksal2 = kosul2 && kosul4; // kosul2 = true ve kosul4 == true
        System.out.println(mantiksal2); // true --> && operatoru kullanildiginda sag ve soldaki kosullarin ikisininda
        // dogru olma kosulu oldugundan ikisi de dogru oldugunda true donduruyor.

        boolean mantiksal3 = kosul3 || kosul2; // kosul3 = false ya da kosul2 = true
        System.out.println(mantiksal3); // true --> || operatoru kullanildiginda kosullardan birinin dogru olmasi
        // yeterli, kosullardan biri dogru iken dogru donduruyor.

        boolean mantiksal4 = kosul || kosul4; // kosul = false ve kosul4 = false
        System.out.println(!mantiksal4); // false --> || operatorunde iki taraftan biri true oldugu surece true
        // donduruyor ama burada mantiksal4 u yazdirirken basina unlem(!) isareti koyarsak, cikan sonucun tersini
        // yazdir anlamina geldigi icin false dondurecek.

        boolean mantiksal5 = kosul2 && kosul4; // kosul2 = true ve kosul4 = true
        System.out.println(!mantiksal5); // false --> && operatorunde true dondurmesi icin her iki kosulunda da true
        // olmasi gerekiyor, burada her iki kosul true olmasina ragmen false dondurmesinin nedeni mantiksal5 i
        // yazdirirken basina unlem(!) koyulmus olmasi.

    }
}
