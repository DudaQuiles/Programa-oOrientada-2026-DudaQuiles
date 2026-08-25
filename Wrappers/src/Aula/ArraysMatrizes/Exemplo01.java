package Aula.ArraysMatrizes;

import java.util.Arrays;

public class Exemplo01 {
    public static void main (String [] args) {
        //Tipo [] nome = new tipo [tamanho]
        boolean [] sensores = new boolean[5];

        //4 posição para true
        sensores[3] = true;

        //For(início; condição de parada; passo)
        //sensores.lenght = é uma propriedade que retorna o número total de elementos armazenados em um array chamado
                /*false
                false
                false
                true
                false*/
                for(int i = 0; i < sensores.length; i++){
                    System.out.println(sensores[i]);
                }
                    //for enchanced
                    //for (tipo variavel : array)
                    //sensor == sensores[i]
                    /*false
                    false
                    false
                    true
                    false*/
                    for(boolean sensor : sensores) { //O sensor só vai existir dentro do for
                        System.out.println(sensor);
                    }

                System.out.println(Arrays.toString(sensores));
                //Printa os valores da forma [false, false, false, true, false]
    }
}
