package date.afterBefore;

import java.util.Date;

public class AfterBefore {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);
        Date datanoFuturo = new Date(1613124807691L);

        boolean isAfter = dataNoPassado.after(datanoFuturo);
        System.out.println(isAfter);

        boolean isBefore = dataNoPassado.before(datanoFuturo);
        System.out.println(isBefore);
    }
}
