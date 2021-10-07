package BugFighter;

import java.util.LinkedHashSet;

public class A47LinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet days = new LinkedHashSet();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add(null);

        days.add("Sunday"); // ikinci kere eklenen veri yazdirilmadi cunku bir degeri iki kere yazdirmayi kabul etmiyor.
        days.remove("Friday");

        days.forEach(item -> System.out.println(item + " "));



    }


}
