package optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivo {
    public static void main(String[] args) {

        System.out.println(" -- Valor Inteiro Opcional --");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println(" -- Valor Double Opcional --");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println(" -- Valor Longo Opcional --");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
