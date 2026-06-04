    class Docente extends Funcionario {

    // atributos
    private String formacao;
    private Integer cargaHoraria = 0;
    private Double percentualHorasAtividade = 0.5;

    // construtor - formação é obrigatória na criação
    public Docente(String nome, String cpf, Double salarioBase, String formacao) {
        super(nome, cpf, salarioBase);
        this.formacao = formacao;
    }

    // getters e setters
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

    // método para calcular a remuneração
    // salário base * carga horária + percentual de horas-atividade sobre isso
    public Double calcularRemuneracao() {
        Double remuneracao = getSalarioBase() * cargaHoraria;
        remuneracao = remuneracao + (remuneracao * percentualHorasAtividade);
        return remuneracao;
    }

    // método para calcular o descanso semanal remunerado
    // remuneração dividida por 6
    public Double calcularDSR() {
        return calcularRemuneracao() / 6;
    }

    // sobrescrita do método exibirDados
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Formação: " + formacao);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Percentual de Horas-Atividade: " + (percentualHorasAtividade * 100) + "%");
        System.out.printf("Remuneração: R$ %.2f%n", calcularRemuneracao());
        System.out.printf("Descanso Semanal Remunerado (DSR): R$ %.2f%n", calcularDSR());
    }
}

