package BugFighter;

public class A29ForEach {

    public static void main(String[] args) {

        // For Each sadece Array lerde kullanilir

        // for (dataTypeOfArray nameOfForEach : nameOfArray) {} --> foreach syntax

        int [] list = new int[3];

        list[0] = 1;
        list[1] = 2;
        list[2] = 3;

        System.out.println("For Each kullanilarak: ");
        for (int lst : list) {
            System.out.println(lst);
        }

        // for loop kullanilarak
        System.out.println("For Loop kullanilarak: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }
}
