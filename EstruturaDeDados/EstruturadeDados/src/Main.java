import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Declaração Lista
        List <Integer> numeros = new ArrayList<>();

        //Adicionando numeros em uma lista
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        //Lendo todos os números da lista
        for (Integer num : numeros) {
            System.out.println(num);
        }

        //Lendo a lista utilizando a collection stream() + lambda
        System.out.println("=");
        numeros.stream().forEach(num->System.out.println(num));

        //Criando uma lista com numeros maiores de 2 usando filter() + lambda
        List<Integer> numerosMaiorQueDois = new ArrayList();
        numerosMaiorQueDois = numeros.stream().filter(num -> num>2).toList();
        System.out.println("=\n Numeros maiores que dois:");
        numerosMaiorQueDois.forEach(num -> System.out.println(num));

    }
}
