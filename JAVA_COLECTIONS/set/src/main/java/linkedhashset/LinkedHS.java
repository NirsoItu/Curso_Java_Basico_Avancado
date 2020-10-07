package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHS {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println("Retorna todos: "+sequenciaNumerica);

        //Remove o numero do set
        System.out.println("Remove o n'umero 4: "+sequenciaNumerica.remove(4));
        System.out.println(sequenciaNumerica);

        //Retorna o tamanho
        System.out.println("Tamanho: "+sequenciaNumerica.size());

        //Navegar nos itens
        Iterator<Integer> iteratorSequencia = sequenciaNumerica.iterator();
        while (iteratorSequencia.hasNext()){
            System.out.println("Iterator -> "+iteratorSequencia.next());
        }

        for(Integer sequencia: sequenciaNumerica ){
            System.out.println("For --> "+sequencia);
        }

        sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty());










    }
}
