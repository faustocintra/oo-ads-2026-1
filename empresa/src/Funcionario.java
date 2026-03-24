import java.util.Date;

public class Funcionario extends Pessoa {
    public static Double taxaComissao = 10.0;

    public String matricula;
    public String cargo;
    public Double salarioBase;
    public String departamento;
    public Date dataAdmissao;

    public Funcionario(String nome,
                       Integer idade,
                       String cpf,
                       String email,
                       String telefone,
                       String matricula,
                       String cargo,
                       Double salarioBase,
                       String departamento) {
        super(nome, idade, cpf, email, telefone);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.dataAdmissao = new Date();
    }

    public Double calcularSalario() {
        return this.salarioBase * (1 + (taxaComissao / 100));
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() +
                "\nMatricula: " + this.matricula +
                "\nCargo: " + this.cargo +
                "\nSalário base: R$ " + this.salarioBase +
                "\nDepartamento: " + this.departamento +
                "\nData de admissão: " + this.dataAdmissao;
    }
}