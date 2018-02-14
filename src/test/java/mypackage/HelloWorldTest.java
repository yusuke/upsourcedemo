package mypackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void getHello() {
        assertEquals("Hello World!!", HelloWorld.getHelloWorld());
    }
}