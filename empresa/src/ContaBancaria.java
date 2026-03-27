public class ContaBancaria {

    public Double saldo;
    public String titular;

    // construtor personalizado
    public ContaBancaria(String titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(Double quantia) {
        System.out.println("Depositando R$ " + quantia);
        this.saldo += quantia;
        System.out.println("Novo saldo: R$ " + this.saldo);
    }

    public void sacar(Double quantia) {
        System.out.println("Sacando R$ " + quantia);
        this.saldo -= quantia;
        System.out.println("Novo saldo: R$ " + this.saldo);
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + this.titular + ": R$ " + this.saldo);
    }
}