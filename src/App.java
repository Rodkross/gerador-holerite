import departamentos.Balconista;
import departamentos.Entregador;
import departamentos.OperadoraCaixa;

public class App {
    public static void main(String[] args) throws Exception {

        Balconista balconista1 = new Balconista("João Alcebiades Benevides Da Silva", "Drogaria Nossa Farma ltda",
                1719.00,
                30, 1, 2, 20, 150,1, true, true);

        OperadoraCaixa operadorCaixa1 = new OperadoraCaixa("Elizandra Muniz",
                "Drogaria Nossa Farma ltda", 1719.00,
                30, 0, 1, 0, 0, 0, true, true, 125.00);

        Entregador entregador1 = new Entregador("Caio Martins Alves", "Drogaria Nossa Farma ltda",
                1719.00,
                30, 0, 3, 45, 125,1, true, false);   

        balconista1.exibirInformacoes();
        System.out.println("\n");
        operadorCaixa1.exibirInformacoes();
        System.out.println("\n");
        entregador1.exibirInformacoes();

    }

}