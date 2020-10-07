package localTime;

import java.time.LocalTime;

public class Exemplo01 {
    public static void main(String[] args) {
        LocalTime horarioAgora = LocalTime.now();

        LocalTime horarioMenosUm = horarioAgora.minusHours(1);

        System.out.println("Horário atual: "+horarioAgora);
        System.out.println("Horário menos um: "+horarioMenosUm);
    }
}
