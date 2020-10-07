package operadores;

public class Incremento {
    public static void main(String[] args) {
        var numero = 1;

        System.out.printf("Primeiro eu incremento e depois avalio a expressão %s \n",++numero);

        var variavel = 10;

        System.out.printf("Primeiro eu avalio a expressão e depois incremento %s",variavel++);
        System.out.println("\n"+variavel);
    }
}
