package caracteristicas.comparativosdeobjetos.equals;

public class Veiculo {
    private String modelo;
    private  String marca;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Falando para o Java que os 2 objetos são iguais (Comparação codigo enorme)
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }

        Veiculo comparavel;
        if(obj instanceof Veiculo){
            comparavel = (Veiculo)obj;
        } else {
            return false;
        }
        if(comparavel.marca == this.marca && comparavel.modelo == this.modelo){
            return true;
        }
        return false;
    }
}
