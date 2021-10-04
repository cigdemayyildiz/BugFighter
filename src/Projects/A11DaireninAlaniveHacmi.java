package Projects;

import java.util.Scanner;

public class A11DaireninAlaniveHacmi {

    public static void main(String[] args) {

        // Dairenin Alanini ve Hacmini Bulan Program

        Scanner input = new Scanner(System.in);
        int r;
        double alan, hacim, pi = 3.14;
        System.out.print("Daire yari capini giriniz: \n");
        r = input.nextInt();
        alan = 2 * pi * r;
        hacim = pi * (r*r);
        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairanin hacmi: "+ hacim);

    }
}
