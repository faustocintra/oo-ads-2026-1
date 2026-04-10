public class Estudante extends Pessoa {

    // Atributo
    public String nomeCurso;
    // 1ª opção de inicializar notas zeradas
    //public Double nota1Bim = 0.0;
    //public Double nota2Bim = 0.0;
    public Double nota1Bim;
    public Double nota2Bim;

    public Estudante(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String nomeCurso
    ) {
        super(nome, idade, cpf, email, telefone);
        this.nomeCurso = nomeCurso;
        // 2ª opção de inicializar notas zeradas
        this.nota1Bim = 0.0;
        this.nota2Bim = 0.0;
    }

    // Métodos
    public Double calcularMedia() {
        return (this.nota1Bim + this.nota2Bim) / 2;
    }

    public String determinarSituacao() {
        // if(this.calcularMedia() > 6.0) return "APROVADO";
        // else return "REPROVADO";
        return this.calcularMedia() >= 6.0 ? "APROVADO" : "REPROVADO";
    }

    @Override
    public String exibirDados() {
        String dadosEstudante = super.exibirDados();
        return dadosEstudante +
                "\nCurso: " + this.nomeCurso +
                "\nNota 1º bim.: " + this.nota1Bim +
                "\nNota 2º bim.: " + this.nota2Bim +
                "\nMédia final: " + this.calcularMedia() +
                "\nSituação: " + this.determinarSituacao();
    }
}
