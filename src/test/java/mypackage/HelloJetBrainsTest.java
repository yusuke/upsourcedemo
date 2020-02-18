package mypackage;

import static org.junit.Assert.*;

public class HelloJetBrainsTest {

    @org.junit.Test
    public void getHello() {
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Hello JetBrains!", HelloJetBrains.getHello());
    }
}