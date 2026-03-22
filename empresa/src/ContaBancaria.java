public class ContaBancaria {
    // Atributos
    public Double saldo;
    public String titular;

    // Construtor para facilitar a criação na Main
    public ContaBancaria(String titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Métodos solicitados
    public void depositar(Double quantia) {
        if (quantia > 0) {
            this.saldo += quantia;
            System.out.println("Depósito de R$ " + quantia + " realizado.");
        }
    }

    public void sacar(Double quantia) {
        if (quantia > 0 && quantia <= this.saldo) {
            this.saldo -= quantia;
            System.out.println("Saque de R$ " + quantia + " realizado.");
        } else {
            System.out.println("Saldo insuficiente ou quantia inválida.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular + " | Saldo atual: R$ " + this.saldo);
    }
}