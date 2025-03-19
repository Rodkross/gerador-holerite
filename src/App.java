public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //nome - empresa - salario base - salario familia - feriado - dias trabalhados - n filhos - n feriados - 
        Balconista balconista1 = new Balconista("Mariana Silveira", "Farmacia Central da Tunisia Ltda", 1643.23, 65.00, 1, 30, 1, 1);

        balconista1.exibirInformacoes();

    }

}