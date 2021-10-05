package Projects;

import java.util.Scanner;

public class A20FibonacciSerisi {

    public static void main(String[] args) {

        // Fibonacci Serisini Bulan Program

        // Fibonacci Serisi --> 0, 1, 1, 2, 3, 5, 8, 13, 21, ......

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = input.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;
        int toplam;

        System.out.println(num + " sayisinin Fibonacci serisi:");

        for (int i = 0; i <= num; i++) { // kullanicinin verdigi deger fibonaccinin uzunlugunu belirleyecek
            System.out.print(sayi1 + ", ");
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }

    }
}
