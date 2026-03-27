public class ContaBancaria {

    private Double saldo;
    private String titular;

    public ContaBancaria(String titular, Double saldoInicial) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do titular não pode ser vazio.");
        }
        if (saldoInicial == null || saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(Double quantia) {
        if (quantia == null || quantia <= 0) {
            throw new IllegalArgumentException("A quantia a depositar deve ser positiva.");
        }
        this.saldo += quantia;
        System.out.println("Depósito de R$ " + String.format("%.2f", quantia) + " realizado com sucesso.");
    }

    public void sacar(Double quantia) {
        if (quantia == null || quantia <= 0) {
            throw new IllegalArgumentException("A quantia a sacar deve ser positiva.");
        }
        if (quantia > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        this.saldo -= quantia;
        System.out.println("Saque de R$ " + String.format("%.2f", quantia) + " realizado com sucesso.");
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$ " + String.format("%.2f", this.saldo));
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }
}
