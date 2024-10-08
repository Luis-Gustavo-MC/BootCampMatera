package com.example;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, null);
        p1.setIdade(21);
        p1.setNome("LuisG");
        Pessoa p2 = new Pessoa("Luis", 21);
        new Pessoa();
        Pessoa p3 = Pessoa.builder()
            .nome("Luis")
            .idade(21)
            .build();

        System.out.println(p1.getNome() + "\n" + p1.getIdade());
        System.out.println(p2);
        System.out.println(p3);
    }
}