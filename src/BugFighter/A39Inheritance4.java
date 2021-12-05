package BugFighter;

public class A39Inheritance4 extends A39Inheritance2 {

    // Asistan (Akademisyenin Alt Sinifi)

    protected String yuksekLisans; // encapsulation uygulamak icin public olan access modifier i protected a cevirdik ve
                                 // ardindan getter setter methodlarini olusturduk.

    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }

    public A39Inheritance4(String name, String lastName, String email, String phoneNumber, String department,
                           String responsibilies, String classes, String yuksekLisans) { // String yuksekLisans
        // parametresine kadar olan kisim super() methodu ile ust siniflardan gelen constructor parametreleri, String
        // yuksekLisans parametresi bu sinifa ait.
        super(name, lastName, email, phoneNumber, department, responsibilies, classes); //  A39Inheritance4 sinifi
        // A39Inheritance2 sinifinin alt sinifi oldugu icin A39Inheritance2 sinifinda olusturulan constructor
        // parametrelerinin bu sinif icin de kullanilmasi gerekiyor. A39Inheritance4 sinifi ayni zamanda A39Inheritance1
        // sinfinin da alt sinifi oldugu icin orada var olan constructor parametreleri de kalitimsal olarak bu sinifa
        // geciyor. name, lastName, email, phoneNumber --> verileri A39Inheritance1 sinifindan ve department,
        // responsibilies, classes --> verileri A39Inheritance2 sinifindan geliyor.
        this.yuksekLisans = yuksekLisans;
    }
}
