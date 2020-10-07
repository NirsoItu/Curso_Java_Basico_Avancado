package caracteristicas.comparativosdeobjetos.equals;

public class ProgramaVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Toyota", "Corolla");
        Veiculo veiculo2 = new Veiculo("Toyota", "Corolla");

        System.out.println(veiculo1.equals(veiculo2));
    }
}
