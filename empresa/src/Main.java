import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        teste01();
        teste02();
    }

    public static void teste01() {
        // Criação do primeiro objeto de pessoa usando o construtor
        Pessoa pessoa1 = new Pessoa(
                "Gervásio Gomes Garcia",
                54,
                "123.456.789-01",
                "gervasio.garcia@empresa.com.br",
                "(16) 98765-4321"
        );

        // Chamando o método para exibir os dados da pessoa 1
        System.out.println(pessoa1.mostrarDados());

        System.out.println("-".repeat(80));

        pessoa1.fazerAniversario();

        // Chamando a apresentação da pessoa, que reflete a nova idade
        pessoa1.apresentar();

        System.out.println("-".repeat(80));

        // Atualizando o e-mail
        pessoa1.atualizarEmail("ggarcia@outlook.com");

        System.out.println("-".repeat(80));

        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.mostrarDados());

        // Alterando novamente o e-mail por meio de manipulação direta
        // do valor do atributo
        pessoa1.email = "garcia.gervasio@bol.com.br";

        System.out.println("-".repeat(80));

        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.mostrarDados());

        System.out.println("*".repeat(80));

        // Vamos criar o primeiro objeto da classe Funcionario usando o construtor
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

        // Exibindo os dados do funcionário
        System.out.println(func1.mostrarDados());

        System.out.println("-".repeat(80));

        func1.fazerAniversario();

        // Exibindo os dados novamente para verificar mudança de idade
        System.out.println(func1.mostrarDados());

        System.out.println("-".repeat(80));

        // Calculando o salário de Veneranda
        Double salarioFinal = func1.calcularSalario();
        System.out.println("O salário final de Veneranda é R$ " + salarioFinal);
    }

    public static void teste02() {
        // Espaço reservado para testes adicionais
    }
}
