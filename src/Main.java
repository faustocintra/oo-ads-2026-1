import java.util.Date;

public class Main {

    public static void main(String[] args) {

        teste03();
    }

    public static void teste01() {
        System.out.println("=== TESTE 01: PESSOA ===\n");

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Gervásio Gomes Garcia";
        pessoa1.idade = 54;
        pessoa1.cpf = "123.456.789-01";
        pessoa1.email = "gervasio.garcia@empresa.com.br";
        pessoa1.telefone = "(16) 98765-4321";

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
                "(16) 99999-8888",
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
        System.out.println("=== TESTE 03: CONTAS BANCÁRIAS ===\n");

        ContaBancaria conta1 = new ContaBancaria("Alice", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Bob", 500.0);
        ContaBancaria conta3 = new ContaBancaria("Carlos", 2000.0);

        System.out.println("--- Contas Bancárias Normais ---\n");

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

        System.out.println("--- Contas Especiais ---\n");

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
}
