package interfaces;

public class Fiesta implements Carro, Veiculo {
    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public Double valor() {
        return null;
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }

    @Override
    public String registro() {
        return "TUUA78415";
    }
}
