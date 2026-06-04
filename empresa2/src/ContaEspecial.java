public class ContaEspecial extends ContaBancaria {
//;
        public Double limite;

        public ContaEspecial(String titular, Double saldoInicial, Double limite) {
            super(titular, saldoInicial);
            this.limite = limite;
        }
//;
        @Override
        public void exibirSaldo() {
            System.out.println("Saldo com limite: " + (limite));
        }

        public void exibirSaldoReal() {
            System.out.println("Saldo real (sem limite)");
        }

}
