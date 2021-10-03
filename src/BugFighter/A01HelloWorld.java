package BugFighter;

public class A01HelloWorld {

    public static void main(String[] args) {

        System.out.println("Merhaba Dunya!"); // Merhaba Dunya!
        // println deki ln satiri komple bu mesaj icin ayiriyor
        System.out.println("Hello!"); // Hello
        System.out.println("Merhaba ben Cigdem " +
                "sizlerle birlikte Java "
                + "ogreniyorum."); // Merhaba ben Cigdem sizlerle birlikte Java ogreniyorum.
        System.out.println(10 + "15"); // 1015
        System.out.println(10 + 15); // 25
        System.out.print("Merhaba \nDunya\n"); // Merhaba Dunya(Dunya alt satirda)
        System.out.print("Merhaba Dunya"); // Merhaba DunyaMerhaba 	Dunya
        // print e ln eklemeyince bir alta da ln siz bir print yazarsan ikisini ayni satira aliyor, o satiri o mesaj
        // icin rezerv etmiyor
        System.out.println("Merhaba \tDunya"); // Merhaba   Dunya(arada bir tab lik bosluk var)
    }
}
