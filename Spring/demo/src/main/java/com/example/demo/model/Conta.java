package com.example.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "CONTA")

public class Conta {
    //Gerando um ID de forma aleatoria via UUID
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id; 
    @Column
    private String nomeTitular;
    @Column
    private Integer numeroConta;
    @Column
    private String chavePix;
    @Column
    private BigDecimal saldo;
    //Mapeamento pelo objeto conta na tabela pix
    //Cascade: 
    //orphanRemoval: remover filhos que nao tem referencia 
    @OneToMany(mappedBy = "conta" , cascade = CascadeType.ALL , orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Pix> historicoPix = new ArrayList<>();

}
