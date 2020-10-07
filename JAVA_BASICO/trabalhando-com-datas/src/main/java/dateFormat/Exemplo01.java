package dateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo01 {
    public static void main(String[] args) {
        Date agora = new Date(400215600000L);

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
    }
}
