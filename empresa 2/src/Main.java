import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //teste01();
        //teste02();
        teste03();
    }

//    public static void teste01() {
//        // Criação do primeiro objeto de pessoa
//        pessoa pessoa1 = new pessoa(
//                "Gervásio Gomes Garcia",
//                54,
//                "123.456.789-01",
//                "gervasio.garcia@empresa.com.br",
//                "(16) 98765-4321"
//        );
//
//        // Atribuindo valores aos atributos
//            pessoa1.nome = "Gervásio Gomes Garcia";
//            pessoa1.idade = 54;
//            pessoa1.cpf = "123.456.789-01";
//            pessoa1.email = "gervasio.garcia@empresa.com.br";
//            pessoa1.telefone = "(16) 98765-4321";
//
//        // Chamando o método para exibir os dados da pessoa 1
//        System.out.println(pessoa1.exibirDados());
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        pessoa1.fazerAniversario();
//
//        // Chamando a apresentação da pessoa, que reflete a nova idade
//        pessoa1.apresentar();
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        // Atualizando o e-mail
//        pessoa1.atualizarEmail("ggarcia@outlook.com");
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        // Exibindo novamente os dados para conferir as alterações feitas
//        System.out.println(pessoa1.exibirDados());
//
//        // Alterando novamente o e-mail por meio de manipulação direta
//        // do valor do atributo
//        pessoa1.email = "garcia.gervasio@bol.com.br";
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        // Exibindo novamente os dados para conferir as alterações feitas
//        System.out.println(pessoa1.exibirDados());
//
//        System.out.println("*".repeat(80));
//
//            // Vamos criar o primeiro objeto da classe Funcionario
//          funcionario func1 = new funcionario(
//                   "Veneranda Vieira",
//                   26,
//                   "987.654.321-09",
//                   "veneranda@empresa.com.br",
//                   "(36) 91234-5678",
//                   "F0123",
//                   "Assistente Financeiro",
//                   3500.00,
//                   "Gêrencia Financeira"
//          );
//
//            // Dando valor aos atributos do funcionário
//            // (inclui atributos herdados de Pessoa)
//            func1.nome = "Veneranda Vieira";
//            func1.idade = 26;
//            func1.cpf = "987.654.321-09";
//            func1.email = "veneranda@empresa.com.br";
//            func1.telefone = "(36) 91234-5678";
//            //----//
//            func1.matricula = "F0123";
//            func1.cargo = "Assistente Financeiro";
//            func1.salarioBase = 3500.00;
//            func1.departamento = "Gerência Financeira";
//            func1.dataAdmissao = new Date();
//
//            // Exibindo os dados do funcionário
//            System.out.println(func1.exibirDados());
//
//            System.out.println("-".repeat(80));
//
//            func1.fazerAniversario();
//
//            // Exibindo os dados novamente para verificar mudança de idade
//            System.out.println(func1.exibirDados());
//
//            System.out.println("-".repeat(80));
//
//            // Calculando o salário de Veneranda
//            Double salarioFinal = func1.calcularSalario();
//            System.out.println("O salário final de Veneranda é R$ " + salarioFinal);
//    }
//
//    public static void teste02() {
//
//            System.out.println("%".repeat(80));
//
//            pessoa p = new pessoa();
//            System.out.println("Exibindo dados de uma pessoa...");
//            System.out.println(p.exibirDados());
//
//            funcionario f = new funcionario();
//            System.out.println("Exibindo dados de um funcionário...");
//            System.out.println(f.exibirDados());
//    }
    public static void teste03 () {
        System.out.println("=".repeat(20) + " TESTE 03 " + "=".repeat(20));

        // --- PARTE DO ITEM 2.b (Contas Normais) ---
        ContaBancaria c1 = new ContaBancaria("João Silva", 1000.0);
        ContaBancaria c2 = new ContaBancaria("Maria Oliveira", 500.0);
        ContaBancaria c3 = new ContaBancaria("Carlos Souza", 2000.0);

        c1.depositar(200.0);
        c1.sacar(100.0);

        System.out.println("--- Contas Bancárias Comuns ---");
        c1.exibirSaldo();
        c2.exibirSaldo();
        c3.exibirSaldo();

        System.out.println("-".repeat(50));

        // --- PARTE DO ITEM 4 (Contas Especiais) ---
        // Criando as três contas especiais pedidas
        ContaEspecial ce1 = new ContaEspecial("Ana Costa", 1000.0, 500.0);
        ContaEspecial ce2 = new ContaEspecial("Beatriz Lima", 200.0, 1000.0);
        ContaEspecial ce3 = new ContaEspecial("Ricardo Lopes", 5000.0, 2000.0);

        // Fazendo depósitos e saques em cada uma (exemplo na ce1)
        ce1.depositar(300.0);
        ce1.sacar(100.0);

        System.out.println("--- Contas Especiais ---");
        // Exibindo saldos (Real e Com Limite) para a ce1
        ce1.exibirSaldoReal(); // Método novo
        ce1.exibirSaldo();     // Método sobrescrito (@Override)

        // Exibindo as demais
        ce2.exibirSaldo();
        ce3.exibirSaldo();
    }
}