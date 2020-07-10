package com.test;

import java.util.Arrays;

public class Calculadora{

    public static Operacao soma = expressao -> Arrays.stream(expressao.split("\\+")).mapToInt(Integer::valueOf).sum();


    public int somar(String expressao) {
        int sum = soma.resolver(expressao);
        System.out.println(sum);
        return sum;
    }
}

interface Operacao{
    int resolver(String expressao);
}
