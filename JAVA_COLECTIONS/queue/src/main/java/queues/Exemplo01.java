package queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exemplo01 {
    public static void main(String[] args) {
        Queue<String> filaBanco= new LinkedList<>();

        filaBanco.add("Rogerio");
        filaBanco.add("Larissa");
        filaBanco.add("Aparecida");
        filaBanco.add("Gilmar");
        filaBanco.add("Reginaldo");

        System.out.println(filaBanco);

        //Retorna o primeiro cliente a ser atendido e removê-lo
        String clienteAserAtendido = filaBanco.poll();
        System.out.println("Pool: "+clienteAserAtendido);
        System.out.println(filaBanco);

        //Retorna o primeiro cliente a ser atendido retorna null se a fila estiver vazia
        String primeiroClienteAseAtendido = filaBanco.peek();
        System.out.println("Peek: "+primeiroClienteAseAtendido);

        /*//Limpar a fila
        filaBanco.clear();

        //Retorna o primeiro cliente ou lança uma exceção em caso de anormalidades (lista vazia)
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);*/

        for(String client:filaBanco){
            System.out.println("For: "+client);
        }

        Iterator<String> iteratorFilabanco = filaBanco.iterator();
        while (iteratorFilabanco.hasNext()){
            System.out.println("Iterator: "+iteratorFilabanco.next());
        }

        //Tamanho da fila
        System.out.println("Tamanho: "+filaBanco.size());

        System.out.println("Está em branco: "+filaBanco.isEmpty());
    }
}
