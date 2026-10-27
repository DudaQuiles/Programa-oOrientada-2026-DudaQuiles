package Aula.Heranca;

public class Gato extends Animal{

    public Gato(String nome, double peso){
        super(nome,peso);
    }

    public Gato(){
        super("Annie", 2.0);
    }

    public void emitirSom(){
        System.out.println("Miau miau!");
    }
}

