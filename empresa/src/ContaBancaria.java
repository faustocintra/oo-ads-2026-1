public class ContaBancaria {
    public Double saldo;
    public String titular;

    // Construtor exigindo nome e saldo inicial
    public ContaBancaria(String titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(Double quantia) {
        this.saldo += quantia;
        System.out.println("Depósito de R$ " + quantia + " para " + titular);
    }

    public void sacar(Double quantia) {
        if (quantia <= saldo) {
            this.saldo -= quantia;
            System.out.println("Saque de R$ " + quantia + " realizado por " + titular);
        } else {
            System.out.println("Saldo insuficiente para " + titular);
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo);
    }

    public class ContaEspecial extends ContaBancaria {
        public Double limite;

        public ContaEspecial(String titular, Double saldoInicial, Double limite) {
            super(titular, saldoInicial);

            // Passa o titular para o pai
            this.limite = limite;
        }

        @Override
        public void exibirSaldo() {
            Double saldoTotal = this.saldo + this.limite;
            System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo + " | Limite: R$ " + limite + " | Disponível: R$ " + saldoTotal);
        }
    }
}