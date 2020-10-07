package debugando;

import debugando.imc.CalculadorDeImc;
import debugando.pessoa.Pessoa;

public class Programa {
    public static void main(String[] args) {

        final Pessoa pessoa = new Pessoa("Rogério", 1.68, 72.0);

        final CalculadorDeImc calculadorDeImc = new CalculadorDeImc();
        final Double imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("Nome: %s - IMC = %.2f", pessoa.getNome(), imc);
    }
}
