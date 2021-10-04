package Projects;

import java.util.Scanner;

public class A14EtkinlikOnerme {

    public static void main(String[] args) {

        // Etkinlik Oneren Program

        /*
         - Hava sicakligi al
         - Sicaklik 30 derece veya daha yuksekse yuzme etkinligini oner
         - 5 ile 30 derece arasindaysa sinema etkinligini oner
         - 4 ve daha az ise kayak etkinligini oner
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen hava sicakligini giriniz:");
        int havaSicakligi = input.nextInt();
        String yuzmeEtkinligi = "Bugun yuzme etkinligine gidebilirsiniz.";
        String sinemaEtkinligi = "Bugun sinemaya gidebilirsiniz.";
        String kayakEtkinligi = "Bugun kayaga gidebilirsiniz.";

        if (havaSicakligi>30){
            System.out.println(yuzmeEtkinligi);
        }else if (havaSicakligi>=5 && havaSicakligi<=30){
            System.out.println(sinemaEtkinligi);
        }else {
            System.out.println(kayakEtkinligi);
        }

    }
}
