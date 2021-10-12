package BugFighter;

public class A37GetterSetter {

    // Nesne Yonelimli Programlama 4 temel ilke uzerine kuruludur.
    // Bir programa Nesne Yonelimli Programlama diyebilmek icin bu dort kosulu da saglamasi gerekir.

    // Encapsulation = Sarmallama, Kapsulleme
    // Inheritance = Kalitim, Soydan Gelim
    // Polymorphism = Cok Bicimlilik
    // Abstraction = Soyutlama

    // Book sinifimizin oldugunu varsayalim
    private String name, author, publisher;
    private int numberOfPage; // numberOfPage degiskenini sarmaladik, birincisi degiskeni private yaparak koruma altina
    // aldik, uzerine bir katmak koyduk. Contructor icinde guvenligi biraz daha artirip sayfa sayisinin yanlis girilmesi
    // halinde gereken duzenlemeleri yaptik ve sonrasinda pageNum adinda bir methodla disaridan goruntulenebilmesine
    // olanak sagladik. Direkt sekilde bu degiskene erisim soz konusu degil.

    public A37GetterSetter(String name, String author, String publisher, int numberOfPage) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if (numberOfPage < 1) { // kitap sayfa sayisinin yanlislikla degistirilmesini istemedigimiz icin buraya bi if
            // condition olusturduk. Eger kitap sayfa sayisi 1'in altinda bir deger girilirse, default olarak bu sayiyi
            // 10 yap,
            this.numberOfPage = 10;
        } else { // degilse sayfa sayisi icin hangi veri giriliyorsa o veriyi dikkate al dedik.
            this.numberOfPage = numberOfPage;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfPage(){ // get programlama jargonundan geliyor, daha sonra okumak isteyen ya da gelistirmeye
                                // yardimci olacak kisiler olacaksa onlarin daha kolay anlamasi icin bu jargon kullanilir.
                                // get methodu ile private olan degiskenimizi method icine alarak disardan bu bilgiye
                                // erisimini saglamis olduk. (degiskene degil, methoda erisim)
        return this.numberOfPage;
    }

    public void setNumberOfPage(int number){ // book1 objesi icin sayfa sayisi 400 du ama bu sayfa sayisini degistirme
                                        // ihtiyaci dogdu. Bu durumda set methodu ile prtivate olan degiskene ulasip
                                        // (ayni class da oldugu icin, eger disardan ulasmaya calisirsak set methodu
                                        // elbette calismayacaktir) sayfa sayisinda degisiklik yapmayi sagliyoruz.
        if (number < 1){ // if condition ile yine methodun icinde kullanicinin sayfa sayisinda anormal bir sayi
                        // girmesine engel olduk.
            System.out.println("Sayfa sayisi negatif olamaz!");
            this.numberOfPage = 10;
        }
        else {
            this.numberOfPage = number;
        }
    }

    public static void main(String[] args) {

        A37GetterSetter book1 = new A37GetterSetter("Harry Potter", "Rowling", "Techtorial",
                400);

        System.out.println("book1 object inden cagirilan sayfa sayisi: "+book1.numberOfPage);

        System.out.println("get methodu ile cagirilan sayfa sayisi: "+book1.getNumberOfPage());

        book1.setNumberOfPage(500); // sayfa sayisini guncelledik, setNumberOfPage methodu icerisine veri bekledigi
                                    // icin guncellenen sayfa sayisini parantez icine girdik
        System.out.println("set methodu ile guncellendikten sonraki sayfa sayisi: "+book1.getNumberOfPage());

        A37GetterSetter book2 = new A37GetterSetter("The Lord of The", "Peter Jackson",
                "Cigdem", 600);

        // book2.name; // Not a statement --> bu sekilde degisken isimlerine ulasip degistirme islemi yapamiyoruz cunku
        // degiskenler korunakli, ancak degisiklik yapmak istedigimizde set methodunu cagirarak degisim yapabiliyoruz.

        System.out.println(book2.name); // The Lord of The
        book2.setName("The Lord of The Rings");
        System.out.println(book2.name); // The Lord of The Rings

        System.out.println(book2.getName()); // The Lord of The Rings -->  get methodu ile de ismi cagirabiliriz

    }

}


