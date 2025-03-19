public class Balconista extends Pessoa {

    public Balconista(String nome, String empresa, Double salarioBase, double salarioFamilia,
            int diasTrabalhados, int numeroDeFilhos, int numeroDeFeriados) {
        super(nome, empresa, salarioBase, salarioFamilia, diasTrabalhados, numeroDeFilhos, numeroDeFeriados);
    }

    @Override
    public double calcularSalarioLiquido() {
        double diasTrabalhadosValor = this.calcularDiasTrabalhados();
        double salarioFamiliaValor = this.calcularSalarioFamilia();
        double feriadoValor = this.calcularFeriado();

        double salarioLiquidoValor = diasTrabalhadosValor + salarioFamiliaValor + feriadoValor;
        return salarioLiquidoValor;
    }

    @Override
    public double calcularDiasTrabalhados() {
        return (this.getSalarioBase() / 30) * this.getDiasTrabalhados();
    }

    @Override
    public double calcularSalarioFamilia() {
        return this.getSalarioFamilia() * this.getNumeroDeFilhos();
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}