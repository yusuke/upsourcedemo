package mypackage;
import static mypackage.HelloWorld.*;





public class Main {
    public static void main(String... args) {
        String hello = null;
        hello = "hello world";
        if (hello.contains("hello")) {
            System.out.println("hello");
        }

        System.out.println(getHello());
    }
}