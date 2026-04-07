public class Estudante extends Pessoa {

    private String nomeCurso;
    private double nota1;
    private double nota2;


    public Estudante(String nome, String cpf, String nomeCurso) {
        super(nome, cpf); // Passa nome e cpf para a classe Pessoa
        this.nomeCurso = nomeCurso;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String verificarSituacao() {
        return (calcularMedia() >= 6.0) ? "APROVADO" : "REPROVADO";
    }

    // Ajustado para os nomes que você usou na Main
    public void setNotaBimestre1(double nota) { this.nota1 = nota; }
    public void setNotaBimestre2(double nota) { this.nota2 = nota; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + verificarSituacao());
    }
}