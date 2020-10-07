package debugando.imc;

import debugando.pessoa.Pessoa;

public class CalculadorDeImc {

    public Double calcula(final Pessoa pessoa){
        final Double altura = pessoa.getAltura();
        final Double imc = pessoa.getPeso() / (altura * altura);
        return imc;
    }
}
