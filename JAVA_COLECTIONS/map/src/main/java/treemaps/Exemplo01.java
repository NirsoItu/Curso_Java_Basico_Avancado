package treemaps;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Exemplo01 {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("SC","Florianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","São Paulo");
        treeCapitais.put("RJ","Rio de Janeiro");
        treeCapitais.put("MG","Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna o primeiro elemento do map
        System.out.println(treeCapitais.firstKey());

        //Retorna o ultimo elemento do mape
        System.out.println(treeCapitais.lastKey());

        //Retorna o elemento que está abaixo do parâmentro passado
        System.out.println("Chave abaixo de SC: "+treeCapitais.lowerKey("SC"));

        //Retorna o elemento que está acima do parâmentro passado
        System.out.println("Chave acima de SC: "+treeCapitais.higherKey("SC"));

        //Retorna o primeiro elemento da árvore e remove
        System.out.println(treeCapitais.firstEntry().getKey()+" -- "+ treeCapitais.firstEntry().getValue());
        System.out.println(treeCapitais);

        //Retorna o último elemento da árvore e remove
        System.out.println(treeCapitais.lastEntry().getKey()+ " -- "+treeCapitais.lastEntry().getValue());
        System.out.println(treeCapitais);

        //Retorna o primeiro elemento do map e remove
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        System.out.println(firstEntry);

        //Retorna o ultimo elemento do map e remove
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
        System.out.println(lastEntry);

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " -> "+treeCapitais.get(key));
        }

        for(String capital: treeCapitais.keySet()){
            System.out.println(capital + "--> "+treeCapitais.get(capital));
        }

        for(Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey()+" ---> "+capital.getValue());
        }

    }
}
