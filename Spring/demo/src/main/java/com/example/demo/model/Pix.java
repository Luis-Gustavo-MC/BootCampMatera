package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity

public class Pix {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private LocalDateTime createdAt = LocalDateTime.now();
    @Column
    private String chavePixPagador;
    @Column
    private String chavePixRecebedor;
    @Column
    private BigDecimal valor;
    /*Uma conta pode ter feito vario pix mas um pix so pode ser relacionado a uma conta*/ 
    @ManyToOne
    @JoinColumn(name = "CONTA_ID")
    private Conta conta;
}
