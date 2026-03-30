public class ContaBancaria {
    // Atributos
    public Double saldo;
    public String titular;

    // CONSTRUTOR PERSONALIZADO
    // Exige titular e saldo inicial para o objeto passar a existir
    public ContaBancaria(String titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(Double quantia) {
        this.saldo += quantia;
        System.out.println("Depósito de R$ " + quantia + " para " + this.titular);
    }

    public void sacar(Double quantia) {
        if (quantia <= this.saldo) {
            this.saldo -= quantia;
            System.out.println("Saque de R$ " + quantia + " realizado por " + this.titular);
        } else {
            System.out.println("Saldo insuficiente para " + this.titular);
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$ " + this.saldo);
    }
}