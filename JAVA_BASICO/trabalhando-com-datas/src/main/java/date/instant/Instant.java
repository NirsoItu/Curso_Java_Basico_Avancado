package date.instant;

import java.util.Date;

public class Instant {
    public static void main(String[] args) {
        Date dataInicio = new Date(1613124807691L);
        System.out.println(dataInicio);

        java.time.Instant instant = dataInicio.toInstant();
        System.out.println(instant);

    }
}
