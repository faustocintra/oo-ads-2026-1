public class Pessoa {

    // Atributos
    public String nome;
    public Integer idade;
    public String cpf;
    public String email;
    public String telefone;

    // Métodos
    public void apresentar() {
        System.out.println("Olá! Meu nome é " + this.nome + " e tenho " + this.nome + "anos.");
    }

    public void fazerAniversario() {
        this.idade++; // Incremento a idade
        System.out.println("Feliz aniversário, " + this.nome + "! Agora você tem " + this.nome + "anos.");
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
        System.out.println("Email atualizado para: " + this.email);
    }

    public String exibirDados() {
        // \n significa quebra de linha
        return  "Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nCPF: " + this.cpf +
                "\nTelefone: " + this.telefone;

    }
}


