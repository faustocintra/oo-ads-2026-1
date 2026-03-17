import java.util.Date;

public class funcionario extends pessoa {

    public static Double taxaComissao = 10.0;

    //Atributos
    public String matricula;
    public String cargo;
    public Double salarioBase;
    public String departamento;
    public Date dataAdmissao;

    // MÉTODO CONSTRUTOR PERSONALIZADO
    public funcionario(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String matricula,
            String cargo,
            Double salarioBase,
            String departamento
    ) {
        // Chamando o construtor da classe pai
        super(nome, idade, cpf, email, telefone);

        // Armazenando o valor dos atributos particulares da classe funcionario
        this.matricula = matricula;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.dataAdmissao = new Date();
    }
    //Métodos
    public Double calcularSalario(){
        return this.salarioBase * (1 + taxaComissao);
    }

    public void aumentarSalarioBase(Double percentual){
        if (percentual == null || percentual <= 0) {
            throw new IllegalArgumentException("O percentual de aumento deve ser positivo");
        }
        this.salarioBase = this.salarioBase * (1 + (percentual / 100));
        System.out.println("Salário base atualizado para R$ " + this.salarioBase);
    }

    public void registrarPonto(){
        System.out.println("Ponto registrado para " + this.nome + "\nMatricula: " +
                this.matricula + "\nData/Hora:" + new Date()
        );
    }

    @Override
    public String exibirDados(){
        String dadosPessoa = super.exibirDados();
        return dadosPessoa +
                "\nMatricula: " + this.matricula +
                "\nCargo: " + this.cargo +
                "\nSalário base: R$ " + this.salarioBase +
                "\nDepartamento: " + this.departamento +
                "\nData de admissão: " + this.dataAdmissao;
    }

}
