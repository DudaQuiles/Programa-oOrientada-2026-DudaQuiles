package Aula.Entidades;

public class Teste {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        String nome = "Duda Quiles";
        p1.alterarNome("Duda Quiles");
        p1.alterarIdade(20);


        System.out.println(p1.qualSeuNome());
        System.out.println(p1.qualSuaIdade());
        System.out.println(p1.qualUltimoNome());
    }
}
