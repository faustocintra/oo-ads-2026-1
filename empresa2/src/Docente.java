class Docente extends Funcionario {

    private String formacao;
    private Integer cargaHoraria = 0;
    private Double percentualHorasAtividade = 0.5;

    public Docente(String nome, String cpf, Double salarioBase, String formacao) {
        super(nome, cpf, salarioBase);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double getPercentualHorasAtividade() {
        return percentualHorasAtividade;
    }

    public void setPercentualHorasAtividade(Double percentualHorasAtividade) {
        this.percentualHorasAtividade = percentualHorasAtividade;
    }

    public Double calcularRemuneracao() {
        Double remuneracao = getSalarioBase() * cargaHoraria;
        return remuneracao + (remuneracao * percentualHorasAtividade);
    }

    public Double calcularDSR() {
        return calcularRemuneracao() / 6;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Formacao: " + formacao);
        System.out.println("Carga Horaria: " + cargaHoraria + "h");
        System.out.println("Percentual de Horas-Atividade: " + (percentualHorasAtividade * 100) + "%");
        System.out.printf("Remuneracao: R$ %.2f%n", calcularRemuneracao());
        System.out.printf("Descanso Semanal Remunerado (DSR): R$ %.2f%n", calcularDSR());
    }
}
