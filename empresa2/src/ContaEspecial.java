public class ContaEspecial extends ContaBancaria {

    private Double limite;

    public ContaEspecial(Pessoa titular, Double saldoInicial, Double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    public ContaEspecial(String titular, Double saldoInicial, Double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo com limite: " + (getSaldo() + limite));
    }

    public void exibirSaldoReal() {
        System.out.println("Saldo real (sem limite): " + getSaldo());
    }
}
