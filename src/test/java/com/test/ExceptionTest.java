package com.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {

    @Test (expected = IndexOutOfBoundsException.class)
    public void empty() {
        new ArrayList<Object>().get(0);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void stringEmpty() {
        List<String> lista = new ArrayList<>();
        lista.add("Pedro");

        lista.get(1);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
        List<Object> list = new ArrayList<>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index 0 out of bounds for length 0");
        list.get(0);
    }


    @Test
    public void testExceptionMessage() { //try catch idiom
        try {
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOutofBoundsException seja lançada");
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }
}
