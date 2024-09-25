package com.example;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter // Gera os getts automaticamente
@Setter //Gera os setts automaticamente
@AllArgsConstructor //Construtor com todos os argumentos
@RequiredArgsConstructor //Cria um construtor com todos os campos final e @NonNull
@ToString // Gera o toString automatico
@EqualsAndHashCode
@Data //Simplifica os @Getter , @Setter, @EqualsandHashCode, @ToString , @RequiredArgsConstructor

public class Pessoa {
    private String nome;
    private Integer idade;

}
