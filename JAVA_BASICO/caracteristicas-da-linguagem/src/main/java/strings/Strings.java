package strings;

public class Strings {
    public static void main(String[] args) {

        var nome = "Rogério ";
        var sobreNome = "Ferreira da Silva";
        final var nomeCompleto = nome + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente: "+nome);
        System.out.println("Nome completo do cliente: "+nomeCompleto);

        var string = new String(" Minha String");
        System.out.println("Char na posição: "+string.charAt(5));
        System.out.println("Quantidade: "+string.length());
        System.out.println("Sem Trim: [" + string + "]");
        System.out.println("Com Trim: [" + string.trim() + "]");
        System.out.println("Lower: "+string.toLowerCase());
        System.out.println("Upper: "+string.toUpperCase());
        System.out.println("Contém M ? "+string.contains("M"));
        System.out.println("Contém X ? "+string.contains("X"));

        System.out.println("Trocar com Replace: "+string.replace("n", "$"));
        System.out.println("É igual ? "+string.equals("Minha String"));
        System.out.println("É igual, ignorando maiuscula e minuscula ?"+string.equalsIgnoreCase(" mInHa sTrInG"));
        System.out.println("Substring (1,6) "+string.substring(1,6));
    }

}
