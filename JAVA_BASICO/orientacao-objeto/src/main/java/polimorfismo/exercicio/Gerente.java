package polimorfismo.exercicio;

public class Gerente extends Funcionarios{

    public Double calculaImposto(){
        return this.getSalario() * 0.1;
    }
}
