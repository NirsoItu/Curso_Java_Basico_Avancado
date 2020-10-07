package polimorfismo.exercicio;

public class Atendente extends  Funcionarios {
    public Double calculaImposto(){
        return this.getSalario() * 0.01;
    }
}
