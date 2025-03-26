package departamentos;

public class Entregador extends Pessoa {
    public Entregador(String nome, int diasTrabalhados, int numeroDeFilhos, int numeroDeFeriados,
            double descontoVale, double descontoConvenio,
            int descontoFaltas, boolean adiantamento, boolean valeTransporte) {
        super(nome, diasTrabalhados, numeroDeFilhos, numeroDeFeriados,
                descontoVale, descontoConvenio, descontoFaltas, adiantamento, valeTransporte);
    }

    public String exibirFuncao() {
        String funcaoModificada = "Entregador";
        return funcaoModificada;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nNome: " + this.getNome());
        System.out.println("Empresa: " + this.getNomeEmpresa());
        System.out.printf("Função: %s / Salário Base: R$%.2f", this.exibirFuncao(), this.calcularSalarioBase());
        System.out.printf("\n");
        System.out.printf("\nDias trabalhados: %.2f", this.calcularDiasTrabalhados());
        System.out.printf("\nSalário Família: %.2f", this.calcularSalarioFamilia());
        System.out.printf("\nFeriado: %.2f", this.calcularFeriado());
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("\nVales: %.2f", this.getDescontoVale()); // corrigir calculo
        System.out.printf("\nINSS: %.2f", this.calcularINSS());
        System.out.printf("\nConvênio funcionário: %.2f", getDescontoConvenio());
        System.out.printf("\nFaltas: %.2f", this.calcularFaltas());
        System.out.printf("\nAdiantamento %.2f", this.calcularAdiantamento());
        System.out.printf("\nVale transporte %.2f", this.calcularValorValeTransporte());
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("\nVencimentos ..................R$%.2f", calcularVencimentos());
        System.out.printf("\nDescontos ....................R$%.2f", calcularDescontos());
        System.out.println("\n--------------------------------------");
        System.out.printf("Salário Líquido: R$%.2f ", this.calcularSalarioLiquido());
        System.out.println("\n--------------------------------------");

    }

}
