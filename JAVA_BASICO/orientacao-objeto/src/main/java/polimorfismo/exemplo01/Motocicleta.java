package polimorfismo.exemplo01;

public class Motocicleta extends Veiculo{

    public Double calculaImposto(){
        return this.getValorVenal() * 0.03;
    }
}
