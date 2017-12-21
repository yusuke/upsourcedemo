package mypackage;

import static org.junit.Assert.*;

public class HelloJetBrainsTest {

    @org.junit.Test
    public void getHello() {
        assertEquals("Hello JetBrains!", HelloJetBrains.getHello());
    }
}