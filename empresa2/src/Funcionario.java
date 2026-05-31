public class Funcionario extends Pessoa {

    private Double salarioBase;

    public Funcionario(String nome, String cpf, Double salarioBase) {
        super(nome, 0, cpf, "", "");
        this.salarioBase = salarioBase;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Dados do Funcionario ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salario Base: R$ " + salarioBase);
    }
}
