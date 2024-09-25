# Projeto: Manipulação de Objeto Pessoa com Lombok

Este projeto cria um objeto `Pessoa` com os atributos `nome` e `idade`, utilizando a biblioteca **Lombok** para gerar automaticamente métodos e construtores.

## Anotações Lombok utilizadas:

- `@Getter` – Gera automaticamente os métodos *getter*.
- `@Setter` – Gera automaticamente os métodos *setter*.
- `@AllArgsConstructor` – Cria um construtor com todos os argumentos.
- `@RequiredArgsConstructor` – Cria um construtor com todos os campos `final` e anotados com `@NonNull`.
- `@ToString` – Gera automaticamente o método `toString()`.
- `@EqualsAndHashCode` – Gera automaticamente os métodos `equals()` e `hashCode()`.
- `@Data` – Combina `@Getter`, `@Setter`, `@EqualsAndHashCode`, `@ToString` e `@RequiredArgsConstructor`.
- `@Builder`  – Permite a criação de objetos usando o padrão de projeto Builder, oferecendo uma maneira mais flexível e legível para instanciar objetos complexos.
## Dependência

Adicione a seguinte dependência ao arquivo `pom.xml`:

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.28</version>
    <scope>provided</scope>
</dependency>
```

Para mais detalhes, visite o repositório: [Lombok no mvnrepository](https://mvnrepository.com/artifact/org.projectlombok/lombok).
