package arrays;

public class Exemplo02 {
    public static void main(String[] args) {
        int[][] meuArray = {{63,95,74}, {35,24,16}};

        for(int i = 0; i < meuArray.length; i++){
            for(int j = 0; j < meuArray[i].length; j++){
                System.out.println(meuArray[i][j]);
            }
        }
    }
}
