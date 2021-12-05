package BugFighter;

public class A39Inheritance3 extends A39Inheritance1 {

    // Memur (Calisanin Alt Sinifi)
    // Bu sinif altina alacagi siniflari bir cati altinda toplamak icin olusturuldu.
    // Guvenlik Gorevlilerinin ve Bilgi Islem memurlarinin ortak ozelliklerini tek bir sinifta tanimlamak icin olusturduk.
    // Bu ara siniflardan object uretmemize gerek olmadigi icin bu turden siniflar icin Soyutlama yapiyoruz.
    // Abstraction = Soyutlama
    // Program icinde alt siniflarinin ortak ozelliklerini bir arada tutmasi icin bulunuyor ama abstract yaptigimizda
    // onlar uzerinden object ler uretemiyoruz.

    protected String department, workHours; // encapsulation uygulamak icin public olan access modifieri protected a
                                                    // cevirdik ve ardindan getter setter methodlarini olusturduk.

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }


    public A39Inheritance3(String name, String lastName, String email, String phoneNumber, String department,
                           String workHours) { // super() methodu ile ata siniftan gelen constructor parametreleri ve
        // sinifin kendine ait instance variable lari ile olusturulan constructor
        super(name, lastName, email, phoneNumber); //  A39Inheritance3 sinifi A39Inheritance1 sinifinin alt sinifi oldugu
        // icin A39Inheritance1 sinifinda olusturulan constructor parametrelerinin bu sinif icin de kullanilmasi
        // gerekiyor. Bir sinifdan baska bir sinifa constructor cagirma super() methodu ile yapiliyor. A39Inheritance3
        // sinifinin A39Inheritance1 sinifinin constructor parametrelerine ihtiyaci var, bu yuzden zaten A39Inheritance1
        // sinifinin alt sinifi oldu.
        this.department = department;
        this.workHours = workHours;
    }

    public String exit(){ // A39Inheritance3 sinifi icinde yaptigimiz Method Overriding sadece bu sinifi ve eger varsa
        // bu sinifin alt siniflarini etkileyecek. Eger bu sinifin alt siniflari varsa ve onlardan birisinde de
        // degisiklik yapmak istiyorsak o da mumkun. A39Inheritance6 sinifina gidiniz --->
        return this.name + " B kapisindan cikis yapti!";
    }
}
