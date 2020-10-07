package strings;

public class StringFormat {
    public static void main(String[] args) {

        var nome = "Rogério";
        var sobreNome = "Ferreira da Silva";
        final var nomeCompleto = nome + " "+sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente: "+nome);
        System.out.println("Nome completo do cliente: "+nomeCompleto);

        final var mensagem = String.format("O cliente %s possui o sobrenome %s",nome, sobreNome);

        System.out.println(mensagem);

        System.out.println(String.format("Numero %.2f",1245d));
    }
}
