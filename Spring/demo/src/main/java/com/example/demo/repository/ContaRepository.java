package com.example.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Conta;
import java.util.UUID;
import java.math.BigDecimal;

@Repository //Informar q a interface vai fazer consuta em banco
public interface ContaRepository extends JpaRepository<Conta , UUID>{
    //Optional retornar um valor que pode ou nao ser nulo
    Optional<Conta> findByChavePix(String chavePixPagador);
    Optional<Conta> findByNumeroConta(Integer numeroConta);
    //Buscar numero da conta 
    @Query("SELECT conta FROM Conta conta WHERE conta.numeroConta = :numeroConta AND conta.chavePix = :chavePix AND conta.saldo > :saldo")
    Optional<Conta> findByNumeroContaAndChavePixAndSaldoMaiorQue10(@Param("numeroConta") Integer numeroConta, @Param("chavePix") String chavePix, @Param("saldo") BigDecimal saldo);
    
}
