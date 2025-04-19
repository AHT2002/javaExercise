package test.java.com.example;

import org.junit.Test;

import main.java.com.example.Main;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testStringWithM() {
        assertTrue(Main.containsM("samanoo"));
    }

    @Test
    public void testStringWithoutM() {
        assertFalse(Main.containsM("bitpin"));
    }
}