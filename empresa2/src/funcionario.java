 public class Funcionario {

    /// atributos
    private String nome;
    private String cpf;
    private Double salarioBase;

    //construtor
    public Funcionario(String nome, String cpf, Double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // método para exibir dados
    public void exibirDados() {
        System.out.println("=== Dados do Funcionário ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Base: R$ " + salarioBase);
    }
}

