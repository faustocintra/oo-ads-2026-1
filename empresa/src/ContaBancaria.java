public class ContaBancaria {

    // Atributos
    Double saldo;
    String titular;

    // Construtor personalizado
    public ContaBancaria(String titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Métodos
    public void depositar(Double quantia) {
        this.saldo += quantia;
        System.out.println("O valor R$ " + quantia + " foi depositado.");
    }

    public void sacar(Double quantia) {
        this.saldo -= quantia;
        System.out.println("O valor R$ " + quantia + " foi sacado.");
    }

    public void exibirSaldo() {
        System.out.println("Saldo da conta de " + this.titular + " é R$ " + this.saldo);
    }
}
