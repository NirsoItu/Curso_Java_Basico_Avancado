package construtores.exercicio;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Yaris", 2019);
        carro.setVariante("Corolla");

        System.out.printf("Meu carro é um %s da marca %s do ano de %s com a variante do %s",
                carro.getModelo(),carro.getMarca(),carro.getAno(), carro.getVariante());
    }
}
