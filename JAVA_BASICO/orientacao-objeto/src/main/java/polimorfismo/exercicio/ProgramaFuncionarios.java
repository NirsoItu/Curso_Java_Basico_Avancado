package polimorfismo.exercicio;

public class ProgramaFuncionarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Supervisor supervisor = new Supervisor();
        Atendente atendente = new Atendente();

        gerente.setSalario(12000.00);
        supervisor.setSalario(5000.00);
        atendente.setSalario(1500.00);

        System.out.printf("O gerente tem um salário de R$ %.2f e o imposto calculado é de R$ %.2f",
                gerente.getSalario(), gerente.calculaImposto());

        System.out.printf("\nO supervisor tem um salário de R$ %.2f e o imposto calculado é de R$ %.2f",
                supervisor.getSalario(), supervisor.calculaImposto());

        System.out.printf("\nO atendente tem um salário de R$ %.2f e o imposto calculado é de R$ %.2f",
                atendente.getSalario(), atendente.calculaImposto());
    }
}
