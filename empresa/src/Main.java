public class Main {

    public static void main(String[] args) {
        // Chamando os testes organizadamente
        teste01();
        // teste02();
        // Se você quiser usar depois
        teste03();
    }

    public static void teste01() {
        System.out.println("=== TESTE 01: Pessoa e Funcionário ===\n");

        Pessoa pessoa1 = new Pessoa(
                "Gervásio Gomes Garcia",
                54,
                "123.456.789-01",
                "gervasio@email.com",
                "(16) 98765-4321");
        System.out.println(pessoa1.exibirDados());
        pessoa1.fazerAniversario();
        System.out.println("-".repeat(30));

        Funcionario func1 = new Funcionario(
                "Veneranda Vieira",
                26,
                "987.654.321-09",
                "veneranda@empresa.com",
                "(34) 91234-5678",
                "F0123",
                "Assistente",
                3500.0,
                "Financeiro");
        System.out.println(func1.exibirDados());
        System.out.println("Salário com comissão: R$ " + func1.calcularSalario());
        System.out.println("=".repeat(50) + "\n");
    }

    public static void teste03() {
        System.out.println("=== TESTE 03: Contas Bancárias ===\n");

        // 1. Criando as contas (Cada uma na sua variável correta)
        ContaBancaria conta1 = new ContaBancaria("Dra. Ana (Psicóloga)", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Paciente João", 50.0);

        // Usamos ContaEspecial aqui para o Java liberar o limite
        ContaEspecial conta3 = new ContaEspecial("Clínica Central", 5000.0, 2000.0);

        // 2. Movimentações
        conta1.depositar(150.0);
        conta2.sacar(20.0);

        // Agora funciona porque a conta3 foi declarada como ContaEspecial
        conta3.sacar(1000.0);

        // 3. Exibição dos Resultados
        System.out.println("--- RESULTADOS FINAIS ---");
        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo(); // Vai mostrar Saldo + Limite (se você fez o @Override na classe)

        System.out.println("=".repeat(50));
    }
}