import java.util.Date;

public class Funcionario extends Pessoa {

    public static Double taxaComissao = 10.0;

    public String matricula;
    public String cargo;
    public Double salarioBase;
    public String departamento;
    public Date dataAdmissao;

    public Funcionario(String nome, Integer idade, String cpf, String email, String telefone,
                       String matricula, String cargo, Double salarioBase, String departamento, Date dataAdmissao) {
        super(nome, idade, cpf, email, telefone);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.dataAdmissao = dataAdmissao;
    }


    public Double calcularSalario() {
        return this.salarioBase * (1 + (taxaComissao / 100));
    }

    public void aumentarSalarioBase(Double percentual) {
        if (percentual == null || percentual <= 0) {
            throw new IllegalArgumentException("O percentual de aumento deve ser positivo.");
        }
        this.salarioBase = this.salarioBase * (1 + (percentual / 100));
        System.out.println("Salário base atualizado para R$ " + String.format("%.2f", this.salarioBase));
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
                "\nSalário base: R$ " + String.format("%.2f", this.salarioBase) +
                "\nDepartamento: " + this.departamento +
                "\nData de admissão: " + this.dataAdmissao;
    }
}
