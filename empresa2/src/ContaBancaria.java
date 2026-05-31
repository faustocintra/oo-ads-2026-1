public class ContaBancaria {

    private Double saldo;
    private Pessoa titular;
    private CestaTarifas cestaTarifas;

    public ContaBancaria(Pessoa titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public ContaBancaria(String titular, Double saldoInicial) {
        this(new Pessoa(titular, 0, "", "", ""), saldoInicial);
    }

    public Double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public CestaTarifas getCestaTarifas() {
        return cestaTarifas;
    }

    public void setCestaTarifas(CestaTarifas cestaTarifas) {
        this.cestaTarifas = cestaTarifas;
    }

    public void depositar(Double quantia) {
        saldo += quantia;
    }

    public void sacar(Double quantia) {
        saldo -= quantia;
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo: " + saldo);
    }
}
