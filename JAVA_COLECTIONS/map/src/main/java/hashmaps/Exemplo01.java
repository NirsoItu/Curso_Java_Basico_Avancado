package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Exemplo01 {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        campeoesMundiaisFifa.put("Brasil",5);
        campeoesMundiaisFifa.put("Alemanha",4);
        campeoesMundiaisFifa.put("Italia",4);
        campeoesMundiaisFifa.put("Uruguai",2);
        campeoesMundiaisFifa.put("Argentina",2);
        campeoesMundiaisFifa.put("França",2);
        campeoesMundiaisFifa.put("Inglaterra",1);
        campeoesMundiaisFifa.put("Espanha",1);

        System.out.println(campeoesMundiaisFifa);

        // Atualizar dados
        campeoesMundiaisFifa.put("Brasil",6);
        System.out.println(campeoesMundiaisFifa);

        //Retorna o dado da Argentina
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        //Retorna se existe ou não a França
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        //Retorna se existe um hexacampeão
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        //Remove o campeão França
        System.out.println(campeoesMundiaisFifa.remove("França"));
        System.out.println(campeoesMundiaisFifa);

        //Tamanho do mapa
        System.out.println(campeoesMundiaisFifa.size());

        //Navega nos registros do map
        for(Map.Entry<String, Integer>entry: campeoesMundiaisFifa.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }

        //Navega nos registros do map (MENOS PERFORMATICO)
        for(String key: campeoesMundiaisFifa.keySet()){
            System.out.println(key+" -- "+campeoesMundiaisFifa.get(key));
        }

        //Verifica se contem a chave Estados Unidos
        System.out.println(campeoesMundiaisFifa.containsKey("Estados Unidos"));

        //Verifica se contem o valor 5
        System.out.println(campeoesMundiaisFifa.containsValue(5));

        //Tamanho do map
        System.out.println(campeoesMundiaisFifa.size());

        //Limpa o map
        campeoesMundiaisFifa.clear();
        System.out.println(campeoesMundiaisFifa.size());















    }
}
