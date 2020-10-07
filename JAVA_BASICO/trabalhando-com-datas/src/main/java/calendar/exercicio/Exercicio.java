package calendar.exercicio;

import java.util.Calendar;

public class Exercicio {
    public static void main(String[] args) {
        Calendar dataVencimento = Calendar.getInstance();
        Calendar agora = Calendar.getInstance();

        Integer diaDaSemana;

        dataVencimento.add(Calendar.DATE, -6);
        diaDaSemana = dataVencimento.get(Calendar.DAY_OF_WEEK);
        System.out.println(diaDaSemana);

        if(dataVencimento.before(agora)){
            System.out.println("Sua fatura está em atraso "+dataVencimento.getTime());
        } else {
            System.out.println("Sua fatura está em dia");
        }

        if(diaDaSemana == 0){
            System.out.printf("O dia escolhido foi %tD, um Domingo, então você poderá pagar na segunda-feira ", dataVencimento);
        } else if(diaDaSemana == 6){
            System.out.printf("O dia escolhido foi %tD, um Sábado, então você poderá pagar na segunda-feira ", dataVencimento);
        } else {
            System.out.println("Data de pagamento normal");
        }
    }
}
