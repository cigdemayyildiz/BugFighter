package BugFighter;

public class A25Object {

    // Object Oriented Programming

    // ClassName objectName = new ClassName(); --> Object Sytntax

    // Java nesne yonelimli bir programdir. Nesne yonelimli program; siniflar icerisinde olusturdugumuz instance
    // variable lari object ler araciligi ile diger siniflara cagirmamiza ve uzerlerinde oynamalar/kodlamalar
    // yapabilmemize olanak tanir.

    // Ornegin bir sinif olusturup icerisine birkac tane degisken tanimlayalim.
    // Bu degiskenler sadece o sinifa ait olacaklar.
    // Daha sonra o sinifa ait olan bu degiskenleri baska bir sinifta kullanmaya ihtiyac duydugumuzda, bu
    // degiskenleri kullanmak istedigimiz siniflara nesneler (object) yardimi ile cagiracagiz.

    // A25Classes sinifinin icinde iki tane ornek degisken (instance variable) olusturduk.
    public int number1;
    public int number2;
    // public bir Access Modifier, yani olusturdugumuz instance variable a kimlerin erismesini istedigimizi belirliyoruz.
    // public --> herkes bu instance variable a ulasabilir anlamina geliyor.

    public static void main(String[] args) {

        A25Object machine1 = new A25Object(); // ayni class icinde hem instance variable lari olusturup hem de bu
        // variable lari object yardimi ile calistirmak istedigimiz main method unun altinda cagirdigimiz icin className
        // main method un className i ile ayni oldu. Baska bir sinifta olusturulmus instance variable lari cagirmak icin
        // instance variable larin ait oldugu className i yazmamiz gerekecek. Cunku kullanmak istedigimiz instance
        // variable in konumunu belirtmemiz gerekiyor ki, Java o instance variable in hangi sinifdan cagrilmak
        // istendigini anlasin. Ayni isimle baska siniflara ait instance variable lar olabilir, tam olarak bir adres
        // belirtmek icin su sinifin intance variablelari uzerinde islem yapmak istiyorum, o sinifin instance
        // variablelarini cagirmak istiyorum demek gerekiyor.
        System.out.println("Machine1");
        machine1.number1 = 10; // machine1 adinda olusturdugumuz object icin A25Classes sinifinda var olan number1
        // instance variable ina bir deger atadik.
        machine1.number2 = 20; // machine1 adinda olusturdugumuz object icin A25Classes sinifinda var olan number2
        // instance variable i icin bir deger atadik.

        System.out.println("1st number of Machine1: " + machine1.number1); // 10 --> ekrana yazdirmak istedigimizde tam
        // adresi girmemiz gerekiyor, yalniz number1 yazmak yeterli olmuyor, cunku number1 adinda bir varible var ama o
        // bir instance variable, herhangi bir degere sahip degil. Default olarak bir degere de sahip olabilir kendi
        // sinifi icerisinde ama oyle bile olsa yazdirmak isterken objectName ile birlikte yazilmasi gerekiyor.
        System.out.println("2n number of Machine1: " + machine1.number2); // 20


        A25Object machine2 = new A25Object();
        System.out.println("Machine2");
        machine2.number1 = 100;
        machine2.number2 = 200;
        System.out.println("1st number of Machine2: " + machine2.number1); // 100
        System.out.println("2n number of Machine2: " + machine2.number2); // 200

        A25Object machine3 = new A25Object();
        System.out.println("Machine3");
        machine3.number1 = 1000;
        machine3.number2 = 2000;
        System.out.println("1st number of Machine3: " + machine3.number1); // 1000
        System.out.println("2nd number of Machine3: " + machine3.number2); // 2000



    }
}
