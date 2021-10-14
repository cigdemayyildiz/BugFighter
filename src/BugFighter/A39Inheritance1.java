package BugFighter;

public class A39Inheritance1 {

    // Calisan (Ata Sinif)

    protected String name, lastName, email, phoneNumber; // encapsulation uygulamak icin public olan access modifier i
                                            // protected a cevirdik ve ardindan getter setter methodlarini olusturduk.

//    public A39Inheritance1() {
//    }

    public A39Inheritance1(String name, String lastName, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void enter() {  // eger bu method access modifier ini private yaparsak o zaman diger siniflar bu sinifin alt
                          // sinifi olsalar dahi orada bu methodu calistiramayiz
        System.out.println(this.name+" "+lastName + " giris yapti!");
        // Eger bu methodun alt siniflardan bazilarinda gecerli bazilarinda gecerli olmamasini istiyorsak, o zaman
        // bu method icin Method Overriding yapmamiz gerekiyor. Method Overriding metot ezme, Method Overriding yapilan
        // sinifta bu methodu gecersiz kilma anlamina geliyor. A39Inheritance2 sinifina -->
        // public void enter(){} --> bu yapida access modifier haric return type ya da isimde bir degisiklik yapildigi
        // taktirde overriding yapilan yer de de ayni degisiklik yapilmali, yoksa overriding yapilmis olan method
        // calimayacaktir.
    }

    public String exit(){ // Return typle return komutunu kullanmamizi gerektiren bir method kullandigimizda methodu bu
        // sekilde olusturuyoruz. Bu methodu A39Inharitance3 sinifi icerisinde Method Overriding yapalim --->
        return this.name + " cikis yapti!";
    }

    public static void exitList(A39Inheritance1 [] exitControl){ // exitList() methodu calismak icin A39Inheritance1
        // sinifindan bir Array'e ihtiyac duyacak.
        for (A39Inheritance1 list : exitControl){ // forEach dongusu ile tum listeyi kontrol edecek
            System.out.println(list.exit()); // ve listedeki her bir eleman icin exit komutunu calistiracak.
        }
    }



    /*                                                                          ATA SINIF
                                                                         ________________________
                                                                        |        Calisan         |
                                                                        | ---------------------- |
                                                                        | -AdSoyad               |
                                                                        | -Telefon               |
                                                                        | -Email                 |
                                                                        | ---------------------- |
                                                                        | +giris()               |
                                                                        | +cikis()               |
                                                                        | +yemek()               |
                                                                        |------------------------|
                                                                                    |
                                                                                    |
                                     ----------------------------------------------------------------------------------------
                                     |                                                                                      |
                                  ALT SINIF                                                                            ALT SINIF
       (Asistan ve Ogretim Gorevlisini tanimlamak icin olusturulan ara sinif)                 (Guvenlik Gorevlisi ve Bilgi Islem'i tanimlamak icin olusturulan ara sinif)
                          ________________________                                                              ________________________
                         |      Akademisyen       |                                                            |         Memur          |
                         | ---------------------- |                                                            | ---------------------- |
                         | -bolum                 |                                                            | -departman             |
                         | -gorev                 |                                                            | -mesai                 |
                         | -dersler               |                                                            | ---------------------- |
                         | ---------------------- |                                                            | +calis()               |
                         | +derseGir()            |                                                            |------------------------|
                         |------------------------|                                                                         |
                                      |                                                                                     |
                                      |                                                                                     |
              ---------------------------------------------------                                     ------------------------------------------------
              |                                                 |                                     |                                              |
          ALT SINIF                                           ALT SINIF                         ALT SINIF                                       ALT SINIF
  ________________________                            ________________________            ________________________                       ________________________
 |        Asistan         |                          |    Ogretim Gorevlisi   |          |   Guvenlik Gorevlisi   |                     |      Bilgi Islem       |
 | ---------------------- |                          | ---------------------- |          | ---------------------- |                     | ---------------------- |
 | -yuksekLisans          |                          | -unvan                 |          | -belge                 |                     | -gorev                 |
 | ---------------------- |                          | ---------------------- |          | ---------------------- |                     | ---------------------- |
 | +laboratuvarlaraGir()  |                          | +toplantiGir()         |          | +nobet()               |                     | +tarama()              |
 | +quizleriOku()         |                          | +sinvalariOku()        |          |------------------------|                     |------------------------|
 |------------------------|                          |------------------------|


     */




}
