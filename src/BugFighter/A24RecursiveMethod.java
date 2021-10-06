package BugFighter;

public class A24RecursiveMethod {

    // Recursive = Ozyineli
    // Method icinde kendini bir kere daha cagiran methodlar
    // Recursive methodlar her zaman return lu method olmak zorundadir

    static int f(int x){
        int add = 0;
        for (int i = 0; i < x; i++) {
            add += i;
        }
        return add;
    }

    static int r(int x){
        if (x == 1){
            return 1;
        }
        return x + r(x - 1); // method icinde kendisini (r(int x)) bir kere daha cagirdi
    }


    public static void main(String[] args) {

        System.out.println(f(5));
        System.out.println(r(5));



    }
}
