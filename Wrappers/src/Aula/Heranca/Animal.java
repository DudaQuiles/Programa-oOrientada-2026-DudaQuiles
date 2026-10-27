package Aula.Heranca;

public class Animal implements Sonoro{

    private double peso;
    private String nome;


    public Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public Animal(){
        this("animal genérico",1.0);
    }

    @Override
   public void emitirSom(){
        System.out.println("aghr...");
   }

}
