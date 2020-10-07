package polimorfismo.exemplo01;

public class ProgramaVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Motocicleta moto = new Motocicleta();
        Veiculo veic = new Veiculo();

        carro.setValorVenal(25000.00);
        moto.setValorVenal(25000.00);
        veic.setValorVenal(25000.00);

        System.out.printf("Valor do imposto do meu carro é: R$ %.2f", carro.calculaImposto());
        System.out.printf("\nValor do imposto da minha moto é: R$ %.2f", moto.calculaImposto());
        System.out.printf("\nValor do imposto do meu veículo é: R$ %.2f", veic.calculaImposto());
    }
}
