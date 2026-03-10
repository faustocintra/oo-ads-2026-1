import java.util.Date;

public class Funcionario extends Pessoa{

    public static Double taxaComissao = 10.0; // 10%

    // Atributos
    public String matricula;
    public String cargo;
    public Double salarioBase;
    public String departamento;
    public Date dataAdmissao;

    // Métodos
    public Double calcularSalario() {
        return this.salarioBase * (1 + taxaComissao / 100));
}

public void aumentarSalarioBase(Double percentual) {
        if(percentual == null || percentual <= 0) {
            throw new IllegalArgumentException("O percentual de aumento deve ser positivo.");
        }
        this.salarioBase = this.salarioBase * (1 + (percentual / 100));
        System.out.println("Salário base atualizado para R$: " + this.salarioBase);
    }

    public void registrarPonto() {
        System.out.println("Ponto registrado para " + this.nome +
                "\nMatrícula: " + this.matricula +
                "\n Data/hora " + new Date()
        );
    }

    @Override
    public String exibirDados() {
        String dadosPessoa = super.exibirDados();
        return dadosPessoa +
                "\nMatrícula: " + this.matricula +
                "\nCargo: " + this.cargo +
                "\nSalário Base: R$ " + this.salarioBase +
                "\nDepartamento: " + this.departamento +
                "\nData de Admissão: " + this.dataAdmissao;

    }
}
