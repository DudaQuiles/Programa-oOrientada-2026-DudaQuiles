package Aula.ConteudoProva;

public class TesteProduto {
    public static void main(String[] args){
        Produto p1 = new Produto();

        // Exercício público
        //p1.nome = ("Maria");
        //p1.preco = -50.0;

        // Exercício privado
        p1.nome = ("Maria");
        p1.setPreco(20.0);

        System.out.println(p1.nome);
        System.out.println(p1.getPreco());
    }
}
