import java.util.Date;

public class Funcionario extends Pessoa {

    public static final Double TAXA_COMISSAO = 10.0;

    // Atributos
    public String matricula;
    public String cargo;
    public Double salario;
    public String departamento;
    public Date dataAdmissao;

    // Construtor personalizado
    public Funcionario(String nome, Integer idade, String cpf, String email, String telefone,
                       String matricula, String cargo, Double salario, String departamento, Date dataAdmissao) {
        super(nome, idade, cpf, email, telefone);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
        this.dataAdmissao = dataAdmissao;
    }

    // Métodos
    public Double calcularSalario() {
        return this.salario * (1 + (TAXA_COMISSAO / 100));
    }

    public void aumentarSalario(Double percentual) {
        if (percentual == null || percentual <= 0) {
            throw new IllegalArgumentException("O percentual de aumento deve ser positivo.");
        }
        this.salario = this.salario * (1 + (percentual / 100));
        System.out.println("Salário atualizado para R$ " + String.format("%.2f", this.salario));
    }

    public void registrarPonto() {
        System.out.println("Ponto registrado para " + this.nome +
                "\nMatrícula: " + this.matricula +
                "\nData/hora: " + new Date()
        );
    }

    @Override
    public String exibirDados() {
        String dadosPessoa = super.exibirDados();
        return dadosPessoa +
                "\nMatrícula: " + this.matricula +
                "\nCargo: " + this.cargo +
                "\nSalário: R$ " + String.format("%.2f", this.salario) +
                "\nDepartamento: " + this.departamento +
                "\nData de admissão: " + this.dataAdmissao;
    }
}
