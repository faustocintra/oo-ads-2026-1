//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
}
