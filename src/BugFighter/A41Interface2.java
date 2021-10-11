package BugFighter;

public class A41Interface2 implements IWorker { // Bir sinifi bir Interface yapisina alt sinif yapmak, o sinifi bir
    // Interface yapi ile birbirine iliskilendirmek istiyorsak implements komutunu kullanip artdindan Interface yapi
    // adini giriyoruz. Inheritance larda extends keyword u ile Interface lerdeki implemenets keywordu ayni isi yapiyor.
    // Burada bir sinifi bir Interface yapinin alt sinifi yaptigimizda Interface yapi icerisindeki methodlari birebir
    // almamiz gerektigi icin bir sinifi Interface bir yapiya implements ettigimizde uyari alacagiz. Bu Interface
    // yapidaki methodlari buraya Method Override yapmamiz gerektigi ile ilgili bir uyari olacak.

    // Akademisyen sinifi

    private String adSoyad, bolum, gorevler; // private yaparak encapsulation yaptik

    public A41Interface2(String adSoyad, String bolum, String gorevler) {
        this.adSoyad = adSoyad;
        this.bolum = bolum;
        this.gorevler = gorevler;
        System.out.println(this.okul); // Interface yapi icerisinde olusturdugumuz hicbir zaman degismeyeceginden emin
        // oldugumuz bir instance variable i bu sinif icine cagirabiliyoruz, cunku bu sinif Interface yapinin alt sinifi.
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorevler() {
        return gorevler;
    }

    public void setGorevler(String gorevler) {
        this.gorevler = gorevler;
    }

    // Interface yapida olusturulmus methodlarin bu sinif icin overriding edilisi
    @Override
    public void giris() {
        System.out.println("Cikis yapildi!");
    }

    @Override
    public void cikis() {
        System.out.println("Giris yapildi!");
    }

    @Override
    public boolean yemekSaati(int saat) {
        System.out.println("Yemek yendi!");
        return false;
    }

    public static void main(String[] args) {

       // A41Interface2.okul = "ABN"; // Interface de olusturdugumuz ve final ozelliginde olan instance variable i
        // cagirip assign edemeyiz. Bu degisken final ozelligine sahip, baska siniflardan kullanim icin cagirilabilir
        // ama degistirilemez. private mantigi ile calisiyor ama farki private sadece kendi sinifindan cagirilabilirken
        // final her yerden cagirilabiliyor.

        A41Interface2 a = new A41Interface2("as", "as","as"); // methodu olusturdugum anda
        // A41Interface2 constructor inin icinde hazir olan ve Interface yapisindan gelen okul bilgileri ekrana yazdirildi.

        //a.setOkul(); --> okul adini degistiremeyiz.

        System.out.println("Constructor parametreleri icerisine girilen bilgilerden olusan cikti: ");
        System.out.println(a.getAdSoyad());
        System.out.println(a.getBolum());
        System.out.println(a.getGorevler());

        a.adSoyad = "aa";
        a.bolum = "bb";
        a.gorevler = "cc";
        System.out.println("Constructordaki bilgilerin reassign edilmesinden gelen bilgilerden olusan cikti: ");
        System.out.println(a.getAdSoyad());
        System.out.println(a.getBolum());
        System.out.println(a.getGorevler());

        a.setBolum("dd");
        a.setAdSoyad("gg");
        a.setGorevler("yy");
        System.out.println("Set methodu ile reassign edilen bilgilerden olusan cikti: ");
        System.out.println(a.getAdSoyad());
        System.out.println(a.getBolum());
        System.out.println(a.getGorevler());

        System.out.println("Interface yapisindan override edilmis methodlardan gelen bilgilerden olusan ciktilar: ");
        a.giris();
        a.cikis();
        a.yemekSaati(3);

    }

}
