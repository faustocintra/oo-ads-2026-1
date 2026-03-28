public class ContaEspecial extends ContaBancaria {
    // Atributo exclusivo (Item 3)
    public Double limite;

    // 3.a - Construtor personalizado exigindo os dados
    public ContaEspecial(String titular, Double saldoInicial, Double limite) {
        // Chama o construtor da sua classe pai (ContaBancaria)
        super(titular, saldoInicial);
        this.limite = limite;
    }

    // 3.b - Sobrescrevendo o método exibirSaldo
    @Override
    public void exibirSaldo() {
        Double saldoComLimite = this.saldo + this.limite;
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo com limite: R$" + saldoComLimite);
    }

    // 3.c - Método para mostrar apenas o saldo real
    public void exibirSaldoReal() {
        // Aqui chamamos o comportamento original da classe pai ou acessamos o atributo
        System.out.println("Saldo real (sem limite): R$" + this.saldo);
    }
}
