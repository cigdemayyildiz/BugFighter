package BugFighter;

public class A22MethodsReturn {

    static void power(int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        System.out.println(result);
    }

    static int power2(int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.print("Return type void olan methoddan: ");
        power(10,2); // 100 --> void bir methodu main method icine cagirma
        // int x = power(10,2); // void cannot be converted to int
        // System.out.println(power(10,2)); // 'void' type not allowed here
        // void return type i olan bir methodu sout icinde cagiramiyoruz

        power2(10,2); // eger bir int degiskeni icine store etmezsen ekranda cikti goruntuleyemezsin

        int r = power2(10,2); // int return type ile olusturulmus bir methodu main method icine cagirma
        // return type ile olusturulan methodlar uzerinde islem yapilabilir, bir isleme dahil edilebilir. Void return
        // type ile olusturulan methodlarda bu mumkun degildir.
        System.out.println("Return type int olan methoddan: " + r); // 100

        System.out.println(power2(10,2)); // 100 --> Store etmeden direkt sout icinde de cagirilabiliyor
    }
}
