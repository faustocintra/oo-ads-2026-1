public class ContaEspecial extends ContaBancaria {
    // Atributo exclusivo
    public Double limite;

    // CONSTRUTOR PERSONALIZADO
    public ContaEspecial(String titular, Double saldoInicial, Double limite) {
        // super chama o construtor da classe "mãe" (ContaBancaria)
        super(titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void exibirSaldo() {
        Double saldoComLimite = this.saldo + this.limite;
        System.out.println("Titular (Especial): " + this.titular);
        System.out.println("Saldo + Limite: R$ " + saldoComLimite);
    }

    public void exibirSaldoReal() {
        System.out.println("Saldo Real (sem limite) de " + this.titular + ": R$ " + this.saldo);
    }
}