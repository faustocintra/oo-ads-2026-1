import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Agora o main chama os três testes em sequência
        teste01();
        teste02();
        teste03();
    }

    public static void teste01() {
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
    }

    public static void teste02() {
        // Método mantido como no seu original (vazio ou comentado)
        System.out.println("\nExecutando Teste 02...\n");
    }

    // NOVO MÉTODO: Aqui é onde você usa a classe ContaBancaria
    public static void teste03() {
        System.out.println("\n" + "=".repeat(20) + " EXERCÍCIO CONTA BANCÁRIA " + "=".repeat(20));

        // Criando o objeto da conta
        ContaBancaria conta = new ContaBancaria("AJAX", 1000.0);

        // Executando os comandos solicitados no exercício
        conta.exibirSaldo();
        conta.depositar(200.0);
        conta.exibirSaldo();
        conta.sacar(500.0);
        conta.exibirSaldo();
    }
}