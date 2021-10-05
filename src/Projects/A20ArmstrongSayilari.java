package Projects;

public class A20ArmstrongSayilari {

    public static void main(String[] args) {

        // Armstrong Sayilari Bulan Program

        /*
            153 = (1 X 1 X 1) + (5 X 5 X 5) + (3 X 3 X 3)
            371 = (3 X 3 X 3) + (7 X 7 X 7) + (1 X 1 X 1)

         */

        /*
            153 --> 3 basamakli bir sayi oldugu icin her basamaginin kupunu aldigimizda toplamlari kendine esit oldugu
            icin Armstrong bir sayidir.

            153 = (1 X 1 X 1) + (5 X 5 X 5) + (3 X 3 X 3)
                       1      +     125     +     27      =   153
         */

        int temp, birler, onlar, yuzler, toplam;
        for (int i = 100; i<=999; i++){
            temp = i; // temp gecici bir degiskendir, originalini bozmamak icin uzerinde calisma yapmak icin kullaniriz

            birler = temp % 10;
            temp /= 10;

            onlar = temp % 10;
            temp /= 10;

            yuzler = temp % 10;

            toplam = (birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);

            if (toplam == i){
                System.out.println(i + " bir Armstrong sayidir!");
            }

        }


        // Sayiyi Basamaklarina Ayirma


        // Ornegin 123 sayisini basamaklara ayirmak istiyorsak;
        // 123 --> birler basamagi = 3, onlar basamagi = 2 ve yuzler basamagi = 1
        // 123'un 10'a bolumunden kalan 3'dur. -->  123 % 10 = 3
        // 123'u 10'a boldugumuzde cikan sonuc 12.3 cikar ama int olarak dusundugumuzde noktadan sonrasi isleme dahil
        // olmayacagi icin 12 anlamina gelir.
        // 12'nin 10'a bolumunden kalan 2'dir. --> 12 % 10 = 2
        // 12'yi 10 a bolersek 1.2 sonucu cikar ama yine integer olarak dusundugumuzde gorecegimiz sonuc 1

        System.out.println("Sayiyi basamaklarina ayirma");
        int x=123, bir, on, yuz;

        bir = x % 10;
        System.out.println(bir); // 3

        x = x / 10;
        on = x % 10;
        System.out.println(on); // 2

        x = x / 10;
        yuz = x % 10;
        System.out.println(yuz); // 1

    }
}
