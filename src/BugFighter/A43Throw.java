package BugFighter;

public class A43Throw {

    public static void main(String[] args) {

        // Throw = Atmak
        // Exceptionlari atmak gibi dusunulebilir

        // Throw ile kendi hatalarimizi olusturabiliriz. Java kendi icerisinde ongorebildigi tum hatalari hazirlamis
        // durumda ama bazi hatalar bizim sistemimize ozel olmak zorunda olabilir. Mesela bir deger sadece bizim
        // projemize ait olabilir ve o degeri bir baska degerle karsilastirip true ya da false durumlarina gore yeni
        // bir hata kodu uretebiliriz. Bu durumlarda throw kullaniyoruz.

        // Throw u birden fazla degisken kosullari sagliyor mu saglamiyor mu karsilastirmasindan sonra olusturmamiz
        // gerektigi icin if(){} bloklari icinde yer aliyor. Yani eger bir deger baska bir degere esitse throw
        // olustur ki ekranda mesaj gostersin ya da tam tersi bir deger baska bir degere esit degilse throw olustur ki
        // ekrana bir hata mesaji gondersin. Tek basina bagimsiz olarak herhangi bir karsilatirma sonrasi alinan
        // sonuca ihtiyaci yokmus gibi bagimsiz bir throw olusturamayiz.

        int a = 0;
        if (a==0){
            throw new ArithmeticException("Bolen sifira esit olamaz!"); // Yeni bir hata olusturduk ve eger bir sayinin
            // bolenini if() icerisinde kontrol ettirmek istersek ve o sayi 0'a esit olursa ekranda bir hata mesaji
            // gorecegiz -->  java.lang.ArithmeticException: Bolen sifira esit olamaz!
            // ArithmeticException sinifinda parantez icine String deger girmemize izin veren bir constructor oldugu
            // icin bu degeri girebiliyor. Ayni sekilde sinifta bos bir constructor da olusturulmus oldugu icin bos da
            // birakabiliyoruz.
        }
        System.out.println("Kodun devami"); // ve hata aldigimiz icin kodun devami gelmeyecek, kod orada calismayi
                                            // durduracak.

    }
}
