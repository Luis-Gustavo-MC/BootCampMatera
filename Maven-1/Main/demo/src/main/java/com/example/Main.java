package com.example;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, null);
        p1.setIdade(21);
        p1.setNome("Luis");
        System.out.println(p1.getNome() + "\n" + p1.getIdade());
    }
}