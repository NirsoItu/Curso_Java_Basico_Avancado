package exemplos;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        // Adiciona valores a lista
        esportes.add("Futebol");
        esportes.add("Volei");
        esportes.add("Golf");
        esportes.add("Basquete");
        esportes.add("F1");

        // Altera o valor na lista
        esportes.set(2, "Atletismo");
        System.out.println(esportes);

        // Remove o esporte da posição 2
        esportes.remove(2);
        System.out.println(esportes);

        // Retorna um indice pre selecionado
        System.out.println(esportes.get(0));

        // Navegação dos itens
        for(String esporte: esportes){
            System.out.println("-> "+esporte);
        }

    }
}
