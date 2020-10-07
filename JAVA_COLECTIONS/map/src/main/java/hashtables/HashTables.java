package hashtables;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTables {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos",21);
        estudantes.put("Mariana",33);
        estudantes.put("Rafaela",18);
        estudantes.put("Pedro",44);

        System.out.println(estudantes);

        //Excluir registro
        estudantes.remove("Pedro");
        System.out.println(estudantes);

        //Retorna a idade pelo parametro
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);

        //Retorna o tamanho do Hash Table
        System.out.println(estudantes.size());

        //Navegar pelo registros
        Iterator<String> iterator = estudantes.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+ " -> "+ estudantes.get(key));
        }

        for(Map.Entry<String, Integer>entry : estudantes.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }

        for(String key: estudantes.keySet()){
            System.out.println(key+" ---> "+estudantes.get(key));
        }
    }
}
