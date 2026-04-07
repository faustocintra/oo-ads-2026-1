import java.util.Date;

public class Main {

    public static void main(String[] args) {
        prova1();
    }

    public static void teste01() {
        System.out.println("TESTE 01: PESSOA\n");

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Gervásio Gomes Garcia";
        pessoa1.idade = 54;
        pessoa1.cpf = "123.456.779-01";
        pessoa1.email = "gervasio.garcia@empresa.com.br";
        pessoa1.telefone = "(16)98765-4321";

        System.out.println(pessoa1.exibirDados());

        System.out.println("\n" + "-".repeat(80) + "\n");

        pessoa1.fazerAniversario();

        pessoa1.apresentar();

        System.out.println("\n" + "-".repeat(80) + "\n");

        pessoa1.atualizarEmail("ggarcia@outlook.com");

        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println(pessoa1.exibirDados());

        pessoa1.email = "garcia.gervasio@bol.com.br";

        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println(pessoa1.exibirDados());
    }

    public static void teste02() {
        System.out.println("TESTE 02: FUNCIONÁRIO\n");

        Funcionario func1 = new Funcionario(
                "João Silva",
                35,
                "987.654.321-00",
                "joao.silva@empresa.com.br",
                "(16)99999-8888",
                "F001",
                "Gerente",
                3000.0,
                "TI",
                new Date()
        );

        System.out.println(func1.exibirDados());

        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println("Salário com comissão: R$ " + String.format("%.2f", func1.calcularSalario()));

        System.out.println("\n" + "-".repeat(80) + "\n");

        func1.registrarPonto();

        System.out.println("\n" + "-".repeat(80) + "\n");

        func1.aumentarSalarioBase(10.0);

        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println(func1.exibirDados());
    }

    public static void teste03() {
        System.out.println("TESTE 03: CONTAS BANCÁRIAS\n");

        ContaBancaria conta1 = new ContaBancaria("Alice", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Bob", 500.0);
        ContaBancaria conta3 = new ContaBancaria("Carlos", 2000.0);

        System.out.println("Contas Bancárias Normais\n");

        System.out.println("Conta de " + conta1.getTitular() + ":");
        conta1.exibirSaldo();
        conta1.depositar(500.0);
        conta1.sacar(200.0);
        conta1.exibirSaldo();

        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println("Conta de " + conta2.getTitular() + ":");
        conta2.exibirSaldo();
        conta2.depositar(300.0);
        conta2.sacar(150.0);
        conta2.exibirSaldo();

        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println("Conta de " + conta3.getTitular() + ":");
        conta3.exibirSaldo();
        conta3.depositar(1000.0);
        conta3.sacar(500.0);
        conta3.exibirSaldo();

        System.out.println("\n" + "-".repeat(80) + "\n");

        ContaEspecial contaEsp1 = new ContaEspecial("Diana", 1500.0, 500.0);
        ContaEspecial contaEsp2 = new ContaEspecial("Éverson", 800.0, 1000.0);
        ContaEspecial contaEsp3 = new ContaEspecial("Fernanda", 2500.0, 2000.0);

        System.out.println("Contas Especiais\n");

        System.out.println("Conta Especial de " + contaEsp1.getTitular() + ":");
        contaEsp1.exibirSaldo();
        contaEsp1.depositar(700.0);
        contaEsp1.sacar(1500.0);
        System.out.println("\nSaldo e Limite:");
        contaEsp1.exibirSaldo();
        System.out.println("\n");
        contaEsp1.exibirSaldoReal();

        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println("Conta Especial de " + contaEsp2.getTitular() + ":");
        contaEsp2.exibirSaldo();
        contaEsp2.depositar(400.0);
        contaEsp2.sacar(800.0);
        System.out.println("\nSaldo e Limite:");
        contaEsp2.exibirSaldo();
        System.out.println("\n");
        contaEsp2.exibirSaldoReal();

        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println("Conta Especial de " + contaEsp3.getTitular() + ":");
        contaEsp3.exibirSaldo();
        contaEsp3.depositar(1500.0);
        contaEsp3.sacar(2000.0);
        System.out.println("\nSaldo e Limite:");
        contaEsp3.exibirSaldo();
        System.out.println("\n");
        contaEsp3.exibirSaldoReal();

        System.out.println("\n" + "-".repeat(80));
        System.out.println("FIM DO TESTE");
    }

    public static void prova1() {
        System.out.println("PROVA 1\n");

        Estudante est1 = new Estudante("Educação Física");
        est1.nome = "Juan Tasso";
        est1.idade = 18;
        est1.cpf = "111.222.333-44";
        est1.email = "juantasso200@escola.com";
        est1.telefone = "(11)91111-1111";
        est1.nota1Bimestre = 4.5;
        est1.nota2Bimestre = 5.0;

        Estudante est2 = new Estudante("Design de Games");
        est2.nome = "Gabriel Campos";
        est2.idade = 21;
        est2.cpf = "999.888.777-66";
        est2.email = "epic.rpg@discord.com";
        est2.telefone = "(16)92222-2222";
        est2.nota1Bimestre = 8.0;
        est2.nota2Bimestre = 7.5;

        Estudante est3 = new Estudante("Administração");
        est3.nome = "Fernanda Souza";
        est3.idade = 22;
        est3.cpf = "555.444.333-22";
        est3.email = "fernanda.adm@escola.com";
        est3.telefone = "(16)93333-3333";
        est3.nota1Bimestre = 6.0;
        est3.nota2Bimestre = 6.0;

        Estudante est4 = new Estudante("Análise e Desenvolvimento de Sistemas");
        est4.nome = "Raphael Marcelo Campos Vieira";
        est4.idade = 21;
        est4.cpf = "473.478.298-59";
        est4.email = "raphael.vieira@fatec.edu.br";
        est4.telefone = "(16)94444-4444";
        est4.nota1Bimestre = 9.0;
        est4.nota2Bimestre = 9.5;

        System.out.println("Dados do estudante:  1:");
        System.out.println(est1.exibirDados());
        System.out.println("\n");

        System.out.println("Dados do estudante:  2:");
        System.out.println(est2.exibirDados());
        System.out.println("\n");

        System.out.println("Dados do estudante:  3:");
        System.out.println(est3.exibirDados());
        System.out.println("\n");

        System.out.println("Dados do estudante: 4:");
        System.out.println(est4.exibirDados());

        System.out.println("\nFIM DA PROVA 1");
    }
}