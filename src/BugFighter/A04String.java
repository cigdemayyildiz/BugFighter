package BugFighter;

public class A04String {

    public static void main(String[] args) {

        // String ler char lardan tureyen bir siniftir. Char degiskeninde sadece tek bir karakter tutabildigimiz
        // icin String sinifi charlari cift tirnak arasi kullanarak bir araya getirebildigimiz bir data tipidir.

        String str = "Hello World!";
        // Siniflarin isimleri buyuk harfle baslar String bir siniftir.
        System.out.println(str); // Hello World!

        System.out.println("15" + 20); // 1520 --> Java iki tirnak arasinda bir veri gordugu zaman onu direkt olarak
        // String olarak algiladigi icin bu islemde 15 i yazdiriyor ve arkasindan 20 yi sayi olarak yazdiriyor.
        // Burada aradaki arti(+) isareti String ve Primitive Data Type i birbirine baglamaya calistigi icin toplama
        // islemi olarak kullanilmiyor. Iki veriyi birbirine baglamak olarak kullaniliyor.

    }
}
