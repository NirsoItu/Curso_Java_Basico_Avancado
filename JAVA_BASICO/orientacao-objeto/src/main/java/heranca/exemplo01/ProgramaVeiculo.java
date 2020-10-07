package heranca.exemplo01;

public class ProgramaVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setQuantidadeDePortas(4);

        System.out.printf("Meu carro é um %s da marca %s com %s portas",
                carro.getModelo(), carro.getMarca(), carro.getQuantidadeDePortas());
        carro.acelera();

        System.out.println("\n");

        Motocicleta moto = new Motocicleta();
        moto.setMarca("Honda");
        moto.setModelo("XRE");
        moto.setCilindradas("2500CC");

        System.out.printf("Minha moto é uma %s da marca %s com %s cilindradas",
                moto.getModelo(), moto.getMarca(), moto.getCilindradas());
        moto.acelera();
    }
}
