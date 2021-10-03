package BugFighter;

public class A12IfElseStatement {

    public static void main(String[] args) {

        int a = 50;
        int b = 20;

        if (a == b){ // if true false degerlerien bakiyor, true ise icindeki body yi calistiriyor degilse blogu dikkate
            // almadan atlayip devam ediyor.
            System.out.println("A ve B sayilari birbirine esittir.");
        }
        else { // eger if kosul saglanmadiysa, if kosul false ise o zaman else calismaya baslayacak.
            // else komutunu kullanmak icin if den sonra kullanmak gerekir.
            System.out.println("A ve B sayilari birbirine esit degildir.");
        }

    }
}
