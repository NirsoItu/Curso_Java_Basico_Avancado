package streams.Exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaCarro {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Toyota", "Corolla", 2020));
        carros.add(new Carro("VW", "Golf", 2019));
        carros.add(new Carro("GM", "Camaro", 2018));
        carros.add(new Carro("Renault", "Kwid", 2019));
        carros.add(new Carro("Kia", "Ceratto", 2016));
        carros.add(new Carro("Audi", "A5", 2020));
        carros.add(new Carro("BMW", "X5", 2017));
        carros.add(new Carro("Ford", "Fusion", 2015));


        System.out.println("A - Transformar os atributos e objetos em String: "+
                carros.stream().map(carro ->
                        "\nMarca: "+carro.getMarca()
                                +" - Modelo: "+carro.getModelo()
                                +" - Ano: "+carro.getAno().toString()).collect(Collectors.toList()));

        System.out.println("B - Quantidade de veículos cadastrados: "+carros.stream().count());

        System.out.println("C - Carro com ano maior do que 2018: "+carros.stream().filter((carro)->
                carro.getAno()>2018).collect(Collectors.toList()));

        System.out.println("D - Exibir os elementos no console: ");

        System.out.println("Retornar os elementos: "+carros.stream()
                .map(carro -> carro.getMarca())
                .collect(Collectors.toList()));

        System.out.println("Retorne os carros que possuem a letra o"+
                carros.stream().filter(carro -> carro.getModelo().toString().contains("o")).collect(Collectors.toList()));


    }
}
