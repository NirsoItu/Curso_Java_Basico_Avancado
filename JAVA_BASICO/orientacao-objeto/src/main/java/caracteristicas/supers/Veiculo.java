package caracteristicas.supers;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private Double valorVenal;

    public Veiculo (String marca, String modelo, Double valorVenal){
        this.marca = marca;
        this.modelo = modelo;
        this.valorVenal = valorVenal;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getValorVenal() {
        return valorVenal;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorVenal(Double valorVenal) {
        this.valorVenal = valorVenal;
    }
}
