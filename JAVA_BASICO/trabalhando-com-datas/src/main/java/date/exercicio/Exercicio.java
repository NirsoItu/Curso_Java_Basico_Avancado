package date.exercicio;

import java.util.Date;

public class Exercicio {
    public static void main(String[] args) {
        Date dataAniversario = new Date(400215600000L);
        Date dataSelecionada = new Date(1273892400000L);

        boolean isAfter = dataAniversario.after(dataSelecionada);
        boolean isBefore = dataAniversario.before(dataSelecionada);

        if(isAfter){
            System.out.printf("Meu aniversário %s é posterior a data %s",dataAniversario.toInstant(),dataSelecionada.toInstant());
        } else {
            System.out.printf("Meu aniversário %s é anterior a data %s",dataAniversario.toInstant(),dataSelecionada.toInstant());
        }
    }
}
