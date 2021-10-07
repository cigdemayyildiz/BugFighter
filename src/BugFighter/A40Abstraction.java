package BugFighter;

public class A40Abstraction {

    // Abstraction = Soyutlama

    // Abstract siniflardan method olusturulamaz, method olusturulmasini istemedigimiz siniflari abstract yapariz.

    /*
    Programlamada yapilan projelere gore yapilandirmalar mevcuttur. Bir program yapisinda olusturulan her sinif mutlaka
    kullanilmak zorunda degildir. Yapiyi olusturmak icin bazi siniflara ihtiyac vardir, programin icinde bulunmasi ve
    o yapiyi anlamli hale getirmesi gerekiyordur ama orada diye mutlaka kullanilmak zorunda degildir.

    Inheritance dersi orneklerinde oldugu gibi bir semamiz oldugunu varsayalim.

    Calisan --> ata sinifimiz
    Akademisyen ve Memur --> ara siniflar
    Ogretim Gorevlisi ve Asistan Akademisyen sinifinin alt siniflari ve
    Guvenlik Gorevlisi ve Bilgi Islem memuru da Memur sinifinin alt siniflari

    Bu yapida aslinda Akademisyen ve Memurlar icin object ler olusturmamiz manasizlasiyor. Cunku bu iki sinif kendi
    alt siniflari icin gecerli olacak ortak ozellikleri tasimak icin orada bulunuyor, bunlardan object ler uretip islem
    yaptirmak gereksiz. Bizim asil islem yapmak istedigimiz siniflar Ogretim Gorevlisi, Asistan, Guvenlik Gorevlisi ve
    Bilgi Islem Memuru. Akademisyen su saatte ise geldi, derse girdi, yemek karti kullandi ya da Memur su saatte isten
    cikti, bu belgeleri tamamlamadi gibi verileri soyut olan bir sinif icin kullanamayiz.

    Akademisyen sinifi kendi icerisinde derseGir() adinda bir method bulunduruyor cunku bu method Ogretim Gorevlisi icin
    de Asistan icin de ortak bir davranis methodu. Her iki alt sinif da bu methodu kullanmak zorunda.

    Bu gibi durumlarda biz bu arada kalan ata sinif ile alt siniflarin arasindaki siniflari abstract yani soyutlama ile
    onlar uzerinden object olusturulmasini engelliyoruz.

    Bu siniflarin sahip oldugu derseGir(); mesaiSaati(); etc methodlar icin de bu abstract edilmis sinifin alt siniflari
    mutlaka bu methodlari kendi iclerinde kullanmak zorundadir diyoruz.

    Bir ara sinifi abstract yaparken sinif ismi satirinda public ile class keywordlerinin arasina abstract yaziyoruz.
    public abstract class ClassName{}

    Sinifi abstract ettikten sonra alt siniflarda ortak olarak kullanilacak olan methodlari da birer birer abstract
    ediyoruz. abstract edilen methodlarin govdelerini bos birakioruz ve ; ile methodu kapatiyoruz. Yani {} parantezlerini
    kullanmiyoruz.

    public abstract void derseGir(); sekline getiriyoruz.

    public abstract void derseGir(); parantez icine parametre alabilir.

    Bu islemden sonra Akademisyen sinifinin alt siniflarina giderek derseGir(); methodunu o siniflar icinde olusturmamiz
    gerekiyor. Eger olusturmazsak Java, Ogretim Gorevlisi ya da Asistan siniflarinda Akademisyen sinifindan miras
    aldigin derseGir(); methodunu kendi sinifin icinde kullanman gerekiyor diye uyari verecektir.

    derseGir(); methodu Akademisyen sinifindan birebir ayni syntax ile gelecegi icin override bir method olacak.



     */

}
