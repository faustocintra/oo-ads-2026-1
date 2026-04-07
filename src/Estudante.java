public class Estudante extends Pessoa {

    public String nomeCurso;
    public Double nota1Bimestre = 0.0;
    public Double nota2Bimestre = 0.0;
    public Estudante(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Double calcularMediaFinal() {
        return (this.nota1Bimestre + this.nota2Bimestre) / 2.0;
    }

    public String verificarSituacao() {
        if (this.calcularMediaFinal() >= 6.0) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }

    @Override
    public String exibirDados() {
        String dadosPessoa = super.exibirDados();
        return dadosPessoa +
                "\nCurso: " + this.nomeCurso +
                "\nNota 1º Bimestre: " + this.nota1Bimestre +
                "\nNota 2º Bimestre: " + this.nota2Bimestre +
                "\nMédia Final: " + this.calcularMediaFinal() +
                "\nSituação: " + this.verificarSituacao();
    }
}