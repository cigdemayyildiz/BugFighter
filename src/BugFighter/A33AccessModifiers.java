package BugFighter;

public class A33AccessModifiers {

    // Access Modifiers = Erisim Belirleyiciler

    /*
    public --> herkes erisebilir (package lar, classlar)
    protected --> alt-sinif ve ayni package erisebilir
    default --> ayni pakettekiler erisebilir
    private --> sadece ait oldugu sinifta erisilebilir, disardan erisilemez alt-sinif dahi erisemez
     */

    /*
    Ornegin bir Car Class imiz oldugunu dusunelim ve Car ile ilgili variable lar olusturalim. Arabanin bir cok degiskeni
    olabilir, motor gucu olabilir, VIN numarasi olabilir, rengi olabilir, hizi olabilir. Arabayi boyatabiliriz ve
    rengini degistirebiliriz, hiz yaparsak speed ini artirabiliriz, bunlar degisken kisiden kisiye, kullanimdan
    kullanima degisebilecek seylerdir. Ama arabanin motor gucunu ya da VIN numarasini degistiremeyiz, bunlar
    degistirilemez variablerdir. Bu verilere herkesin kolayca ulasip uzerinde yanlislikla degisim yapmasina olanak
    tanimamak icin bu tarz variable lari herkesin ulasimina acik olusturmamak gerekir.
     */

    // Arabanin degiskenleri bunlar olsun

    private int enginePower; // eger public int enginePower; olarak tanimlasaydik, A33AccessModifiersTEst sifindindan
    // bu variable i cagirdigimizda herhangi bir sorun yasamayip uzerinde degisiklik yapabilecektik.
    private long vinNumber; // ayni sekilde eger private erisim tipine cevirmeseydik bir baska siniftan bu variable i
    // cagirabilecektik.
    String color; // herhangi bir erisim tipi eklenmediginde bu verinin 'default' oldugunu gosteriyor. Default public
    // kadar genis bir erisilmeye sahip degil.
    public int speed; // herkese erisilebilir erisim tipi. sadece siniflar arasi degil package lar arasinda da erisim
    // saglaniyor.
    protected boolean suv; // sadece bulundugu package icinden erisim saglaniyor

    A33AccessModifiers(){ // Constructor
        this.enginePower = 200;
        this.vinNumber = 342454324525l;
        this.suv = true;
        this.color = "red";
    }

    private void print(){ // eger bu method u private yaparsak baska bir yerden erisimi olmayacak
        System.out.println("Engine Power: " + enginePower);
    }

    public void run(){ // print adli method private ama private erisim tipindeki bir veri ayni class icinde
        // kullanilabildigi icin private bir methodu public, default ya da protected bir method icinden cagirdigimizda
        // bu olusturulan yeni method, private methodu bu class disinda calistiracak ama yeni olusturulan methodun ismi
        // ile cagirilirsa calisacak. Bu ornekte run methodunun icine private erisim tipi olan print methodunu cagirdik
        // ve bu class disindan methodu cagirdigimizda calisti.
        print();
    }
}
