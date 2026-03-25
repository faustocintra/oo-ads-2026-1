public class ContaEspecial extends ContaBancaria {

    public Double limite;

    // Construtor
    public ContaEspecial(String titular, Double saldoInicial, Double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    // Override
    @Override
    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo com limite: R$ " + (this.saldo + this.limite));
    }

    // Novo método
    public void exibirSaldoReal() {
        System.out.println("Saldo real: R$ " + this.saldo);
    }
}