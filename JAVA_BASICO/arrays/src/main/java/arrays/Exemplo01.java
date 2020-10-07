package arrays;

public class Exemplo01 {
    public static void main(String[] args) {

        int[] meuArray1 = new int[6];
        int[] meuArray2 = {11,55,44,88,77,66,99};

        System.out.println(meuArray1[0]);
        System.out.println(meuArray2[6]);

        // Alterando valor do array 2
        meuArray2[5] = 65;
        System.out.println(meuArray2[5]);


        // Tamanho dos arrays
        System.out.println(meuArray1.length);
        System.out.println(meuArray2.length);
    }
}
