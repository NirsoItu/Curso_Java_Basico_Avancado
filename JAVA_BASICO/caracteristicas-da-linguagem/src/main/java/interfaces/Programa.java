package interfaces;

import org.w3c.dom.ls.LSOutput;

public class Programa {
    public static void main(String[] args) {

        final Gol gol = new Gol();
        System.out.println("Marca do Gol: "+gol.marca());
        gol.ligar();
        System.out.println();

        final Trator trator = new Trator();
        System.out.println("Registro do trator nº "+trator.registro());
        trator.ligar();
        System.out.println();

        final Fiesta fiesta = new Fiesta();
        System.out.println("Marca do Fiesta: "+fiesta.marca());
        System.out.println("Marca do Fiesta: "+fiesta.registro());
        fiesta.ligar();

    }
}
