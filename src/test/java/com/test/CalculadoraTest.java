package com.test;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5, soma);
    }

    @Test
    public void testeSomarComMock() {
        Calculadora calculadora = mock(Calculadora.class);
        String expressao = "1+2+3";

        when(calculadora.somar(expressao)).thenReturn(10);

        int resultado = calculadora.somar(expressao);

        assertEquals(10,resultado);

    }

}