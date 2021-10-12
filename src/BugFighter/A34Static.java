package BugFighter;

import javax.rmi.CORBA.Stub;

public class A34Static {

    // Static bir instance variable ya da method a ulasmak icin object olusturmaya gerek yok, static oldugu icin baska
    // bir static methodun icine direkt ismi ile cagrilabilir.

    public String name;
    public int id, grade;
    private static int counter = 0; // static oldugu icin object uretmeden bu degiskene ulasabiliriz


    A34Static(String name, int id, int grade){ // Constructor
        this.name = name;
        this.id = id;
        this.grade = grade;
        A34Static.counter++; // Her student (object) eklendiginde sayac artacak. Basina this koymaya gerek yok cunku bu
        // nesneye ait bir degisken degil komple sinifa ait bir degisken.
    }

    public void exit(){
        A34Static.counter--;
    }

    public static int studentsCount(){
        return A34Static.counter;
    }

    public static double calculateOverall(int [] arr){ // bu method disaridan Array veri bekliyor
        double overall = 0;
        for (int i = 0; i < arr.length; i++) {
            overall += arr[i];
        }
        return overall / arr.length;
    }



    public static void main(String[] args) {

        System.out.println("Online ogrenciler: " + A34Static.studentsCount()); // studentCounter methoduna ulasmak icin
                                                                    // object olusturmaya gerek yok cunku method static
        A34Static student1 = new A34Static("Ali", 220, 90);
        A34Static student2 = new A34Static("Ayse", 330, 100);
        A34Static student3 = new A34Static("Mehmet", 440, 80);

        System.out.println("Online ogrenciler: " + A34Static.studentsCount()); // Online ogrenciler: 3

        student1.exit();

        System.out.println("Online ogrenciler: " + A34Static.studentsCount()); // Online ogrenciler: 2

        int [] grades = new int[3];
        grades[0] = student1.grade;
        grades[1] = student2.grade;
        grades[2] = student3.grade;

        System.out.println(A34Static.calculateOverall(grades)); // calculateOverall methodunu grades isimli Array
                                                                // verileri ile calistir
    }
}
