package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exemplo01 {
    public static void main(String[] args) {

        // Essa é a implementação mais performatica, a mais utilizada em produção
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        // Não garante a ordem
        System.out.println(notasAlunos);

        // Remove a nota
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        //Retorna a quantidade de notas
        System.out.println(notasAlunos.size());

        //Navega pelos elementos
        Iterator<Double> iteratorNotasAlunos = notasAlunos.iterator();
        while (iteratorNotasAlunos.hasNext()){
            System.out.println("Iterator -> "+iteratorNotasAlunos.next());
        }

        for(Double nota: notasAlunos){
            System.out.println("For --> "+nota);
        }

        notasAlunos.clear();
        System.out.println("Está vazia: "+notasAlunos.isEmpty());



    }
}
