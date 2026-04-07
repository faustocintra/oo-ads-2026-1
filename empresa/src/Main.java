import java.util.Date;

public class Main {
    // O método main é a porta de entrada. O Windows/Linux procura este nome para começar.
    public static void main(String[] args) {
        // Chamando os testes organizadamente.
        // Para rodar um teste antigo, basta apagar as duas barras (//) da frente.

        // teste01(); // Teste de Pessoas e Funcionários
        // teste02(); // Teste vazio do original
        // teste03(); // Teste de Contas Bancárias

        // CHAMADA DA SUA PROVA (Esta deve ficar ativa para a avaliação)
        prova1();
    }

    // --- SEU TESTE 01: PESSOAS E FUNCIONÁRIOS ---
    public static void teste01() {
        System.out.println("=== TESTE 01: Pessoa e Funcionário ===\n");

        // Criando a primeira pessoa (Objeto)
        Pessoa pessoa1 = new Pessoa(
                "Gervásio Gomes Garcia",
                54,
                "123.456.789-01",
                "gervasio.garcia@empresa.com.br",
                "(16) 98765-4321"
        ); [cite: 4, 16]

        System.out.println(pessoa1.exibirDados()); [cite: 5]
        System.out.println("-".repeat(80));

        // Criando o primeiro funcionário (Usa Herança de Pessoa)
        Funcionario func1 = new Funcionario(
                "Veneranda Vieira",
                26,
                "987.654.321-09",
                "veneranda@empresa.com.br",
                "(36) 91234-5678",
                "F0123",
                "Assistente Financeiro",
                3500.0,
                "Gerência Financeira"
        ); [cite: 5, 6, 26, 27]

        System.out.println(func1.exibirDados()); [cite: 7, 31]
        System.out.println("Salário com comissão: R$ " + func1.calcularSalario()); [cite: 7, 29]
        System.out.println("=".repeat(50) + "\n");
    }

    // --- SEU TESTE 03: CONTAS BANCÁRIAS (Tudo o que você já tinha) ---
    public static void teste03() {
        System.out.println("=== TESTE 03: Contas Bancárias ===\n");

        // Criando contas comuns
        ContaBancaria c1 = new ContaBancaria("Adamastor Asdrúbal", 300.0); [cite: 9, 33]
        ContaBancaria c2 = new ContaBancaria("Marieta Moraes", 450.0); [cite: 10, 33]
        ContaBancaria c3 = new ContaBancaria("Pedrolino Pereira", 280.0); [cite: 33]

        // Movimentações (Depósitos e Saques)
        c1.depositar(150.0); [cite: 11, 35]
        c2.sacar(150.0); [cite: 11, 36, 37]

        // Criando Contas Especiais (Com Limite)
        ContaEspecial ce1 = new ContaEspecial("Bertolino Borges", 500.0, 2000.0); [cite: 10, 46, 47]

        ce1.exibirSaldo(); // Mostra Saldo + Limite (Sobrescrita/@Override) [cite: 14, 48, 49]
        ce1.sacar(800.0);  // Usa o saldo e entra no limite
        ce1.exibirSaldo();
    }

    // --- MÉTODO PROVA 1: SUA AVALIAÇÃO (ESTUDANTES) ---
    public static void prova1() {
        System.out.println("=== AVALIAÇÃO: Registro de EstudANTES ===\n");

        /* Aqui criamos 4 objetos da classe Estudante.
           O curso ("ADS") é obrigatório no ato da criação.
        */

        // Estudante 1
        Estudante est1 = new Estudante("Marcos Silva", 19, "111.222.333-44", "marcos@email.com", "9999-1111", "ADS");
        est1.nota1Bimestre = 7.5;
        est1.nota2Bimestre = 8.0;

        // Estudante 2
        Estudante est2 = new Estudante("Beatriz Souza", 21, "222.333.444-55", "beatriz@email.com", "9999-2222", "ADS");
        est2.nota1Bimestre = 5.0;
        est2.nota2Bimestre = 4.5;

        // Estudante 3
        Estudante est3 = new Estudante("Ricardo Santos", 20, "333.444.555-66", "ricardo@email.com", "9999-3333", "ADS");
        est3.nota1Bimestre = 9.0;
        est3.nota2Bimestre = 10.0;

        // Estudante 4 - SEU NOME COMPLETO
        Estudante est4 = new Estudante("Silvio Oliveira", 25, "444.555.666-77", "silvio.ads@email.com", "9999-4444", "ADS");
        est4.nota1Bimestre = 8.5;
        est4.nota2Bimestre = 7.0;

        // EXIBIÇÃO DOS RESULTADOS (O Java calcula a média e a situação automaticamente)
        System.out.println(est1.exibirDados());
        System.out.println("-".repeat(40));
        System.out.println(est2.exibirDados());
        System.out.println("-".repeat(40));
        System.out.println(est3.exibirDados());
        System.out.println("-".repeat(40));
        System.out.println(est4.exibirDados());

        System.out.println("=".repeat(50));
    }
}