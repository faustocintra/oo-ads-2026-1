//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] orgs){

        // Criação do primeiro objeto de pessoa
        pessoa pessoa1 = new pessoa();

        pessoa1.nome = "Gervásio Gomes Garcia";
        pessoa1.idade = 54;
        pessoa1.cpf = "123.456.789.01";
        pessoa1.email = "gervasio.garcia@gmail.com.br";
        pessoa1.telefone = "(16) 98765-4321";

        // Chamando o método para exibir os dados da pessoa 1
        System.out.println(pessoa1.exibirDados());

        System.out.println("-".repeat(count: 80)); // Traça separador

        pessoa1.fazerAniversario();

        // Chamando a apresentação da pessoa, que reflete a nova idade
        pessoa1.apresentar();

        // Atualizando o e-mail
        pessoa1.atualizarEmail(novoEmail: "ggarcia@outlook.com");

        System.out.println("-".repeat(count: 80)); // Traça separador

        System.out.println(pessoa1.exibirDados());

        // Alterando o e-mail novamente por meio de manipulação direta
        // do valor da atributa
        pessoa1.email = "garcia.gervasio@bal.com.br";

        System.out.println("-".repeat(count: 80)); // Traça separador

        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.exibirDados());

    }
}
