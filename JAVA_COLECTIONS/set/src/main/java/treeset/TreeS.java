package treeset;

import java.util.TreeSet;
// Ao ordenar a lista, causa baixa performance

public class TreeS {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna o primeiro elemento da arvore
        System.out.println(treeCapitais.first());

        //Retorna o ultimo elemento da arvore
        System.out.println(treeCapitais.last());

        //Retorna o elemento que está abaixo do parâmentro passado
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna o elemento que está acima do parâmentro passado
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Retorna o primeiro elemento da árvore e remove
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais);

        //Retorna o último elemento da árvore e remove
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais);




    }
}
