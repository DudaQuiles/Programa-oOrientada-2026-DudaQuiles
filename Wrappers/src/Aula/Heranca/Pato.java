package Aula.Heranca;

public class Pato extends Animal{

    public Pato(String nome, double peso){
        super(nome,peso);
    }

    public Pato(){
        super("Patolino", 2.0);
    }

    public void emitirSom(){
        System.out.println("Quacks quacks!");
    }
}

