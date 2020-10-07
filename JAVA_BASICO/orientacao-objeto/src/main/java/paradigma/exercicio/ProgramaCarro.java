package paradigma.exercicio;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setQtdPessoas(2);

        System.out.printf("Entrou %s pessoas no carro",carro.qtdPessoas);
        System.out.printf("\nO carro está com %s pessoas", carro.getQtdPessoas());

        carro.setQtdPessoas(1);
        System.out.printf("\nSaiu %s pessoa no carro",carro.getQtdPessoas());
        System.out.printf("\nO carro está com %s pessoa(s)", carro.getQtdPessoas());
    }
}
