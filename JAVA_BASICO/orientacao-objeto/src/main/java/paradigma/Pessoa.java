package paradigma;

public class Pessoa {
    private String nome = "Rogerio";

    public String getNome() {
        return nome;
    }

    public String falarMeuNome(){
        return "Olá ! Meu nome é "+getNome();
    }
}
