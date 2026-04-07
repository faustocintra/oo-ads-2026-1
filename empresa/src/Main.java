import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Mantemos todas as chamadas antigas comentadas
        // teste01();
        // teste02();
        // teste03();


        prova1();
    }

    public static void teste01() {
        /* MANTENDO SEU HISTÓRICO ORIGINAL DE PESSOA E FUNCIONARIO
        Pessoa pessoa1 = new Pessoa(
            "Gervásio Gomes Garcia",
            54,
            "123.456.789-01",
            "gervasio.garcia@empresa.com.br",
            "(16) 98765-4321"
        );

        System.out.println(pessoa1.exibirDados());
        System.out.println("-".repeat(80));
        pessoa1.fazerAniversario();
        pessoa1.apresentar();
        System.out.println("-".repeat(80));

        Funcionario func1 = new Funcionario(
            "Veneranda Vieira",
            26,
            "987.654.321-09",
            "veneranda@empresa.com.br",
            "(36) 91234-5678",
            "F0123",
            "Assistente Financeiro",
            3500.00,
            "Gerência Financeira"
        );

        System.out.println(func1.exibirDados());
        System.out.println("-".repeat(80));

        Double salarioFinal = func1.calcularSalario();
        System.out.println("O salário final de Veneranda é R$ " + salarioFinal);
        */
    }

    public static void teste02() {
        // Código antigo comentado
    }

    public static void teste03() {
        /* MANTENDO HISTÓRICO DE CONTAS BANCÁRIAS
        ContaBancaria c1 = new ContaBancaria("Assuel", 1000.0);
        ContaBancaria c2 = new ContaBancaria("Bruna", 500.0);
        ContaBancaria c3 = new ContaBancaria("Carlão", 50.0);
        // movimentações...

        ContaEspecial ce1 = new ContaEspecial("Hobbes", 1000.0, 500.0);
        ContaEspecial ce2 = new ContaEspecial("Assis", 2000.0, 1000.0);
        ContaEspecial ce3 = new ContaEspecial("Nicolau", 500.0, 2000.0);
        // movimentações...
        */
    }

    public static void prova1() {
        System.out.println("=".repeat(50));
        System.out.println("          RESULTADO DOS ESTUDANTES");
        System.out.println("=".repeat(50));

        // ── Estudante 1 ──────────────────────────────────────
        Estudante e1 = new Estudante("Ana Beatriz Lima", "111.222.333-44",
                "Engenharia de Software");
        e1.setNotaBimestre1(8.5);
        e1.setNotaBimestre2(7.0);

        // ── Estudante 2 ──────────────────────────────────────
        Estudante e2 = new Estudante("Carlos Eduardo Mendes", ,
                "Sistemas de Informação");
        e2.setNotaBimestre1(4.0);
        e2.setNotaBimestre2(5.5);

        // ── Estudante 3 ──────────────────────────────────────
        Estudante e3 = new Estudante("Fernanda Costa Rocha",
                "Ciência da Computação");
        e3.setNotaBimestre1(9.0);
        e3.setNotaBimestre2(9.5);

        // ── Estudante 4 – seu nome ───────────────────────────
        Estudante e4 = new Estudante("Samuel Pereira de Souza", "444.555.666-77",
                "Análise e Desenvolvimento de Sistemas");
        e4.setNotaBimestre1(6.0);
        e4.setNotaBimestre2(7.5);

        // ── Exibindo dados dos quatro ────────────────────────
        Estudante[] estudantes = {e1, e2, e3, e4};

        for (Estudante e : estudantes) {
            System.out.println("-".repeat(50));
            e.exibirDados();
        }

        System.out.println("=".repeat(50));
    }
}