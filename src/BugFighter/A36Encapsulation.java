package BugFighter;

public class A36Encapsulation {

    // Nesne Yonelimli Programlama 4 temel ilke uzerine kuruludur.
    // Bir programa Nesne Yonelimli Programlama diyebilmek icin bu dort kosulu da saglamasi gerekir.

    // Encapsulation = Sarmallama, Kapsulleme
    // Inheritance = Kalitim, Soydan Gelim
    // Polymorphism = Cok Bicimlilik
    // Abstraction = Soyutlama


    // Book sinifimizin oldugunu varsayalim
    public String name, author, publisher;
    private int numberOfPage; // numberOfPage degiskenini sarmaladik, birincisi degiskeni private yaparak koruma altina
    // aldik, uzerine bir katman koyduk. Constructor icinde guvenligi biraz daha artirip sayfa sayisinin yanlis girilmesi
    // halinde gereken duzenlemeleri yaptik ve sonrasinda pageNum adinda bir methodla disaridan goruntulenebilmesine
    // olanak sagladik. Direkt sekilde bu degiskene erisim soz konusu degil.

    public A36Encapsulation(String name, String author, String publisher, int numberOfPage) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if (numberOfPage < 1){ // kitap sayfa sayisinin yanlislikla degistirilmesini istemedigimiz icin buraya bi if
            // condition olusturduk. Eger kitap sayfa sayisi 1'in altinda bir deger girilirse, default olarak bu sayiyi
            // 10 yap,
            this.numberOfPage = 10;
        }
        else { // degilse sayfa sayisi icin hangi veri giriliyorsa o veriyi dikkate al dedik.
            this.numberOfPage = numberOfPage;
        }
    }

    public void pageNum(){
        System.out.println(numberOfPage);
    }

    public static void main(String[] args) {

        A36Encapsulation book1 = new A36Encapsulation("Harry Potter", "Rowling", "Techtorial",
                400);

        System.out.println("book1 object inden cagirilan sayfa sayisi: "+book1.numberOfPage);
        System.out.print("pageNum methodundan gelen sayfa sayisi: ");
        book1.pageNum();
    }
}
