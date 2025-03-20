import departamentos.Balconista;
import departamentos.OperadoraCaixa;

public class App {
    public static void main(String[] args) throws Exception {
        // nome - empresa - salario base - salario familia - dias trabalhados - n filhos
        // - n feriados (vencimentos)
        // desconto vale - desconto INSS - desconto convenio - numero faltas
        Balconista balconista1 = new Balconista("João Alcebiades Benevides Da Silva", "Drogaria Nossa Farma ltda",
                1643.23,
                30, 1, 0, 20, 150, 0);

        OperadoraCaixa operadorCaixa1 = new OperadoraCaixa("Elizandra Muniz",
                "Drogaria Nossa Farma ltda", 1643.23,
                30, 1, 0, 0, 0, 0);

        balconista1.exibirInformacoes();
        System.out.println("\n");
        operadorCaixa1.exibirInformacoes();

    }

}