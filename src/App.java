import departamentos.Balconista;

public class App {
    public static void main(String[] args) throws Exception {
        // nome - empresa - salario base - salario familia - dias trabalhados - n filhos - n feriados (vencimentos)
        // desconto vale - desconto INSS - desconto convenio - numero faltas
        Balconista balconista1 = new Balconista("João Alcebiades Benevides Da Silva", "Drogaria Nossa Farma ltda", 1643.23, 65.00,
                30, 0, 1,20,150,1);

        
        balconista1.exibirInformacoes();
        

    }

}