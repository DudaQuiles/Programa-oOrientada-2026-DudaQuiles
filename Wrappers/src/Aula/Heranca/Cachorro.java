package Aula.Heranca;

public class Cachorro extends Animal{

    public Cachorro(String nome, double peso){
        super(nome,peso);
    }

    public Cachorro(){
        super("Bidu", 3.0);
    }

    public void emitirSom(){
        System.out.println("Au au!");
    }
}

