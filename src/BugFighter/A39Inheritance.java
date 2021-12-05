package BugFighter;

public class A39Inheritance {

    public static void main(String[] args) {

        System.out.println("***Calisan***");
        A39Inheritance1 employee1 = new A39Inheritance1("John", "White", "johnQgmail.com",
                "05325505050");
        employee1.enter(); // enter() methodu A39Inheritance1 sinifinda olusturuldugu icin bu sinifta calismasi normal.
        // employee1.joinClass(); joinClass() methodunu A39Inheritance2 sinifinda olusturdugumuz icin A39Inheritance2
        // sinifinin ata sinifi olan A39Inheritance1 sinifinda bu methodu calistiramayiz.
        System.out.println(employee1.exit());


        System.out.println("***Akademisyen***");
        A39Inheritance2 employee2 = new A39Inheritance2("David", "Black", "david@gmail.com",
                "05325505051", "Math", "Doc.", "Math101");
        employee2.enter(); // enter() methodu A39Inheritance2 sinifinda olusturulmamis olmasina ragmen calisiyor cunku
        // A39Inheritance2 sinifi enter() methodunun olusturuldugu A39Inheritance1 sinifinin alt sinifi. A39Inheritance1
        // sinifinin alt sinifi oldugu icin A39Inheritance1 sinifinin icindeki private olmayan tum methodlara ulasabilir.
        // A39Inheritance1 sinifindaki bu methodu ilerleyen bir zamanda A39Inheritance2 sinifi icinde Method Overriding
        // yaparak artik A39Inheritance1 sinifinda olusturulmus sekliyle degil de A39Inheritance2 icine overriding
        // yapilmis sekli ile kullanmaya devam ediyoruz. Tabii ki bu overriding A39Inheritance2 sinifi ve bu sinifin alt
        // siniflarini etkiledigi icin A39Inheritance2 sinifinin alt siniflarinda da overriding li hali calisiyor.
        employee2.joinClass();
        System.out.print(employee2.getName()); // A39Inheritance2 sinifinda name variable icin getter methodu olmamasina
        // ragmen bu method employee2 icin calisti. Neden? Cunku A39Inheritance2 sinifi A39Inheritance1 sinifinin
        // inheritance i, orada olusturulan getter ve setter methodlarini kullanabilir.
        System.out.print(" "+employee2.getLastName());
        System.out.print(" "+employee2.getEmail());
        System.out.print(" "+employee2.getPhoneNumber());
        System.out.println();
        System.out.println(employee2.exit());


        System.out.println("***Memur***");
        A39Inheritance3 employee3 = new A39Inheritance3("Sarah","Pink","sarah@gmail.com",
                "05325505052", "Documentation","40");
        employee3.enter(); // enter() methodu A39Inheritance3 sinifinda olusturulmamis olmasina ragmen calisiyor cunku
        // A39Inheritance3 sinifi enter() methodunun olusturuldugu A39Inheritance1 sinifinin alt sinifi. A39Inheritance1
        // sinifinin alt sinifi oldugu icin A39Inheritance1 sinifinin icindeki private olmayan tum methodlara ulasabilir.

        // employee3.joinClass(); joinClass() methodunu A39Inheritance3 sinifinda da calistiramayiz cunku
        // A39Inheritance3 sinifi A39Inheritance2 sinifinin degil A39Inheritance1 sinifinin alt sinifi. A39Inheritance2
        // sinifi ile A39Inheritance3 sinifi arasinda bir baglanti yok.
        System.out.print(employee3.getName());
        System.out.print(" "+employee3.getLastName());
        System.out.print(" "+employee3.getEmail());
        System.out.print(" "+employee3.getPhoneNumber());
        System.out.println();
        System.out.println(employee3.exit());


        System.out.println("***Asistan***");
        A39Inheritance4 employee4 = new A39Inheritance4("Michelle", "Yellow", "michelle@gmail.com",
                "05325505053", "Math", "Doc", "Math101", "Yes");
        employee4.enter();
        employee4.joinClass();
        System.out.print(employee4.getName());
        System.out.print(" "+employee4.getLastName());
        System.out.print(" "+employee4.getEmail());
        System.out.print(" "+employee4.getPhoneNumber());
        System.out.println();
        System.out.println(employee4.exit());


        System.out.println("***Ogretim Uyesi***");
        A39Inheritance5 employee5 = new A39Inheritance5("Alex", "Purple", "alexQgmail.com",
                "05325505054", "Math", "Doc", "Math101", "Teacher");
        employee5.enter();
        employee5.joinClass();
        System.out.print(employee5.getName());
        System.out.print(" "+employee5.getLastName());
        System.out.print(" "+employee5.getEmail());
        System.out.print(" "+employee5.getPhoneNumber());
        System.out.println();
        System.out.println(employee5.exit());


        System.out.println("***Guvenlik Gorevlisi***");
        A39Inheritance6 employee6 = new A39Inheritance6("Erica", "Brown", "erika@gmail.com",
                "05325505055", "Documentation", "40", "Yes");
        employee6.enter();
        // employee6.joinClass();
        System.out.print(employee6.getName());
        System.out.print(" "+employee6.getLastName());
        System.out.print(" "+employee6.getEmail());
        System.out.print(" "+employee6.getPhoneNumber());
        System.out.println();
        System.out.println(employee6.exit());


        System.out.println("***Bilgi Islem***");
        A39Inheritance7 employee7 = new A39Inheritance7("Afifa", "Green", "afifa@gmail.com",
                "05325505056", "Documentation", "40", "Search");
        employee7.enter();
        // employee7.joinClass();
        System.out.print(employee7.getName());
        System.out.print(" "+employee7.getLastName());
        System.out.print(" "+employee7.getEmail());
        System.out.print(" "+employee7.getPhoneNumber());
        System.out.println();
        System.out.println(employee7.exit());


        // Polymorphism = Cok Bicimlilik

        System.out.println("Akademisyen");
        A39Inheritance1 employee8 = new A39Inheritance2("Tanya", "Violet", "tanya@gmail.com",
                "05325505057", "Math", "Doc.", "Math101");
        // A39Inheritance1 sinifina ait bir object olusturduk ama constructor olarak A39Inheritance2 sinifinin
        // constructor ini kullandik. Eger olusturmak istedigimiz polimorphism yapi inheritance siniflar arasindaysa
        // object olusturmak istedigimiz sinif icin bu sinifin alt siniflarindan birinin constructor ini kullanabiliriz.
        // Object A39Inheritance1 sinifindan olusturulacak ama A39Inheritance2 gibi davranacak.
        employee8.enter(); // enter() methodu A39Inheritance1 sinifinda System.out.println(this.name+" "+lastName +
        // " giris yapti!"); mesajini ekrana yazdiriyor olmasina ragmen, employee8 icin "Tanya Violet A giris kapisindan
        // giris yapti!" seklinde yazdirdi. A39Inheritance2 gibi davrandi.

        A39Inheritance1 [] exitControl = {employee1,employee2,employee3,employee4,employee5,employee6,employee7,employee8};
        // A39Inheritance1 ata sinifi ile bir Array olusturmak istersem bunun tum alt siniflarini ayni liste icine
        // toplayabilirim, cunku tum alt siniflar ata sinifi taniyorlar.
        System.out.println();
        System.out.println("*********Cikis yapanlarin listesi*********");
        A39Inheritance1.exitList(exitControl); // exitControl olarak olusturdugumuz Array icerisindeki tum object ler
        // icin exit() methodunu calistiriyor. employee8 icin exit() komutu daha once calistirilmamis olmasina ragmen
        // ekranda employee8 i bu yuzden gosteriyor.
        // existList() methodu static oldugu icin herhangi bir object olusturmaya ihtiyac duymadan sadece sinif ismi
        // ve method ismi ile cagirabildik.
    }
}
