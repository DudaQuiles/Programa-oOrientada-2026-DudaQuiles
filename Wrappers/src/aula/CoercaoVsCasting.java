package aula;

public class CoercaoVsCasting {
    public static void main (String [] args){
        public class CoercaoVsCasting {
            public static void main(String[] args) {
                long populacaoCidade = 1_500_000; // (1)
                int votosApurados = 1_499_999;
                long totalGeral = votosApurados; // (2)

                float mediaNotas = 8; // (3)
                double notaFinal = mediaNotas; // (4)

                double saldoConta = 2500.75;
                long saldoEmCentavosAproximado = (long) (saldoConta * 100); // (5)

                int quantidadeItens = 10;
                float precoUnitario = 3.5f;
                float totalCompra = quantidadeItens * precoUnitario; // (6)

                double mediaFinal = 7.8;
                int mediaParaAprovacao = (int) mediaFinal; // (7)
                
                20 System.out.println("populacaoCidade = " + populacaoCidade);
                21 System.out.println("totalGeral = " + totalGeral);
                22 System.out.println("notaFinal = " + notaFinal);
                23 System.out.println("saldoEmCentavosAproximado = " + saldoEmCentavosAproximado);
                24 System.out.println("totalCompra = " + totalCompra);
                25 System.out.println("mediaParaAprovacao = " + mediaParaAprovacao);
                26 }
27 }
    }
}
