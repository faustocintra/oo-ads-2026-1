public class ContaBancaria {
//;
        private Double saldo;
        private String titular;

        // Construtor;
        public ContaBancaria(String titular, Double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        public void depositar(Double quantia) {
            saldo += quantia;
        }

        public void sacar(Double quantia) {
            saldo -= quantia;
        }

        public void exibirSaldo() {
            System.out.println("Saldo: " + saldo);
        }
}
