package Aula.Heranca;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        ArrayList<Animal> bichinhos = new ArrayList<>();

        Pato p = new Pato();
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        bichinhos.add(p);
        bichinhos.add(c);
        bichinhos.add(g);



        //processamento polimorfico
        for(Animal a : bichinhos){
            a.emitirSom();
        }

        Radio r = new Radio();
        ArrayList<Sonoro> barulhentos = new ArrayList<>();
        barulhentos.add(r);
        barulhentos.add(p);
        barulhentos.add(c);
        barulhentos.add(g);

        System.out.println("-".repeat(20));

        for(Sonoro s : barulhentos){
            s.emitirSom();
        }
    }

}
