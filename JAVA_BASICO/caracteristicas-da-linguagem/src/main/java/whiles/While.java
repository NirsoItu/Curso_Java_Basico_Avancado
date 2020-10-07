package whiles;

public class While {
    public static void main(String[] args) {

        var x = 0;

        // Testa a condição antes
        while (x < 1){
            System.out.println("Dentro do while");
        }

        var nome = "Rogerio";

        System.out.println(nome);

        var y = 0;
        do{
            System.out.println("Dentro do Do/While");
        }while(y++ <= 1);

    }
}
