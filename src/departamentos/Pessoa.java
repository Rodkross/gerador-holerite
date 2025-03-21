package departamentos;

class Pessoa {
    // atributos
    // vencimentos
    private String nome;
    private String empresa;
    private String funcao;
    private double salarioBase;
    private int diasTrabalhados;
    private int numeroDeFilhos;
    private int numeroDeFeriados;
    private double feriado;
    private double tetoSalarioFamilia;
    // descontos
    private double descontoVale;
    private double descontoINSS;
    private double descontoConvenio;
    private int numeroFaltas;
    private boolean adiantamento;
    private double adiantamentoValor;

    // construtor
    public Pessoa(String nome, String empresa, double salarioBase,
            int diasTrabalhados, int numeroDeFilhos, int numeroDeFeriados, double descontoVale, double descontoConvenio,
            int numeroFaltas, boolean adiantamento) {
        this.nome = nome;
        this.empresa = empresa;
        this.salarioBase = salarioBase;
        this.diasTrabalhados = diasTrabalhados;
        this.numeroDeFilhos = numeroDeFilhos;
        this.numeroDeFeriados = numeroDeFeriados;
        this.feriado = calcularFeriado();
        this.tetoSalarioFamilia = 1904.06;
        this.descontoVale = descontoVale;
        this.descontoConvenio = descontoConvenio;
        this.numeroFaltas = numeroFaltas;
        this.adiantamento = adiantamento;
        this.adiantamentoValor = 0;

    }

    // getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getFeriado() {
        return feriado;
    }

    public void setFeriado(double feriado) {
        this.feriado = feriado;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    public void setNumeroDeFilhos(int numeroDeFilhos) {
        this.numeroDeFilhos = numeroDeFilhos;
    }

    public int getNumeroDeFeriados() {
        return numeroDeFeriados;
    }

    public void setNumeroDeFeriados(int numeroDeFeriados) {
        this.numeroDeFeriados = numeroDeFeriados;
    }

    public double getDescontoVale() {
        return descontoVale;
    }

    public void setDescontoVale(double descontoVale) {
        this.descontoVale = descontoVale;
    }

    public double getDescontoINSS() {
        return descontoINSS;
    }

    public void setDescontoINSS(double descontoINSS) {
        this.descontoINSS = descontoINSS;
    }

    public double getDescontoConvenio() {
        return descontoConvenio;
    }

    public void setDescontoConvenio(double descontoConvenio) {
        this.descontoConvenio = descontoConvenio;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getTetoSalarioFamilia() {
        return tetoSalarioFamilia;
    }

    public void setTetoSalarioFamilia(double tetoSalarioFamilia) {
        this.tetoSalarioFamilia = 1904.06;
    }

    boolean getAdiantamento() {
        return this.adiantamento;
    }

    public void setAdiantamento(boolean adiantamento) {
        this.adiantamento = adiantamento;
    }

    double getAdiantamentoValor() {
        return adiantamentoValor;
    }

    // metodos

    // método para calcular valor dias trabalhados
    public double calcularDiasTrabalhados() {
        double diasTrabalhadosValor = this.getSalarioBase() / 30 * this.getDiasTrabalhados();
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
        double feriadoValor = this.getSalarioBase() / 30 * this.getNumeroDeFeriados() * 2;
        return feriadoValor;
    }

    public double calcularINSS() {
        double inssValor = this.calcularDiasTrabalhados() * 0.08;
        return inssValor;
    }

    public double calcularFaltas() {
        double faltasValor = this.getSalarioBase() / 30 * this.getNumeroFaltas();
        return faltasValor;
    }

    public double calcularVencimentos() {
        double vencimentosValor = this.calcularDiasTrabalhados() + this.calcularSalarioFamilia()
                + this.calcularFeriado();
        return vencimentosValor;
    }

    public double calcularDescontos() {
        double descontosValor = this.getDescontoVale() + this.calcularINSS() + this.getDescontoConvenio()
                + this.calcularFaltas() + this.getAdiantamentoValor();
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
            adiantamentoValor = salarioBase * 40 / 100;
            return adiantamentoValor;
        }
        return 0.00;
    }

    // metodo das informacoes
    public void exibirInformacoes() {
        System.out.println("\nNome: " + this.getNome());
        System.out.println("Empresa: " + this.getEmpresa());
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
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("\nVencimentos ..................R$%.2f", calcularVencimentos());
        System.out.printf("\nDescontos ....................R$%.2f", calcularDescontos());
        System.out.println("\n--------------------------------------");
        System.out.printf("Salário Líquido: R$%.2f ", this.calcularSalarioLiquido());
        System.out.println("\n--------------------------------------");

    }

}