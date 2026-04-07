public class ContaEspecial extends ContaBancaria {

    // Atributo
    Double limite;

    // Construtor personalizado
    public ContaEspecial(String titular, Double saldoInicial, Double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo da conta especial de " + this.titular + " é R$ " + (this.saldo + this.limite));
    }

    public void exibirSaldoReal() {
        System.out.println("Saldo (real) da conta especial de " + this.titular + " é R$ " + this.saldo);
    }
}
