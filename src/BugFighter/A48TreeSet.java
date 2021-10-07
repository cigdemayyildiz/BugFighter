package BugFighter;

import java.util.TreeSet;

public class A48TreeSet {

    public static void main(String[] args) {

        TreeSet t = new TreeSet();

        t.add(90);
        t.add(34);
        t.add(54);
        t.add(98);
        t.add(3);
        t.add(18);
        // t.add(null); null veri ekleyemiyoruz.

        t.forEach(item -> System.out.println(item));

    }
}
