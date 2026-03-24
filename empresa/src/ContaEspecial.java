public class ContaEspecial extends ContaBancaria {
    public Double limite;

    // Construtor
    public ContaEspecial(String titular, Double saldoInicial, Double limite) {
        super(titular, saldoInicial);

        // Envia os dados para a ContaBancaria
        this.limite = limite;
    }

    // Sobrescrita para mostrar saldo + limite
    @Override
    public void exibirSaldo() {
        Double disponivel = this.saldo + this.limite;
        System.out.println("Titular: " + titular +
                " | Saldo Real: R$ " + saldo +
                " | Limite: R$ " + limite +
                " | Disponível: R$ " + disponivel);
    }
}
