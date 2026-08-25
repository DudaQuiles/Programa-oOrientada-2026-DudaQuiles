package Aula;

public class CacheIntegeer {

    public static void main(String [] args) {
        //Par 1: dois valores IGUAIS dentro da faixa de -128 até 127 (ex. 100 e 100).
        Integer x1 = 127;
        Integer x2 = 127;

        // O == não compara os valores, mas sim os seus endereços para tipos não primitivos.
        System.out.println("Par dentro da faixa (== ): " + (x1 == x2));
        System.out.println("Par dentro da faixa (.equals()): " + x1.equals(x2));

        //Par 2: dois valores IGUAIS fora da faixa de -128 até 127 (ex. 200 e 200).
        Integer y1 = 128;
        Integer y2 = 128;

        System.out.println("Par fora da faixa (== ): " + (y1 == y2));
        System.out.println("Par fora da faixa (.equals()): " + y1.equals(y2));

    }
}
