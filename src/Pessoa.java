class Pessoa {
    // atributos
    private String nome;
    private String empresa;
    private double salarioBase;
    private double salarioFamilia;
    private int diasTrabalhados;
    private int numeroDeFilhos;
    private int numeroDeFeriados;
    private double feriado;
    private double totalLiquido; // Changed to double

    // construtor
    public Pessoa(String nome, String empresa, double salarioBase, double salarioFamilia,
            int diasTrabalhados, int numeroDeFilhos, int numeroDeFeriados) { // Removed totalLiquido from constructor
        this.nome = nome;
        this.empresa = empresa;
        this.salarioBase = salarioBase;
        this.salarioFamilia = salarioFamilia;
        this.diasTrabalhados = diasTrabalhados;
        this.numeroDeFilhos = numeroDeFilhos;
        this.numeroDeFeriados = numeroDeFeriados;
        this.feriado = salarioBase / 30 * numeroDeFeriados * numeroDeFilhos;
        this.totalLiquido = 0.0; // Initialize totalLiquido to 0.0
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

    public double getSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(double salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
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

    public double getTotalLiquido() {
        return totalLiquido;
    }

    public void setTotalLiquido(double totalLiquido) {
        this.totalLiquido = totalLiquido;
    }


    // metodos

    // método para calcular valor dias trabalhados
    public double calcularDiasTrabalhados() {
        double diasTrabalhadosValor = this.getSalarioBase() / 30 * this.getDiasTrabalhados();
        return diasTrabalhadosValor;
    }

    // metodo pra calcular o salario familia
    public double calcularSalarioFamilia() {
        double salarioFamiliaValor = this.getSalarioFamilia() * this.getNumeroDeFilhos(); // Corrected calculation
        return salarioFamiliaValor;
    }

    // método para calcular o feriado
    double calcularFeriado() {
        return feriado;
    }

    public double calcularSalarioLiquido() {
        return 0.0;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Empresa: " + this.getEmpresa());
        System.out.println("Dias trabalhados: " + this.calcularDiasTrabalhados());
        System.out.println("Salário Família: " + this.calcularSalarioFamilia());
        System.out.println("Feriado: " + this.calcularFeriado());
        System.out.printf("Salário Líquido: %.2f ", this.calcularSalarioLiquido());
    }

}