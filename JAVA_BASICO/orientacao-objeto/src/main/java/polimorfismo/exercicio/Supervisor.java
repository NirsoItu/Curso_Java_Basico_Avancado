package polimorfismo.exercicio;

public class Supervisor extends  Funcionarios{
    public Double calculaImposto(){
        return this.getSalario() * 0.05;
    }
}
