package com.example;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    private String nome;
    private Integer idade;

}
