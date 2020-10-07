package polimorfismo.exemplo01;

public class Veiculo {

    private Double valorVenal;

    public Double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(Double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public Double calculaImposto(){
        return this.valorVenal * 0.01;
    }


}
