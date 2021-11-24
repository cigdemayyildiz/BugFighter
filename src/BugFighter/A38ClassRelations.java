package BugFighter;

public class A38ClassRelations {

    // Ana sinif

    public static void main(String[] args) {

        // Class Relations = Siniflar Arasi Iliskiler

        /*
            Dependency = Bagimlilik ("uses a") --> Birbirine bagimli iki ayri siniftan soz ediliyor
            Composition = Birlestirme ("has a")
            Inheritance = Kalitim ("is a")
        */

        // Dependency - Bagimlilik ("uses a")

        A38ClassRelationsAClass a = new A38ClassRelationsAClass();
        A38ClassRelationsBClass b = new A38ClassRelationsBClass();
        System.out.print("Dependency iliskisinden gelen deger: ");
        a.run(b); // 1

        // Ana sinifta A ve B siniflari icin object ler olusturduk ki, non-static olan methodumuzu ve instance variable
        // imizi o sinifta calistirabilelim. Ardindan A sinifina ait object ile run() methodunu cagirdik ve run() methodu
        // icerisinde B sinifinda var olan degisken ile ekrana yazdirildi. Neden? Cunku run() methodu A sinifinda yer
        // aliyor olmasina ragmen method icinde B sinifina ait bir object e ihtiyac duyuyor. Sinfilar arasi bagimlilik
        // iliskisi buradan kaynaklaniyor.

        /*
        Eger A sinifindaki run() methodu static olmus olsaydi o zaman A sinifi icin object olusturmaya gerek kalmadan
        direkt sinif ismi ile methodu cagirabilirdik.
        A38ClassRelationsAClass.run(b); // 1
        */

        // Composition = Birlestirme ("has a")

        a.d = b; // once A sinifina ait a object si ile A sinifindaki d instance variable ini cagirdik ve bu data tipi
        // object olan variable i b object sine esitledik. Cunku ekranda B sinifindaki int data tipinde ve value isminde,
        // degeri 1 olan degiskeni gormek istiyoruz.
        System.out.print("Composition iliskisinden gelen deger: ");

        a.run(a.d); // A sinifindaki run() methodunu calistirmak icin a object si ile run() methodunu cagirdik ve bu
        // method(run() methodu) B sinifindan bir object e ihtiyac duydugu icin, a object si ile A sinifi icinde
        // tanimladigimiz ancak B sinifindan gelen ve adi d olan object i cagirdik. Boylece Java once A sinifi icindeki
        // run() methoduna ulasti, run() methodunun B sinifina ait bir object e ihtiyaci oldunu gordu, A sinifinda
        // olusturdugumuz B sinifindan gelen, object ismi d olarak tanimlanmis instance variable a ulasti ve bir ust
        // satirda bu instance variable i B sinifi icin olusturulan b object sine esitledigimiz icin B sinifina gidip
        // icindeki int data tipinde ve adi value olan instance varialbe a ulasarak oradaki degeri ekrana yazdirdi.



























    }
}
