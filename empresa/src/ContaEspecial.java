public class ContaEspecial extends ContaBancaria {

    public Double limite;

    // construtor personalizado
    public ContaEspecial(String titular, Double saldoInicial, Double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    // sobrescrita do método
    @Override
    public void exibirSaldo() {
        System.out.println("Saldo com limite de " + this.titular + ": R$ " + (this.saldo + this.limite));
    }

    // método novo
    public void exibirSaldoReal() {
        System.out.println("Saldo real de " + this.titular + ": R$ " + this.saldo);
    }
}