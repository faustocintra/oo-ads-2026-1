public class Estudante extends Pessoa {

    // Atributo
    private String nomeCurso;
    private Double nota1Bim;
    private Double nota2Bim;

    public Estudante(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String nomeCurso
    ) {
        super(nome, idade, cpf, email, telefone);
        this.setNomeCurso(nomeCurso);
        this.setNota1Bim(0.0);
        this.setNota2Bim(0.0);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        if(nomeCurso.trim().length() < 3) {
            throw new IllegalArgumentException("O nome do curso deve ter, pelo menos, 3 caracteres.");
        }
        this.nomeCurso = nomeCurso;
    }

    public Double getNota1Bim() {
        return nota1Bim;
    }

    public void setNota1Bim(Double nota1Bim) {
        if(nota1Bim < 0 || nota1Bim > 10) {
            throw new IllegalArgumentException("A nota bimestral deve estar entre 0 (inclusive) e 10 (inclusive)");
        }
        this.nota1Bim = nota1Bim;
    }

    public Double getNota2Bim() {
        return nota2Bim;
    }

    public void setNota2Bim(Double nota2Bim) {
        if(nota2Bim < 0 || nota2Bim > 10) {
            throw new IllegalArgumentException("A nota bimestral deve estar entre 0 (inclusive) e 10 (inclusive)");
        }
        this.nota2Bim = nota2Bim;
    }

    // Métodos
    public Double calcularMedia() {
        return (this.getNota1Bim() + this.getNota2Bim()) / 2;
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
                "\nCurso: " + this.getNomeCurso() +
                "\nNota 1º bim.: " + this.getNota1Bim() +
                "\nNota 2º bim.: " + this.getNota2Bim() +
                "\nMédia final: " + this.calcularMedia() +
                "\nSituação: " + this.determinarSituacao();
    }
}
