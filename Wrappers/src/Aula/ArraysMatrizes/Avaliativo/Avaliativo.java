package Aula.ArraysMatrizes.Avaliativo;

import java.util.Scanner;

public class Avaliativo {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int m = teclado.nextInt();
        int array[] = new int[100];

        int atual = 1;
        int resultado = 0;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < m ; j++){
                array[j] = atual;
                atual += i;
            }

            for(int k = 0; k < m; k++){
                for (int l = 0; l < m; l++){
                    if(array[k] == array[l]){
                        break;

                    }
                }

                if(k == m-1){
                    if(array[k] == 13) {
                        resultado = array[k];
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println("M: " + resultado);
    }
}

