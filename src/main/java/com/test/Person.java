package com.test;

public class Person {

    private final String nome;
    private final String sobrenome;

    public Person(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    /*@Override
    public String toString() {
        return nome + " " + sobrenome;
    }*/
}
