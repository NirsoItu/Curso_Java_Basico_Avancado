package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contagem dos elementos do stream
        System.out.println(estudantes.stream().count());

        // Retorna o elemento com maior numero de letras do stream
        System.out.println(estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com menor numero de letras do stream
        System.out.println(estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna o elemento com menor numero de letras do stream
        System.out.println(estudantes.stream().filter((estudante)->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção, com nomes concatenados e quantidade de letras de cada um
        System.out.println(estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos"+estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console e depois retorna na mesma coleção
        System.out.println("Retorna os elementos: "+estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elementos possuem a letra W maiúsculo no nome
        System.out.println("Tem algum elemento com a letra W maiúscula ?: "+estudantes.stream().allMatch((elemento) -> elemento.contains("W") ));

        // Retorna true se algum dos elementos possuem a letra a minúscula no nome
        System.out.println("Tem algum elemento com a letra a minúscula ?: "+estudantes.stream().anyMatch((elemento) -> elemento.contains("a") ));

        // Retorna o primeiro elemento da coleção
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.println("-- Operação encadeada --");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
               .peek(System.out::println)
  //              .filter((estudante)-> estudante.toLowerCase().contains("r"))
  //              .collect(Collectors.toList()));
  //              .collect(Collectors.joining(", ")));
 //               .collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-")+1))));





    }
}
