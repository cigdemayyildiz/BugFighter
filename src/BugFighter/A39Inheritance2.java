package BugFighter;

public class A39Inheritance2 extends A39Inheritance1 { // Alt sinif icinde sinif isminin yanina extends yazip, hangi
    // sinifin alt sinifi olarak tanimlamak istiyorsak o sinifin adini yazarak artik bu sinifi ata sinifin alt sinifi
    // yapmis oluyoruz. Ata Sinif = A39Inheritance1, Alt Sinif = A39Inheritance2

    // Akademisyen (Calisanin Alt Sinifi)
    // Bu sinif altina alacagi siniflari bir cati altinda toplamak icin olusturuldu.
    // Asistanlari ve Ogretim Gorevlilerinin ortak ozelliklerini tek bir sinifta tanimlamak icin olusturduk.
    // Bu ara siniflardan object uretmemize gerek olmadigi icin bu turden siniflar icin Soyutlama yapiyoruz.
    // Abstraction = Soyutlama
    // Program icinde alt siniflarinin ortak ozelliklerini bir arada tutmasi icin bulunuyor ama abstract yaptigimizda
    // onlar uzerinden object ler uretemiyoruz.

    protected String department, responsibilies;
    protected String classes; // encapsulation uygulamak icin public olan access modifierlari protected a cevirdik ve
                                // ardindan getter setter methodlarini olusturduk.

    public A39Inheritance2(String name, String lastName, String email, String phoneNumber, String department,
                           String responsibilies, String classes) { // sinifin kendine ait instance variable lari ve
        // super() methodu ile ata siniftan gelen parametreler ile olusturulan constructor.
        super(name, lastName, email, phoneNumber); //  A39Inheritance2 sinifi A39Inheritance1 sinifinin alt sinifi oldugu
        // icin A39Inheritance1 sinifinda olusturulan constructor parametrelerinin bu sinif icin de kullanilmasi
        // gerekiyor. Bir sinifdan baska bir sinifa constructor cagirma super() methodu ile yapiliyor. A39Inheritance2
        // sinifinin A39Inheritance1 sinifinin constructor parametrelerine ihtiyaci var, bu yuzden zaten A39Inheritance1
        // sinifinin alt sinifi oldu.
        this.department = department;
        this.responsibilies = responsibilies;
        this.classes = classes;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResponsibilies() {
        return responsibilies;
    }

    public void setResponsibilies(String responsibilies) {
        this.responsibilies = responsibilies;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void joinClass(){
        System.out.println(this.name + " " +lastName + " derse girdi!");
    }

    public void enter() {  // eger bir method icin Overriding yapacaksak, Ata sinifta Method Overriding yapmak
        // istedigimiz method bilgilerini tamamen ayni olarak aliyoruz. A39Inheritance2 sinifinda yaptigimiz bu
        //  Method Overriding sadece bu sinif ve bu sinifin alt siniflarinda gecerli olacak.
        System.out.println(this.name+" "+lastName + " A giris kapisindan giris yapti!");
    }
}
