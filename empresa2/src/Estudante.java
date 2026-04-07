import java.util.Date;

public class Estudante extends Pessoa {

    // Atributos
    public String curso;
    public Double nota1;
    public Double nota2;
    public Double media;

    // Construtor
    public Estudante(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String curso,
            Double nota1,
            Double nota2
    ){
        super(nome, idade, cpf, email, telefone);

        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;

        this.calcularMedia();
    }

    // Método
    public Double calcularMedia() {
        this.media = (this.nota1 + this.nota2) / 2;

        if (this.media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        return this.media;
    }

    @Override
    public String exibirDados() {
        String dadosPessoa = super.exibirDados();
        return dadosPessoa +
                "\nCurso: " + this.curso +
                "\nNota1: " + this.nota1 +
                "\nNota2: " + this.nota2 +
                "\nMédia: " + this.media;
    }
}














