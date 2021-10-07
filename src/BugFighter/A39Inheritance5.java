package BugFighter;

public class A39Inheritance5 extends A39Inheritance2 {

    // Ogretim Uyesi (Akademisyenin Alt Sinifi)

    protected String unvan; // encapsulation uygulamak icin public olan access modifier i protected a cevirdik ve
    // ardindan getter setter methodlarini olusturduk.

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public A39Inheritance5(String name, String lastName, String email, String phoneNumber, String department,
                           String responsibilies, String classes, String unvan) { // String unvan parametresine kadar
        // olan kisim super() methodu ile ust siniflardan gelen constructor parametreleri, String unvan parametresi bu
        // sinifa ait.
        super(name, lastName, email, phoneNumber, department, responsibilies, classes); //  A39Inheritance5 sinifi
        // A39Inheritance2 sinifinin alt sinifi oldugu icin A39Inheritance2 sinifinda olusturulan constructor
        // parametrelerinin bu sinif icin de kullanilmasi gerekiyor. A39Inheritance5 sinifi ayni zamanda A39Inheritance1
        // sinfinin da alt sinifi oldugu icin orada var olan constructor parametreleri de kalitimsal olarak bu sinifa
        // geciyor. name, lastName, email, phoneNumber --> verileri A39Inheritance1 sinifindan ve department,
        // responsibilies, classes --> verileri A39Inheritance2 sinifindan geliyor.
        this.unvan = unvan;

    }

}
