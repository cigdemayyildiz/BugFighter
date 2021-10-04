package Projects;

import java.util.Scanner;

public class A20HarmonikSayilar {

    public static void main(String[] args) {

        // Harmonik Sayilar Hesaplayan Program

        // Harmonik formul :  n = 1/1 + 1/2 + 1/3 + ..... 1/n

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        double h = input.nextInt();
        double harmonik = 0;

        while (h > 0){
            harmonik+=(1/h);
            //System.out.println(h + " harmonik karsiligi: " + harmonik);
            h--;
        }
        System.out.println(harmonik);
    }
}
