package queues;

import com.sun.javafx.scene.layout.region.SliceSequenceConverter;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        System.out.println("Navegando pelos nomes...");
        for(String nome:fila){
                System.out.println("Nome: " + nome);
        }

        System.out.println("");

        String primeiroNomeDaFila = fila.peek();
        System.out.println("Primeiro nome sem remover: "+primeiroNomeDaFila);
        System.out.println(fila);

        System.out.println("");

        String removendoPrimeiro = fila.poll();
        System.out.println("Removendo o primeiro nome: "+removendoPrimeiro);
        System.out.println(fila);

        System.out.println("");

        System.out.println("Adicionando o nome Daniel");
        fila.add("Daniel");

        Iterator<String> iteratorFila = fila.iterator();
        while (iteratorFila.hasNext()){
            System.out.println(iteratorFila.next());
        }

        System.out.printf("A lista possui %s elementos",fila.size());

        System.out.println("");

        if(fila.isEmpty()){
            System.out.println("A lista está vazia");
        } else {
            System.out.println("A lista não está vazia");
        }

        if(fila.contains("Carlos")){
            System.out.println("A fila contém o nome Carlos");
        }else{
            System.out.println("A fila não contém o nome Carlos");
        }
    }
}
