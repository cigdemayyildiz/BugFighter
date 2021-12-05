package BugFighter;

import java.util.Arrays;

public class A28MultidimensionalArray {

    public static void main(String[] args) {

        // Multidimensional Array = Cok Boyutlu Diziler

        // int [][] list = new int[][]; --> Multidimensional Array syntax

        // Multidimensional Array tablo olusturmak icin kullaniliyor

        // birinci []--> satirlari (rows) gosteriyor
        // ikinci []--> sutunlari (column) gosteriyor

        int [][] list = new int[4][3];

        list[0][0] = 1;
        list[0][1] = 75;
        list[0][2] = 10;
        System.out.print(list[0][0] + " ");
        System.out.print(list[0][1] + " ");
        System.out.print(list[0][2] + " ");
        list[1][0] = 2;
        list[1][1] = 87;
        list[1][2] = 13;
        System.out.print("\n"+list[1][0] + " ");
        System.out.print(list[1][1] + " ");
        System.out.print(list[1][2] + " ");
        list[2][0] = 3;
        list[2][1] = 95;
        list[2][2] = 15;
        System.out.print("\n"+list[2][0] + " ");
        System.out.print(list[2][1] + " ");
        System.out.print(list[2][2] + " ");
        list[3][0] = 4;
        list[3][1] = 103;
        list[3][2] = 17;
        System.out.print("\n"+list[3][0] + " ");
        System.out.print(list[3][1] + " ");
        System.out.print(list[3][2] + " ");
        System.out.println();

        // for loop ile kodu kisa tutarak tek tek elle sout icinde yazdirmadan tablo olusturma
        System.out.println("For loop ile olusturulan tablo");

        for (int i = 0; i < list.length; i++) { // list2.length satir uzunlugunu(sayisini) veriyor, satir sayisi kadar
            // dondur demek icin ve Array in ilk datasi o'dan basladigi icin i'yi 0'dan baslatiyoruz ve satir sayisi
            // kadar bu donguyu dondur diyoruz. Burada i'yi 1'den baslatip i'yi length'den kucuk ya da length'e esit
            // olarak yazamayiz.
            for (int j = 0; j < list[0].length; j++) { // list[0].length; --> [1, 75, 10] ifade ediyor. list'in 0.datasi [1, 75, 10]
                System.out.print(list[i][j] + " ");
            }
            System.out.println();

        }

        int [][] list2 = new int [][]{
            {1,75,10},{2,87,13},{3,95,15},{4,103,17}
        };

        System.out.println(Arrays.deepToString(list2));
    }
}
