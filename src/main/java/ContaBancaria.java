public class ContaBancaria {

    // Atributos
    public Double saldo;
    public String titular;

    // Construtor personalizado
    public ContaBancaria(String titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Métodos
    public void depositar(Double quantia) {
        this.saldo += quantia;
    }

    public void sacar(Double quantia) {
        this.saldo -= quantia;
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$ " + this.saldo);
    }
}



