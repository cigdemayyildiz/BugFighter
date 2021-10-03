package BugFighter;

public class A13ElseIfStatement {

    public static void main(String[] args) {

            int a = 10;
            int b = 20;
            int c = 5;

            if (b == c){ // if kosulu eger true donduruyorsa sadece, if body sindeki islemler calistirilacak ve sonraki
                // satirlari dikkate almadan atlayip blogun tamamen sonuna inecek, else if ve else bodyleri icindeki
                // islemleri dikkate almayacak.
                System.out.println("B ve C birbirine esittir.");
            }
            else if (a < c){ // if kosulu false donduruyorsa, if body sindeki islemleri dikkate almadan atlayip else if
                // kosulunu kontrol edecek, eger else if kosulu true donduruyorsa, else if bodysindeki islemleri yapacak ve
                // else bodysindeki islemleri dikkate almadan atlayip blok sonuna gececek.
                // else if in siniri yok istedigimiz kadar kosul karsilastirmasi yapabiliyoruz.
                System.out.println("A kucuktur C'den");
            }
            else { // if ve else if kosullari false dondurdugu durumda if ve else if bodylerindeki islemleri dikkate almadan
                // atlayip else bodysindeki islemleri yapacak. else icin kosul tanimlanmiyor cunku zaten if de ve else if de
                // tanimlanan kosullari gecerli degilse calistigi icin yukardaki kosullarin disinda kalan durumlar icin else
                // kullaniliyor.
                System.out.println("B ve C esit degildir.");
            }


            if ((a<c) && (a<b)){
                System.out.println("A en kucuk sayidir.");
            }
            else if ((c<a) && (c<b)){
                System.out.println("C en kucuk sayidir.");
            }
            else {
                System.out.println("B en kucuk sayidir.");
            }


            if (a == 10){
                System.out.println("A esittir 10'a.");
            }

    }
}
