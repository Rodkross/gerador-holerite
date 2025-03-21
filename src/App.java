import departamentos.Balconista;
import departamentos.OperadoraCaixa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Balconista balconista1 = new Balconista("João Alcebiades Benevides Da Silva", "Drogaria Nossa Farma ltda",
                1719.00,
                30, 0, 0, 0, 0, 0, false);

        OperadoraCaixa operadorCaixa1 = new OperadoraCaixa("Elizandra Muniz",
                "Drogaria Nossa Farma ltda", 1719.00,
                30, 0, 1, 0, 0, 0, true);

        balconista1.exibirInformacoes();
        System.out.println("\n");
        operadorCaixa1.exibirInformacoes();

    }

}