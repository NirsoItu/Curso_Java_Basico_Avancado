package exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Rogerio");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Aparecida");
        nomes.add("Larissa");
        nomes.add("Gilmar");

        System.out.println(nomes);

        // Ordenação crescente
        Collections.sort(nomes);
        System.out.println(nomes);

        // Editar elemento
        nomes.set(2, "Ana");
        System.out.println(nomes);

        // Adicionar elemento
        nomes.add("Silvia");
        System.out.println(nomes);

        // Excluir elemento, podemos usar o conteudo ou o index do elemento
        nomes.remove(4);
        System.out.println(nomes);

        // Retorna o elemento para uma variável
        String variavel = nomes.get(4);
        System.out.println(variavel);

        // Retorna o indice do elemento na lista
        int posicao = nomes.indexOf("Rogerio");
        System.out.println(posicao);

        // Retorna o tamanho do array em um numero inteiro
        int tamanho = nomes.size();
        System.out.println(tamanho);

        // Boolean de checagem
        boolean contem = nomes.contains("Amanda");
        System.out.println(contem); // false

        // Laço de repetição
        for(String nomeDaLinha: nomes){
            System.out.println("-> "+nomeDaLinha);
        }

        // Retorna todos os dados da lista
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){ // retorna um booleano
            System.out.println("--> "+iterator.next()); // retorna o objeto que esta iterando
        }


        // Limpa a lista
        nomes.clear();

        // Verifica se a lista esta vazia
        boolean estaVazia = nomes.isEmpty();
        System.out.println(estaVazia); // true


    }
}
