package BugFighter;

public class A33AccessModifiersTest {

    public static void main(String[] args) {

    /*
    public --> herkese erisilebilir (package lar, classlar)
    protected --> ayni package icinde erisilebilir
    default --> herkese erisilebilir ama public kadar genis bir yetkisi yok
    private --> sadece ait oldugu sinifta erisilebilir, disardan erisilemez
     */

        A33AccessModifiers car = new A33AccessModifiers(); // object

        car.speed = 320; // public
        car.suv = true; // protected
        car.color = "Black"; // default
        // car.enginePower=10; --> private

        // car.print(); --> private method o yuzden cagirilamiyor
        car.run(); // Engine Power: 200
    }
}
