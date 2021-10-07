package BugFighter;

public class A38ClassRelationsAClass {

    // A sinifi

    // Dependency = Bagimlilik (uses a)

    public void run(A38ClassRelationsBClass c){ // bu run() isimli method A38ClassRelationsBClass sinifindan bir objeye
                                                // ihtiyac duyuyor. Burada objeye c ismini verdik. Ayni method
                                                // parametrelerine parantez icinde isim verdigimiz gibi orn;(int age,
                                                // String name, double money etc.)
        System.out.println(c.value);

        // A sinifinda bir method olusturduk ve bu methodun B sinifindan bir object bekledigi bilgisini ekledik. run()
        // adindaki methodumuz B sinifindan gelecek bir object ile calisacak. A sinifi B sinifina bagimlidir anlamina
        // geliyor.

        // Islem basamaklarini incelemeye devam etmek icin A38ClassRelationsBClass sinifina gidin --->.
    }



    // Composition = Birlestirme (has a)

    public A38ClassRelationsBClass d; // B sinifindan d adinda bir nesne tanimladik
    // bu da bir variable olusturma sekli.
    // public int age;
    // public String name;
    // public boolean true;
    // public A38ClassRelationsBClass d; --> digerlerinde data type olarak int, String ve boolean kullandik, bunda ise
    // ClassName ve object kullandik. Bu sekilde de instance variable olusturulabilir.


    // A sinifinda bir instance variable tanimladik ve bu instance variable imiz B sinifindan d isimli bir object olacak.
    // Islem basamaklari devam icin A38ClassRelations sinifina gidin --->.

}
