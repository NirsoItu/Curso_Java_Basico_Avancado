package polimorfismo.exemplo01;

public class Carro extends Veiculo {

    public Double calculaImposto(){
        return this.getValorVenal() * 0.07;
    }
}
