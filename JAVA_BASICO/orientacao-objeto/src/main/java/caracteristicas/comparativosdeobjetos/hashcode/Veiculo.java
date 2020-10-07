package caracteristicas.comparativosdeobjetos.hashcode;

import java.util.Objects;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    // Simplificando a comparação
    @Override
    public int hashCode(){
        return Objects.hash(modelo, marca);
    }
}
