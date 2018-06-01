package mypackage;
import static mypackage.HelloWorld.*;

public class Main {
    public static void main(String... args) {

        String hoge = null;
        System.out.println(hoge.contains("hello"));
        System.out.println(getHello());
    }
}