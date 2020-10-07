import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercicio {
    public static void main(String[] args) {
        Map<String, String> estados = new HashMap<>();

        //Adiciopnar os 26 estados
        estados.put("AC","Acre");
        estados.put("AL","Alagoas");
        estados.put("AP","Amapá");
        estados.put("AM","Amazonas");
        estados.put("BA","Bahia");
        estados.put("CE","Ceará");
        estados.put("DF","Distrito Federal");
        estados.put("ES","Espiríto Santo");
        estados.put("GO","Goiás");
        estados.put("MA","Maranhão");
        estados.put("MT","Mato Grosso");
        estados.put("MS","Mato Grosso do Sul");
        estados.put("MG","Minas Gerais");
        estados.put("PA","Pará");
        estados.put("PB","Paraíba");
        estados.put("PE","Pernambuco");
        estados.put("PI","Piauí");
        estados.put("RJ","Rio de Janeiro");
        estados.put("RN","Rio Grande do Norte");
        estados.put("RS","Rio Grande do Sul");
        estados.put("RO","Rondônia");
        estados.put("RR","Roraima");
        estados.put("SC","Santa Catarina");
        estados.put("SP","São Paulo");
        estados.put("SE","Sergipe");
        estados.put("TO","Tocantins");

        //Remover o estado de Minas Gerais
        System.out.println(estados.remove("MG"));
        System.out.println(estados);

        //Verificar o tamanho do Map
        System.out.println(estados.size());

        //Remover o estado de Mato Grosso do Sul usando o seu nome
        System.out.println(estados.remove("MS","Mato Grosso do Sul"));
        System.out.println(estados);

        Iterator<String> iterator = estados.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(estados.get(key)+" -- "+key);
        }

        System.out.println(estados.containsValue("Maranhão"));


    }
}
