public class Pessoa {
    // Atributos
    public String nome;
    public Integer idade;
    public String cpf;
    public String email;
    public String telefone;

    // Construtor Personalizado
    public Pessoa(String nome, Integer idade, String cpf, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos.");
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Feliz aniversário, " + this.nome + "! Agora você tem " + this.idade + " anos.");
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
        System.out.println("Email atualizado para: " + this.email);
    }

    public String exibirDados() {
        return "Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nCPF: " + this.cpf +
                "\nE-mail: " + this.email +
                "\nTelefone: " + this.telefone;
    }
}