public class ContaBancaria {
    // Atributos (O que a conta tem)
    // Começamos com zero para não dar erro de conta vazia
    public Double saldo = 0.0;
    public String nome;

    // Métodos (O que a conta faz)

    // 1. Depositar: Soma o valor ao saldo atual
    public void depositar(Double quantia) {
        saldo = saldo + quantia;
        System.out.println("Depósito de R$ " + quantia + " realizado com sucesso.");
    }

    // 2. Sacar: Subtrai o valor do saldo atual
    public void sacar(Double quantia) {
        if (quantia <= saldo) {
            saldo = saldo - quantia;
            System.out.println("Saque de R$ " + quantia + " realizado.");
        } else {
            System.out.println("Saldo insuficiente para sacar R$ " + quantia);
        }
    }

    // 3. Exibir Saldo: Mostra o valor atual na tela
    public void exibirSaldo() {
        System.out.println("Titular: " + nome);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("--------------------------");
    }
}
// 2. Como usar essa classe na sua Main.java
// Para que o código realmente funcione, você precisa "instanciar" (criar)
// a conta dentro do seu método main. Abra o seu arquivo Main.java e adicione isto:



    public static void main(String[] args) {
        // Criando o objeto da conta
        ContaBancaria minhaConta = new ContaBancaria();

        // Definindo o dono da conta
        minhaConta.nome = "Ana Silva (Psicóloga)";

        // Testando os métodos
        minhaConta.exibirSaldo();    // Mostra 0.0
        minhaConta.depositar(500.0); // Deposita 500
        minhaConta.sacar(150.0);     // Tira 150
        minhaConta.exibirSaldo();    // Mostra o resultado final
    }
// public class ContaBancaria {
    public Double saldoInicial;
    public String nome;

    // Construtor Personalizado
    public ContaBancaria(String nome, Double saldoInicial) {
        this.nome = nome;
        this.saldoInicial = saldoInicial;
    }

    public void depositar(Double quantia) {
        saldo += quantia;
    }

    public void sacar(Double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
        }
        else {
            System.out.println("Saldo insuficiente para " + titular);
        }
    }

    public void exibirSaldo() {
        System.out.println("Nome: " + nome + " | Saldo: R$ " + saldo);
    }
public class ContaEspecial extends ContaBancaria {
    public Double limite;

    // Construtor que usa o "super" para chamar o construtor da conta pai
    public ContaEspecial(String titular, Double saldoInicial, Double limite) {
        super(nome, saldoInicial);
        this.limite = limite;
    }

    // Sobrescrita (Override) para mostrar o saldo + limite
    @Override
    public void exibirSaldo() {
        Double saldoTotal = saldo + limite;
        System.out.println("Titular: " + titular + " | Saldo + Limite: R$ " + saldoTotal);
    }

}