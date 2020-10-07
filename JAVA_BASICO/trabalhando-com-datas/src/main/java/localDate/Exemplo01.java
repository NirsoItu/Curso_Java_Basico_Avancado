package localDate;

import java.time.LocalDate;

public class Exemplo01 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        LocalDate amanha = hoje.plusDays(1);

        System.out.println("Hoje: "+hoje);
        System.out.println("Ontem: "+ontem);
        System.out.println("Amanhã: "+amanha);
    }
}
