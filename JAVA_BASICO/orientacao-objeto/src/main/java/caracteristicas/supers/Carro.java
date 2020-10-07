package caracteristicas.supers;

public class Carro extends Veiculo {

    private int qtdDePortas;

    public Carro(String marca, String modelo, Double valorVenal){
        super(marca, modelo, valorVenal);
    }

    public Carro(String marca, String modelo, Double valorVenal, int qtdDePortas){
        super(marca, modelo, valorVenal);
        this.qtdDePortas = qtdDePortas;
    }

    public int getQtdDePortas() {
        return qtdDePortas;
    }

    public void setQtdDePortas(int qtdDePortas) {
        this.qtdDePortas = qtdDePortas;
    }

    public Double calculaImposto(){
        return this.getValorVenal() * 0.07;
    }


}
