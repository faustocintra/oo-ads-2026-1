public class ContaEspecial extends ContaBancaria {

    // Atributo exclusivo
    private Double limite;

    // Construtor personalizado
    public ContaEspecial(String titular, Double saldoInicial, Double limite) {
        super(titular, saldoInicial);
        if (limite == null || limite < 0) {
            throw new IllegalArgumentException("O limite não pode ser negativo.");
        }
        this.limite = limite;
    }

    // Métodos
    @Override
    public void sacar(Double quantia) {
        if (quantia == null || quantia <= 0) {
            throw new IllegalArgumentException("A quantia a sacar deve ser positiva.");
        }
        if (quantia > (this.getSaldo() + this.limite)) {
            throw new IllegalArgumentException("Saldo + limite insuficiente para realizar o saque.");
        }
        super.sacar(quantia);
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: R$ " + String.format("%.2f", this.getSaldo()));
        System.out.println("Limite: R$ " + String.format("%.2f", this.limite));
        System.out.println("Saldo + Limite: R$ " + String.format("%.2f", this.getSaldo() + this.limite));
    }

    public void exibirSaldoSemLimite() {
        System.out.println("Saldo sem limite: R$ " + String.format("%.2f", this.getSaldo()));
    }

    // Getter
    public Double getLimite() {
        return this.limite;
    }

    // Setter
    public void setLimite(Double novoLimite) {
        if (novoLimite == null || novoLimite < 0) {
            throw new IllegalArgumentException("O limite não pode ser negativo.");
        }
        this.limite = novoLimite;
    }
}
