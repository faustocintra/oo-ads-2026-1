public class Pessoa {

    private String nome;
    private Integer idade;
    private String cpf;
    private String email;
    private String telefone;

    public Pessoa(String nome, Integer idade, String cpf, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void apresentar() {
        System.out.println("Ola, meu nome e " + nome + " e tenho " + idade + " anos.");
    }

    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversario, " + nome + "! Agora voce tem " + idade + " anos.");
    }

    public void atualizarEmail(String novoEmail) {
        email = novoEmail;
        System.out.println("Email atualizado para: " + email);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
    }
}
