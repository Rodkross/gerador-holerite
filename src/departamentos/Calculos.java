package departamentos;

public class Calculos extends Pessoa {

    public Calculos(String nome, int diasTrabalhados, int numeroDeFilhos, int numeroDeFeriados,
    double descontoVale, double descontoConvenio,
    int descontoFaltas, boolean adiantamento, boolean valeTransporte) {
        super(nome, diasTrabalhados, numeroDeFilhos, numeroDeFeriados, descontoVale, descontoConvenio, descontoFaltas, adiantamento, valeTransporte);
    }
    
    double calcularSalarioBase() {
        double salarioBase = this.getSalarioBase();
        if (exibirFuncao() == "Balconista" || exibirFuncao() == "Operadora de Caixa"
                || exibirFuncao() == "Entregador") {
            salarioBase = 1719.00;
        }
        return salarioBase;
    }

    // método para calcular valor dias trabalhados
    public double calcularDiasTrabalhados() {
        double diasTrabalhadosValor = this.calcularSalarioBase() / 30 * this.getDiasTrabalhados();
        return diasTrabalhadosValor;
    }

    // metodo pra calcular o salario familia
    public double calcularSalarioFamilia() {
        if (this.calcularSalarioContribuicao() < this.getTetoSalarioFamilia()) {
            double salarioFamiliaValor = 65.00 / 30 * this.getDiasTrabalhados() * this.getNumeroDeFilhos();
            return salarioFamiliaValor;
        }
        return 0;

    }

    // método para calcular o feriado
    double calcularFeriado() {
        double feriadoValor = this.calcularSalarioBase() / 30 * this.getNumeroDeFeriados() * 2;
        return feriadoValor;
    }


    public double calcularINSS() {
        double inssValor = this.calcularDiasTrabalhados() * 0.08;
        return inssValor;
    }

    public double calcularFaltas() {
        double faltasValor = this.calcularSalarioBase() / 30 * this.getNumeroFaltas();
        return faltasValor;
    }

    public double calcularVencimentos() {
        double vencimentosValor = this.calcularDiasTrabalhados() + this.calcularSalarioFamilia()
                + this.calcularFeriado();
        return vencimentosValor;
    }

    public double calcularDescontos() {
        double descontosValor = this.getDescontoVale() + this.calcularINSS() + this.getDescontoConvenio()
                + this.calcularFaltas() + this.getAdiantamentoValor() + this.calcularValorValeTransporte();
        return descontosValor;
    }

    public double calcularSalarioContribuicao() {
        double salarioContribuicaoValor = this.calcularDiasTrabalhados() + this.getFeriado();
        return salarioContribuicaoValor;
    }

    public double calcularSalarioLiquido() {
        double salarioLiquido = calcularVencimentos() - calcularDescontos();
        return salarioLiquido;
    }

    public double calcularAdiantamento() {
        if (this.getAdiantamento() == true) {
            double adiantamentoValor = this.calcularSalarioBase() * 40 / 100;
            return adiantamentoValor;
        }
        return 0.00;
    }

    public double calcularValorValeTransporte() {
        if (this.getValeTransporte() == true) {
            double valorValeTransporte = this.calcularDiasTrabalhados() * 0.06;
            return valorValeTransporte;
        }
        return 0.00;
    }

    public String exibirFuncao() {
        String funcaoModificada = "Função";
        return funcaoModificada;
    }

    public void exibirInformacoes() {
        System.out.println("\nNome: " + this.getNome());
        System.out.printf("Empresa: %s CNPJ: %s\n",this.getNomeEmpresa(), this.getCnpj());
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
