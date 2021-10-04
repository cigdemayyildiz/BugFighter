package Projects;

import java.util.Scanner;

public class A20FaktoriyelHesaplama {

    public static void main(String[] args) {

        // Faktoriyel Hesaplama Programi

        // Faktoriyel formul :   5! = 5 X 4 X 3 X 2 X 1

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen faktoriyelinin alimasini istediginiz sayiyi giriniz: ");
        int f = input.nextInt();
        int faktoriyel = 1;

        while (f > 0){ // dongunun ne kadar surecegini belirleyen komut
            faktoriyel*=f; // f nin faktoriyelle carpimini faktoriyelin icine koy komutu
            System.out.println(f + "'in faktoriyeli: " + faktoriyel);
            f--; // dongunun nerede bitecegini belirleyen komut
        }
        System.out.println("Girdiginiz sayinin faktoriyeli: " + faktoriyel);


    }
}
