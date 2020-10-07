package calendar.exemplos;

import java.util.Calendar;

public class Exemplo02 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: "+agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: "+agora.getTime());

        agora.add(Calendar.MONTH, +2);
        System.out.println("2 meses pra frente: "+agora.getTime());

        agora.add(Calendar.YEAR, +1);
        System.out.println("1 ano pra frente: "+agora.getTime());
    }
}
