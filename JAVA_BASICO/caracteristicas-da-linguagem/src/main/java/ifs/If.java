package ifs;

public class If {
    public static void main(String[] args) {

         final var condicao = false;

         if(condicao){
             System.out.println("Condição verdadeira");
         } else {
             System.out.println("Condição verdadeira");
         }

         if(!condicao)
             System.out.println("Uma unica linha...");

         final var ternario = condicao ? "Verdadeiro" : "Falso";
        System.out.println(ternario);
    }
}
