import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        teste01();
        teste02();
    }

    public static void teste01() {
        // Criação do primeiro objeto de pessoa
        Pessoa pessoa1 = new Pessoa();

        // Atribuindo valores aos atributos
        pessoa1.nome = "Gervásio Gomes Garcia";
        pessoa1.idade = 54;
        pessoa1.cpf = "123.456.789-01";
        pessoa1.email = "gervasio.garcia@empresa.com.br";
        pessoa1.telefone = "(16) 98765-4321";

        // Exibindo os dados da pessoa 1
        System.out.println(pessoa1.mostrarDados());

        System.out.println("-".repeat(80));

        pessoa1.fazerAniversario();

        // Apresentação da pessoa após aniversário
        pessoa1.apresentar();

        System.out.println("-".repeat(80));

        // Atualizando o e-mail
        pessoa1.atualizarEmail("ggarcia@outlook.com");

        System.out.println("-".repeat(80));

        // Exibindo dados atualizados
        System.out.println(pessoa1.mostrarDados());

        // Alterando novamente o e-mail por manipulação direta
        pessoa1.email = "garcia.gervasio@bol.com.br";

        System.out.println("-".repeat(80));

        // Exibindo dados finais
        System.out.println(pessoa1.mostrarDados());
    }

    public static void teste02() {
        System.out.println("*".repeat(80));

        // Vamos criar o primeiro objeto da classe Funcionario
        Funcionario func1 = new Funcionario();

        // Dando valor aos atributos do funcionário
        // (inclui atributos herdados de Pessoa)
        func1.nome = "Veneranda Vieira";
        func1.idade = 26;
        func1.cpf = "987.654.321-09";
        func1.email = "veneranda@empresa.com.br";
        func1.telefone = "(36) 91234-5678";

        func1.matricula = "F0123";
        func1.cargo = "Assistente Financeiro";
        func1.salarioBase = 3500.00;
        func1.departamento = "Gerência Financeira";
        func1.dataAdmissao = new Date();

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
}
