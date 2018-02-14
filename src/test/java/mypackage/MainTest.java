package mypackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private PrintStream preserved;
    @Before
    public void setUpStreams() {
        preserved = System.out;
        System.setOut(new PrintStream(outContent));

    }

    @After
    public void cleanUpStreams() {
        System.setOut(preserved);
    }
    @Test
    public void main() {
        Main.main();
        assertEquals("Hello World!!\n", outContent.toString());

    }
}