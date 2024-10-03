package com.example.demo;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class Cliente {
    private UUID id;
    private String nome;
    private BigDecimal saldo;
    
    public void adicionarSaldo(BigDecimal valor){
        this.saldo = this.saldo.add(valor);
    }
    public void sacarSaldo(BigDecimal valor)  throws SaldoInsuficienteException {
        try {
            if (valor.compareTo(this.saldo)<=0 && valor.compareTo(BigDecimal.ZERO) > 0) {
                this.saldo = this.saldo.subtract(valor);
            }else if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("O valor deve ser positivo.");

            }else{
                throw new SaldoInsuficienteException("Saldo insuficiente para sacar o valor de: " + valor);
            }
        }catch(IllegalArgumentException e){
            System.err.println("Erro ao sacar: " + e.getMessage());
        } 
        catch (SaldoInsuficienteException e) {
          System.err.println("Erro ao Sacar: " + e.getMessage());  
        } catch(Exception e){
            System.err.println("Erro Inesperao ao sacar: " + e.getMessage());
        }
    }
    
}
