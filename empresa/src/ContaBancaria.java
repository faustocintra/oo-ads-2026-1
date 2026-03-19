public class ContaBancaria {
    // Atributos (O que a conta tem)
    // Começamos com zero para não dar erro de conta vazia
    public Double saldo = 0.0;
    public String titular;

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
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("--------------------------");
    }
}
// 2. Como usar essa classe na sua Main.java
// Para que o código realmente funcione, você precisa "instanciar" (criar) a conta dentro do seu método main. Abra o seu arquivo Main.java e adicione isto:


public class Main {
    public static void main(String[] args) {
        // Criando o objeto da conta
        ContaBancaria minhaConta = new ContaBancaria();

        // Definindo o dono da conta
        minhaConta.titular = "Ana Silva (Psicóloga)";

        // Testando os métodos
        minhaConta.exibirSaldo();    // Mostra 0.0
        minhaConta.depositar(500.0); // Deposita 500
        minhaConta.sacar(150.0);     // Tira 150
        minhaConta.exibirSaldo();    // Mostra o resultado final
    }
}