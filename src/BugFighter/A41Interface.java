package BugFighter;

interface IWorker {

    // Interface = Arayuz

    // Interface yapida Interface ismini verirken basina I ekleyerek onun bir Interface oldugunu belirtmemiz gerekiyor.
    // Bu yaygin bir kullanim bicimidir, kod uzerinda calisma yapacak baska kisilerin bu ismi gorduklerinde bunun bir
    // Interface yapi oldugunu anlamalarina kolaylik sagliyor.

    // Interface yapilarda tipki abstraction da oldugu gibi methodlari bos olarak olusturuyoruz ve Interface' in alt
    // yapilari mevcutsa bu alt yapilarin kendi yapilarina bu methodlari eklemesini istiyoruz. Yani bir nevi Interface
    // yapinin icinde var olan bit methodu alt bir Interface yapida overriding ediyoruz.

    // Interface yapilarin Abstract class lardan farki abstract edilen bir sinif icerisine deger girmeden de instance
    // variabler lar, constructonlar, getter setter methodlari eklenebiliyor ancak Interface sadece tek bir kalip olarak
    // olusturuluyor, icerisine contructor, getter setter methodlari alamiyor.


    // public int id; --> interface icerisine bos bir alana olusturamiyoruz.Variable 'id' might not have been initialized

    final int id = 0; // olusturdugumuzun instance variable in bir degeri olmali
    final String okul = "Austin Community College";


    // methodlar
    public void giris();
    public void cikis();
    public boolean yemekSaati(int saat);



    // Buyuk projelerde bir yapi olusturuldugunda ornegin ana bir yapiya bagli alt departmanlar olacak ve tum bu
    // departmanlar icin ortak kullanimda olmasini istedigimiz ozellikler olacak. Ornegin yine bir universite semasi
    // uzerinden gidersek, universite kuruldugu zaman var olan departmanlarla bir yapi olusturulacak. Her departman
    // icin ortak olan ozellikler ata sinifta yer alacak. Ata siniflarin altlarinda ortak ozellikleri olan departmanlar
    // icin ara siniflar olusturulacak ve departmanlar en son kisimda yer alacak. Ata sinif ile departmanlar arasinda
    // olusturulan bu yapilar daha sonra bu universite bunyesine yeni departmanlar eklendiginde sadece tek bir ekleme
    // ile ata sinif ve ara sinifa baglanabilecek. ata sinifin ve ara sinifin ozelliklerini kullanabilecek. Interface
    // yapilar da bu nedenle olusturuluyorlar, her defasinda yapilan en ufak bir ortak ozellige ait degisikligi her
    // sinifta ayri ayri duzeltmek zorunda kalmamak icin bos methodlardan olusan yapilar olusturuluyor ve sisteme yeni
    // bir departman eklendiginde otomatik olarak sistem kuruldugunda olusturulmus olan interface yapinin alt sinifi
    // olarak tanimlanarak o yapi icerisindeki ozellikleri kullanmasina izin veriliyor. Interface yapi icerisindeki
    // methodlar yeni gelen departman sinifi icerisine override edildiginde yeni gelen departman icin ekstra bir is gucu
    // harcamadan hazir olan yapi icerisine entegre etmek cok kisa ve zahmetsiz oluyor.





}

