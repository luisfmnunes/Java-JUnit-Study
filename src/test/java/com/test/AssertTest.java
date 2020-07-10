package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void testAssertArrayEquals() {
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado,atual);
    }

    @Test
    public void testAssertEquals() {
        assertEquals("text","text");
    }

    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull() {
        Calculadora cal = new Calculadora();
        assertNotNull(cal);
    }

    @Test
    public void testAssertNotSame() {
        assertNotSame(new Object(),new Object());
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }
}
