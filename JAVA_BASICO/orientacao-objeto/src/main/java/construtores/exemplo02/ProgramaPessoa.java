package construtores.exemplo02;

import construtores.exemplo02.Pessoa;

public class ProgramaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Exemplo02");
        System.out.println(pessoa.getNome());
    }
}
