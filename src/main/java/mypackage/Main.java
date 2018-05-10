package mypackage;
import static mypackage.HelloWorld.*;

public class Main {
    public static void main(String... args) {
        String hello = null;
        System.out.println(hello.toString());

        // ほげほげ
        String world = "hello world";
        world = "hello jetbrains";
        System.out.println(world);
        System.out.println(getHello());
    }
}