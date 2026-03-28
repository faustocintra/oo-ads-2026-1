public class ContaBancaria {
    // Atributos
    public Double saldo;
    public String titular;

    //Construtor Personalizado
    // Ele não tem tipo de retorno (nem void) e tem o mesmo nome da classe
public ContaBancaria(String titular, Double saldoInicial) {
    this.titular = titular;
    this.saldo =  saldoInicial;
}
    // Método para depositar
    public void depositar(Double quantia) {
        saldo += quantia;
        System.out.println("Depósito de R$" + quantia + " realizado. Novo saldo: R$" + saldo);
    }

    // Método para sacar
    public void sacar(Double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Saque de R$" + quantia + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + quantia);
        }
    }

    // Método para exibir o saldo
    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$" + saldo);
    }
}
