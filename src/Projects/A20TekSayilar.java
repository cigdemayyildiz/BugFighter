package Projects;

public class A20TekSayilar {

    public static void main(String[] args) {

        // 1'den 100'e Kadar Olan Tek Sayilari Ekrana Yazdiran Program

        int i = 1;
        while (i<=100){
            if (i % 2 == 1){
                System.out.println(i);
            }
            i++;
        }

    }
}
