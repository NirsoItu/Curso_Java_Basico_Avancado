package classes.cliente;

import classes.pessoa.PessoaFisica;

public class ProgramaCliente {
    public static void main(String[] args) {

        final var cliente = new Cliente(18);
        cliente.getIdade();

        cliente.getPeso();

        // System.out.println(cliente.relatorio); //Sem acesso porque não esta no mesmo pacote
    }
}
