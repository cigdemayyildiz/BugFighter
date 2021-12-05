package BugFighter;

public class A26Constructor {

    // Constructor = Yapici

    // ClassName(){} --> constructor syntax

    // Java her sinif icin otomatik olarak bos bir constructor olusturuyor, bu sayede object olusturdugumuzda herhangi
    // bir hata almadan o object i kullanabiliyoruz.

    // ClassName objectName = new ClassName(){} --> new den sonra gelen ClassName() bize Java'nin otomatik olarak bu
    // methodun kullanilmasinda hata almamamizi saglayan bir contructor olusturdugunu gosteriyor.

    // Instance variable larin ve method larin oldugu class a disardan veri tasiyabilmek icin Consturctor lari kullaniriz.

    public int number1;
    public int number2;
    public String color;
    final static double PI = 3.14;

    A26Constructor(int number1, int number2, String color){
        this.number1 = number1;
        this.number2 = number2;
        this.color = color;
        // this.PI = 3.0; // Cannot assign a value of to final variable
        // final olarak tanimlanmis degiskeni assign edemezsin, degistiremezsin
    }
    public int addition(){
        return this.number1 + this.number2;
    }
    public int subtraction(){
        return this.number1 - this.number2;
    }
    public int multiplication(){
        return this.number1 * this.number2;
    }
    public int division(){
        return this.number1 / this.number2;
    }

    public double area(int r){
        return A26Constructor.PI * Math.pow(r,2); // r'nin karesini hesaplamak icin Marth.pow() methodunu kullandik
    }

    public static void main(String[] args) {

        A26Constructor m1 = new A26Constructor(10,5,"Pink");
        // A26Constructor --> ClassName
        // m1 --> objectName
        // new A26Constructor --> new object
        // bir siniftan bir sey uretiyorsak bu bir object dir.

        System.out.println(m1.number1 + " - " + m1.number2 + " - " + m1.color);

        // fonksiyonlari class dan cagirabilmek icin object ismindan sonra .(nokta)'ya bastigimizda bu object icin
        // kullanabilecegimiz methodlar listelenir.
        m1.addition();
        m1.subtraction();
        m1.multiplication();
        m1.division();

        // ekrana yazdirmak icin sout icine aliyoruz
        System.out.println(m1.addition()); // 15
        System.out.println(m1.subtraction()); // 5
        System.out.println(m1.multiplication()); // 50
        System.out.println(m1.division()); // 2

        // eger object parametresi olarak verilen degerlerden birini degistirmek istersek
        m1.number1 = 20; // seklinde number1' i guncelleyebiliriz.
        System.out.println("Parametre guncellendikten sonraki islem hesaplamalari;");

        System.out.println(m1.addition()); // 25
        System.out.println(m1.subtraction()); // 15
        System.out.println(m1.multiplication()); // 100
        System.out.println(m1.division()); // 4

        System.out.println(A26Constructor.PI); // 3.14 --> variable static oldugu icin object e gerek kalmadan cagirabiliriz.

        System.out.println(m1.area(10)); // 314.0 --> PI * Math.pow(r,2); --> 3.14 * 100 = 314.0
    }
}
