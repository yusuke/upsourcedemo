package mypackage;

import static org.junit.Assert.*;

public class HelloJetBrainsTest {

    @org.junit.Test
    public void getHello() {
        assertEquals("Hello JetBrains!", HelloJetBrains.getHello());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}