package departamentos;

class Pessoa extends Empresa{
    // atributos
    // vencimentos
    private String nome;
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
    private boolean valeTransporte;

    // construtor
    public Pessoa(String nome, int diasTrabalhados, int numeroDeFilhos, int numeroDeFeriados,
            double descontoVale, double descontoConvenio,
            int numeroFaltas, boolean adiantamento, boolean valeTransporte) {
        this.nome = nome;
        this.salarioBase = 0;
        this.diasTrabalhados = diasTrabalhados;
        this.numeroDeFilhos = numeroDeFilhos;
        this.numeroDeFeriados = numeroDeFeriados;
        this.feriado = 0;
        this.tetoSalarioFamilia = 1904.06;
        this.descontoVale = descontoVale;
        this.descontoConvenio = descontoConvenio;
        this.numeroFaltas = numeroFaltas;
        this.adiantamento = adiantamento;
        this.adiantamentoValor = 0;
        this.valeTransporte = valeTransporte;

    }

    // getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    boolean getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(boolean valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    

    



}