public class Estudante extends Pessoa {
    // 1. Atributos específicos solicitados
    public String nomeCurso;
    public Double nota1Bimestre = 0.0;
    public Double nota2Bimestre = 0.0;

    // 2. Construtor: exige o curso no ato da criação
    // Construtor: curso é obrigatório na criação
    public Estudante(String nome, Integer idade, String cpf, String email, String telefone, String nomeCurso) {
        // Envia os dados básicos para o construtor da classe Pessoa (pai)
    super(nome, idade, cpf, email, telefone);
    this.nomeCurso = nomeCurso;
    }

    // 3.a) Metodo para calcular a média final
    public Double calcularMediaFinal() {
        return (this.nota1Bimestre + this.nota2Bimestre) / 2;
    }

    // 3.b) Metodo para retornar o status (Aprovado ou Reprovado)
    public String verificarSituacao() {
        if (this.calcularMediaFinal() >= 6.0) {
            return "APROVADO";
        } else {
            return "Reprovado";
        }
    }

    // 5. Sobrescrita para exibir todos os dados solicitados
    @Override
    public String exibirDados() {
        return super.exibirDados() +
                "\nCurso: " + this.nomeCurso +
                "\nNota 1: " + this.nota1Bimestre +
                "\nNota 2: " + this.nota2Bimestre +
                "\nMédia Final: " + this.calcularMediaFinal() +
                "\nSituação: " + this.verificarSituacao();
    }
}
