package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercicio {
    public static void main(String[] args) {
        TreeSet<Integer> lista = new TreeSet<>();

        lista.add(3);
        lista.add(88);
        lista.add(20);
        lista.add(44);
        lista.add(3);

        Iterator<Integer> iteratorLista = lista.iterator();
        while (iteratorLista.hasNext()){
            System.out.println("Navegando-> "+iteratorLista.next());
        }

        for(Integer numero: lista){
            System.out.println("For -->: "+numero);
        }

        lista.pollFirst();
        System.out.println("Removendo o primeiro item da lista: "+lista);

        lista.add(23);
        System.out.println("Adicionando o item 23 na lista: "+lista);

        System.out.println("Tamanho da lista: "+lista.size());

        if(lista.isEmpty()){
            System.out.println("A lista está em vazia");
        }else {
            System.out.println("A lista não está em vazia");
        }
    }
}
