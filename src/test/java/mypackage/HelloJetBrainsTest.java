package mypackage;

import java.util.Enumeration;
import java.util.Properties;

import static org.junit.Assert.*;

public class HelloJetBrainsTest {

    @org.junit.Test
    public void getHello() {
        System.out.println("----------------------");
        final Properties properties = System.getProperties();
        final Enumeration<Object> keys = properties.keys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            System.out.println(key + ":" + System.getProperty(key));
        }
        System.out.println("----------------------");
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Hello JetBrains!", HelloJetBrains.getHello());
    }
}