package BugFighter;

public class A18ForLoop {

    public static void main(String[] args) {

        /*
        For Dongusu Syntax;

        for(baslangic degeri ; kosul ; artirma/eksiltme){
            kodlama
        }

         */

        System.out.println("Dongu basladi");
        for (int i = 1; i<=5; i++){ // i'ye 1 degerini atadik; i 5'den kucuk ve 5'e esit oldugu surece donguyu dondur;
                                    // i++; i'yi 1'er artir.
            System.out.println(i); // for loop daki kosul saglaniyorsa govdededki kodu/mesaji yazdir
        }
        System.out.println("Dongu bitti");

        System.out.println();

        System.out.println("Ikinci dongu basladi");
        for (int i = 5; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("Ikinci dongu bitti");

        System.out.println();


        // Butun dongulerle ayni islemi yaparak aradaki dongu kurma mantigini anlama

        int a = 1;
        System.out.println("While dongusu asagidadir");
        while (a<=5){
            System.out.println(a);
            a++;
        }

        int b = 1;
        System.out.println("Do While dongusu asagidadir");
        do {
            System.out.println(b);
            b++;
        }while (b<=5);

        System.out.println("For dongusu asagidadir");
        for (int c=1; c<=5; c++){
            System.out.println(c);
        }

    }
}
