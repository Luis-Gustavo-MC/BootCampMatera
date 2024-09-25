import java.lang.classfile.ClassFile.Option;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
        List<Integer> numerosMaiorQueDois = new ArrayList<Integer>();
        numerosMaiorQueDois = numeros.stream().filter(num -> num>2).toList();
        System.out.println("=\n Numeros maiores que dois:");
        numerosMaiorQueDois.forEach(num -> System.out.println(num)); 

        //Retornar o primeiro numero da lista maior que dois
        Integer numeroMaiorQueDois = numeros.stream().filter(num->num>2).findFirst().get();
        System.out.println(numeroMaiorQueDois);

        //Criando uma lista com ordem aleatoria
        List<Integer> numAleatorios = new ArrayList<>(numeros);
        Collections.shuffle(numAleatorios);
        System.out.println("Lista de numeros aleatorios: ");
        numAleatorios.stream().forEach(num -> System.out.println(num));

        //Verificar se existe um numero na lista
        Optional<Integer> optNumero = numeros.stream().filter(num -> num>10).findFirst();
        if (optNumero.isPresent()) {
            Integer num = optNumero.get();
            System.out.println("\n" + num);
        }else{
            System.err.println("N");
        }
    }
}
