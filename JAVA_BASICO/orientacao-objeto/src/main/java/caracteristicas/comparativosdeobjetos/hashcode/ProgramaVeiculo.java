package caracteristicas.comparativosdeobjetos.hashcode;

import caracteristicas.comparativosdeobjetos.equals.Veiculo;

public class ProgramaVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Toyota", "Corolla");
        Veiculo veiculo2 = new Veiculo("Toyota", "Corolla");

        System.out.println(veiculo1.equals(veiculo2));
    }
}
