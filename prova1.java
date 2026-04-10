import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Estudante extends Pessoa {
    private String curso;
    private double nota1;
    private double nota2;

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarSituacao() {
        double media = calcularMedia();
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

public class Prova1 {


    public static void prova1() {
        Scanner teclado = new Scanner(System.in);
        List<Estudante> alunos = new ArrayList<>();
        int opcao;

        // MENU PRINCIPAL
        do {
            System.out.println("\n=-=-= MENU MAROTINHO =-=-=");
            System.out.println("1. Cadastrar Alunos");
            System.out.println("2. Exibir Alunos Cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao == 1) {
                // OPÇÃO 1: CADASTRAR ALUNOS
                System.out.print("Quantos estudantes deseja cadastrar? ");
                int quantidade = teclado.nextInt();
                teclado.nextLine();

                for (int i = 1; i <= quantidade; i++) {
                    System.out.println("\n--- Aluno " + i + " ---");

                    System.out.print("Digite o nome: ");
                    String nome = teclado.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Digite o curso: ");
                    String curso = teclado.nextLine();

                    Estudante aluno = new Estudante(nome, idade, curso);

                    System.out.print("Digite a primeira nota: ");
                    double nota1 = teclado.nextDouble();
                    aluno.setNota1(nota1);

                    System.out.print("Digite a segunda nota: ");
                    double nota2 = teclado.nextDouble();
                    aluno.setNota2(nota2);
                    teclado.nextLine();

                    alunos.add(aluno);
                }
                System.out.println("\nAlunos cadastrados com sucesso!");

            } else if (opcao == 2) {
                // OPÇÃO 2: EXIBIR ALUNOS
                if (alunos.isEmpty()) {
                    System.out.println("\nNenhum aluno cadastrado!");
                } else {
                    System.out.println("\n\n=== Lista de Estudantes ===\n");
                    for (Estudante aluno : alunos) {
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("Idade: " + aluno.getIdade());
                        System.out.println("Curso: " + aluno.getCurso());
                        System.out.println("Nota 1: " + aluno.getNota1());
                        System.out.println("Nota 2: " + aluno.getNota2());
                        System.out.println("Média: " + aluno.calcularMedia());
                        System.out.println("Situação: " + aluno.verificarSituacao());
                        System.out.println("---");
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Programa finalizado!");

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        teclado.close();
    }

    public static void main(String[] args) {
        prova1();
    }
}
