package enums;

public class Programa {
    public static void main(String[] args) {
        // Acesso estatico

        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for(TipoVeiculo tipo: TipoVeiculo.values()){
            System.out.println("Tipo: "+tipo);
        }

        System.out.println("Codigo do status CLOSED: "+Status.CLOSE.getCod());
        System.out.println("Texto do status OPEN: "+Status.OPEN.getTexto());


    }
}
