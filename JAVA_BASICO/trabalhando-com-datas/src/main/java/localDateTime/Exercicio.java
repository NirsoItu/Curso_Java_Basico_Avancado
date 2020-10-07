package localDateTime;

import jdk.vm.ci.meta.Local;

import java.time.LocalDateTime;

public class Exercicio {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        LocalDateTime data = agora.plusYears(4).plusMonths(6).plusDays(13);

        System.out.println(data);
    }
}
