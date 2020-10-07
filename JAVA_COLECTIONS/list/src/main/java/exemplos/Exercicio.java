package exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> novosNomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        nomes.remove(1);
        System.out.println(nomes);

        nomes.remove("João");
        System.out.println(nomes);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean existe = nomes.contains("Juliano");
        if(existe){
            System.out.println("O nome Juliano existe na lista");
        } else {
            System.out.println("O nome Juliano não existe na lista");
        }

        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        System.out.println(novosNomes);

        for(String novoNome: novosNomes){
            nomes.add(novoNome);
        }
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        boolean estaVazia = nomes.isEmpty();
        if(estaVazia){
            System.out.println("A lista esta vazia");
        } else {
            System.out.println("A lista não está vazia");
        }


    }
}
