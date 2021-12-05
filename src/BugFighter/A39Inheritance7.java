package BugFighter;

public class A39Inheritance7 extends A39Inheritance3{

    // Bilgi Islem Memutu (Memurun Alt Sinifi)

    protected String gorev; // encapsulation uygulamak icin public olan access modifier i protected a cevirdik ve
    // ardindan getter setter methodlarini olusturduk.

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public A39Inheritance7(String name, String lastName, String email, String phoneNumber, String department,
                           String workHours, String gorev) { // String gorev parametresine kadar olan kisim super()
        // methodu ile ust siniflardan gelen constructor parametreleri, String gorev parametresi bu sinifa ait.
        super(name, lastName, email, phoneNumber, department, workHours); //  A39Inheritance7 sinifi
        // A39Inheritance3 sinifinin alt sinifi oldugu icin A39Inheritance3 sinifinda olusturulan constructor
        // parametrelerinin bu sinif icin de kullanilmasi gerekiyor. A39Inheritance7 sinifi ayni zamanda A39Inheritance1
        // sinfinin da alt sinifi oldugu icin orada var olan constructor parametreleri de kalitimsal olarak bu sinifa
        // geciyor. name, lastName, email, phoneNumber --> verileri A39Inheritance1 sinifindan ve department,
        // workHours --> verileri A39Inheritance3 sinifindan geliyor.
        this.gorev = gorev;
    }
}
