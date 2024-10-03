# Sistema de Gestão de Saldo - Resumo

Este projeto em Java com Spring Boot simula um sistema de controle de saldo para um cliente, utilizando `UUID` para identificação, `BigDecimal` para manipulação precisa de valores monetários, e tratamento de exceções personalizadas.

## Funcionalidades:
- **Adicionar Saldo**: Incrementa o saldo do cliente usando `BigDecimal`.
- **Sacar Saldo**: Verifica se há saldo suficiente e se o valor é positivo antes de efetuar o saque, lançando a exceção `SaldoInsuficienteException` em caso de saldo insuficiente.

## Classes Principais:
1. **DemoApplication**: Classe principal que executa a aplicação e demonstra o uso de adição e saque de saldo.
2. **Cliente**: Usa `UUID` para identificar o cliente e `BigDecimal` para o saldo, além de métodos para adicionar e sacar saldo.
3. **SaldoInsuficienteException**: Exceção personalizada lançada quando o cliente tenta sacar mais do que o saldo disponível.

## Execução:
Use `mvn spring-boot:run` para rodar a aplicação.

O projeto utiliza Lombok para gerar métodos automaticamente e requer que o plugin do Lombok esteja instalado na IDE.
