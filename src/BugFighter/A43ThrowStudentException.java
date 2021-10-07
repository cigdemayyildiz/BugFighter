package BugFighter;

public class A43ThrowStudentException extends Exception{ // Kendimize ait Exception sinifi olustururken sinifimizi
                                                        // Exception sinifinin alt sinifi yapiyoruz.


    // A43ThrowStudentException isimli hata depolama sinfimizi ilk once Exception sinifinin alt sinifi yaparak
    // Exception sinifinin tum ozelliklerinden yararlanma islemini tamamladik.
    // Ardindan constructor i olusturup constructor in govdesinde superclass imizin String ihtiyaci olan constructor i
    // nasil calisiyorsa o sekilde calismasi icin super(kullanicidan gelecek mesaj); seklinde kodumuzu yazdik.

    public A43ThrowStudentException(String msg){ // String tipinde bir veri alabilsin seklinde olusturuyoruz.
        super(msg); // Method tarafindan bir String deger kabul edildiginde Exception sinifinda String kabul eden
        // Constructor ne yapiyorsa onu yapmasi icin super sinifimizin davranisini getiriyoruz.
    }

    // Bundan sonra A43ThrowStudent sinifinda ne zaman bir kontrol ve sonrasinda hata olup olmadigini ayiklama ve varsa
    // olusturdugumuz hata kodlarini ekrana yazdirma ihtiyaci duyarsak bu siniftaki olusturdugumuz kodlar bize
    // referans olacak. Bu sinif da Exception sinfina tabii olacak.


}
