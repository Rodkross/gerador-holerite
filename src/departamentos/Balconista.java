package departamentos;

public class Balconista extends Pessoa {

    public Balconista(String nome, String empresa, Double salarioBase,
            int diasTrabalhados, int numeroDeFilhos, int numeroDeFeriados, double descontoVale, double descontoConvenio,
            int descontoFaltas) {
        super(nome, empresa, salarioBase, diasTrabalhados, numeroDeFilhos, numeroDeFeriados,
                descontoVale, descontoConvenio, descontoFaltas);
    }

    public String mudarFuncao() {
        String funcaoModificada = "Balconista";
        return funcaoModificada;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nNome: " + this.getNome());
        System.out.println("Empresa: " + this.getEmpresa());
        System.out.println("Função: " + this.mudarFuncao());
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
        System.out.printf("\nAdiantamento R$%.2f", this.getAdiantamento());
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("\nVencimentos ..................R$%.2f", calcularVencimentos());
        System.out.printf("\nDescontos ....................R$%.2f", calcularDescontos());
        System.out.printf("\n");
        System.out.println("\n-----------------------------------");
        System.out.printf("Salário Líquido: R$%.2f ", this.calcularSalarioLiquido());
        System.out.println("\n-----------------------------------");
    }

}