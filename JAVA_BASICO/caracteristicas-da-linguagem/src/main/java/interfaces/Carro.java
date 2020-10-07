package interfaces;

public interface Carro extends Automovel{ // Interface pode também extender outra interface

    String marca();
    Double valor();

    default void ligar() {
        System.out.println("Ligando o carro...");
    }

    default String codRenavan() {
        return "333333ASDF";
    }
}
