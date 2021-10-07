package BugFighter;

public class A39Inheritance6 extends A39Inheritance3 {

    // Guvenlik Gorevlisi (Memurun Alt Sinifi)

    protected String belge; // encapsulation uygulamak icin public olan access modifier i protected a cevirdik ve
    // ardindan getter setter methodlarini olusturduk.

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public A39Inheritance6(String name, String lastName, String email, String phoneNumber, String department,
                           String workHours, String belge) { // String belge parametresine kadar olan kisim super()
        // methodu ile ust siniflardan gelen constructor parametreleri, String belge parametresi bu sinifa ait.
        super(name, lastName, email, phoneNumber, department, workHours); //  A39Inheritance6 sinifi
        // A39Inheritance3 sinifinin alt sinifi oldugu icin A39Inheritance3 sinifinda olusturulan constructor
        // parametrelerinin bu sinif icin de kullanilmasi gerekiyor. A39Inheritance6 sinifi ayni zamanda A39Inheritance1
        // sinfinin da alt sinifi oldugu icin orada var olan constructor parametreleri de kalitimsal olarak bu sinifa
        // geciyor. name, lastName, email, phoneNumber --> verileri A39Inheritance1 sinifindan ve department,
        // workHours --> verileri A39Inheritance3 sinifindan geliyor.
        this.belge = belge;
    }

    public String exit(){
        return super.exit() + " Otopark'a yurudu!"; // A39Inheritance6 sinifinin ust sinifinda var olan exit() methodunu
        // super.exit() syntaxi ile cagirip, uzerine ekleme yaptik. Bu da demek oluyor ki exit() methodunu overriding
        // yaptik. Artik A39Inheritance6 sinifi icin exit() methodu digerlerinden farkli olarak bu mesaji
        // 'super.exit() + " Otopark'a yurudu!";' dondurecek.
    }

}
