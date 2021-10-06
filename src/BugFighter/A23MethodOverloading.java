package BugFighter;

public class A23MethodOverloading {

    // Overloading --> Uzerine yazma gibi bir anlama gelebilir

    // add(int, int)
    static int add(int a, int b){ // java ccagirilan methodu nasil kullanmasi gerektigine parametrelere bakarak karar veriyor.
        System.out.print("From 1st method: ");
        return a + b;
    }
    // add(ind, double)
    static double add(int a, double b){
        System.out.print("From 2nd method: ");
        return a + b;
    }
    // add(int, int, int)
    static int add(int a, int b, int c){
        System.out.print("From 3rd method: ");
        return a + b + c;
    }
    // add(int, int, double)
    static double add(int a, int b, double c){
        System.out.print("From 4th method: ");
        return a + b + c;
    }
    // add(int, double, int)
    static double add(int a, double b, int c ){
        System.out.print("From 5th method: ");
        return a + b + c;
    }


    public static void main(String[] args) {

        System.out.println(add(1,2)); // From 1st method: 3
        System.out.println(add(1,2.0)); // From 2nd method: 3.0
        System.out.println(add(1,2,3)); // From 3rd method: 6
        System.out.println(add(1,2,3.0)); // From 4th method: 6.0
        System.out.println(add(1,2.0,3)); // From 5th method: 6.0

    }
}
