package localDateTime;

import java.time.LocalDateTime;

public class Exemplo01 {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
        LocalDateTime ontem = dataHora.minusDays(1);
        LocalDateTime amanha = dataHora.plusDays(1);

        System.out.println("Data hora de hoje: "+dataHora);
        System.out.println("Data hora de ontem: "+ontem);
        System.out.println("Data hora de amanhã: "+amanha);
    }
}
