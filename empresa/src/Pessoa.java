public class Pessoa {

    //Atributos
    public String nome;
    public Integer idade;
    public String cpf;
    public String email;
    public String telefone;

    /*
         MÉTODO CONSTRUTOR
         o método construtor é sempre chamado quando se cria um novo objeto a partir da classe.
         Nele, podemos exigir que  determinados valores sejam informados para que  a  existência do  objeto seja possível.
         O método construtor tem o mesmo nome da classe e não possui tipo de retorno (nem mesmo void).
     */
    public Pessoa(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone
    ) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

     //Sobrecarga do método construtor
     //Permite criar um objeto sem passar nenhum valor, ou seja, com os atributos vazios
     public Pessoa() {
     }

    //Métodos
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos. ");
    }

    public void fazerAniversario() {
        this.idade++; //incrementa a idade
        System.out.println("Feliz aniversario, " + this.nome + "! Agora você tem " + this.idade + " anos.");
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
        System.out.println("Email atualizado para: " + this.email);
    }

    public String exibirDados() {
        // \n significa quebra de linha
        return "Nome: " + this.nome +
                "\nIdade:" + this.idade +
                "\nCPF:" + this.cpf +
                "\nE-mail:" + this.email +
                "\nTelefone:" + this.telefone;

    }
}