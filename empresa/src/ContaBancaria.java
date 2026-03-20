public class ContaBancaria {

    public Double saldo;
    public String titular;

    public ContaBancaria(String titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(Double quantia) {
        this.saldo = this.saldo + quantia;
        System.out.println("+ Depósito de R$ " + quantia + " realizado na conta de " + this.titular);
    }

    public void sacar(Double quantia) {
        this.saldo = this.saldo - quantia;
        System.out.println("- Saque de R$ " + quantia + " realizado na conta de " + this.titular);
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular +
                "\nSaldo atual: R$ " + this.saldo);
    }
}