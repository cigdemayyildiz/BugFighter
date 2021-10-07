package BugFighter;

public class A41Interface2 implements IWorker{ // Bir sinifi bir Interface yapisina alt sinif yapmak, o sinifi bir
    // Interface yapi ile birbirine iliskilendirmek istiyorsak implements komutunu kullanip artdindan Interface yapi
    // adini giriyoruz. Inheritance larda extends keyword u ile Interface lerdeki implemenets keywordu ayni isi yapiyor.
    // Burada bir sinifi bir Interface yapinin alt sinifi yaptigimizda Interface yapi icerisindeki methodlari birebir
    // almamiz gerektigi icin bir sinifi Interface bir yapiya implements ettigimizde uyari alacagiz. Bu Interface
    // yapidaki methodlari buraya Method Override yapmamiz gerektigi ile ilgili bir uyari olacak.

    // Akademisyen sinifi

    private String adSoyad, bolum, gorevler;

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


}
