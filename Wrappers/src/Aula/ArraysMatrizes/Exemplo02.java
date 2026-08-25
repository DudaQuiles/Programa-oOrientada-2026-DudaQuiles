package Aula.ArraysMatrizes;

public class Exemplo02 {
    public static void main(String [] args){
        //int [][] valores = new int[3][3];
        int [][] valores = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        //Valores[lin].length = valores na posição das linhas 1, 2 e 3
        for(int lin = 0; lin < valores.length; lin++){
            for(int col = 0; col < valores[lin].length; col++){
                System.out.print(valores[lin][col] + " ");
            }
            System.out.println();
        }
    }
}
