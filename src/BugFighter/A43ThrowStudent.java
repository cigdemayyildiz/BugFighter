package BugFighter;

public class A43ThrowStudent {

    // Bir Student class i olusturuyoruz ve bu class icinde object return type inda, find() adinda ve String bir parametre
    // alan bir method olusturuyoruz. Methodu okulumuzdaki ogrenci kayitlarini yaparken olusabilecek hatalari tanimladigimiz
    // A43ThrowStudentException sinifina throws ediyoruz. Yeni bir Exception olusturmak icin kullandigimi throw
    // keywordunu if() blogu govdesine yaziyoruz. if() parantezinin icinde ne tur bir comparison yapacagimizi belirtiyoruz.
    // Bu ornekte 123 id numarasi daha once kullanilmissa bu id numarasinin tekrar kullanilmamasi icin bir hata mesaji
    // yaziyoruz. if() blogu govdesine throw keyword u ile yeni bir throw olusturuyoruz ve bu throw bizim hata
    // sinifimiz olan A43ThrowStudentException referans aliyor. A43ThrowStudentException sinifinin constructor i
    // public A43ThrowStudentException(String msg){} String data tipinde bir mesaj bekledigi icin de olusturdugumuz
    // throw parametresine ekranda gormek istedigimiz mesaji yaziyoruz. Eger if() comparison i true donerse, mesajimiz
    // "Ayni id numarasina sahip baska bir ogrenci bulunuyor!" seklinde ekranda gorunecek. if() comparison i false
    // donerse yeni bir Student object olusacak.

    public A43ThrowStudent find(String id) throws A43ThrowStudentException {
        if (id.equals("123")){ // "123" yerine okulun ogrenci listesini koyarak da o id'nin ogrenci listesinde olup
            // olmadigini kontrol ettirebiliriz. Ornegin kullanici "555" id numarasi girmis olsun. 555 id numarasi
            // ogrenci listesinde varsa hata mesaji alalim.
            throw new A43ThrowStudentException("Ayni id numarasina sahip baska bir ogrenci bulunuyor!"); // Bu throw u olusturabilmek
            // icin iki secenek bulunuyor. Biri find() methodunu throw keywordu ile Exception sinifina dahil edebiliriz.
            // public String find(String id) throws Exception {} seklinde olusturabiliriz. Ikinci secenek de bu throw'u
            // try-catch icine alabiliriz. Bu ornekte ikinci secenegi kullanalim.
        } else { // eger bu id ogrenci listesinde yoksa yeni bir ogrenci olustur.
            return new A43ThrowStudent();
        }
    }

    public static void main(String[] args) throws A43ThrowStudentException {
        A43ThrowStudent s = new A43ThrowStudent();
        s.find("1232");


    }

}
