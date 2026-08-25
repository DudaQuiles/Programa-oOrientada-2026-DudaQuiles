package Aula.ArraysMatrizes;

public class Inverte {
    public static void main(String [] args){
        int [] valores = {10, 20, 30, 40, 50};
        int tam = valores.length; //Essa etapa verifica quantos elementos eu tenho no meu array de valores

        for(int i = 1; i <= tam; i++){ //i <= tam = sem o = não printaria o último valor
            System.out.print(valores[tam - i] + " "); //[tam - i] = para que fique ao contrário
        }
    }
}
