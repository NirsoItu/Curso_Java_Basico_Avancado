package encapsulamento.exemplo01;

public class ProgramaPessoa {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Rogerio", 07,9,1982);

        System.out.printf("Meu nome é %s e tenho %s anos de idade", eu.getNome(), eu.calculaIdade());
    }
}
