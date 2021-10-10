package BugFighter;

import java.util.Vector;

public class A51Vector {

    public static void main(String[] args) {

        // Vector

        // Insertion Order
        // Null Value
        // Duplicate Elements
        // There is get(); method to reach out for specific element

        // Senkronize bir yapi
        // Varsayilan bir vector olusturdugumuzda default olarak kapasitesi 10 oluyor. 10.alana da veri girildikten sonra
        // bir veri daha girildiginde yani 11.alan kullanilmaya baslandiginda yeni bir 10luk alan daha olusturuyor.

        Vector list = new Vector();


        System.out.println("List vectorunun baslangictan gelen default kapasitesi: "+list.capacity()); // 10
        System.out.println();

        list.add(54);
        list.add(99);
        list.add(27);
        list.add("John");
        list.add("Apple");
        list.add("Orange");
        list.add("Lemon");

        list.forEach(item-> System.out.println(item));
        System.out.println();
        list.add(2,"David");
        list.add(1,"Alex");
        list.add(7,48);
        list.add(5,26);


        list.forEach(item-> System.out.println(item));
        System.out.println();
        System.out.print("10 element girildikten sonra vectoun kapasitesi: " + list.capacity());


    }
}
