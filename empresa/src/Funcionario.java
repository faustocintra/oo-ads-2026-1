
import java.util.Date;


public class Funcionario extends Pessoa {


   public static Double taxaComissao = 10.0;


   // Atributos
   public String matricula;
   public String cargo;
   public Double salarioBase;
   public String departamento;
   public Date dataAdmissao;
    // Método construtor
    public Funcionario(
              String nome,
              Integer idade,
              String cpf,
              String email,
              String telefone,
              String matricula,
              String cargo,
              Double salarioBase,
              String departamento,
              Date dataAdmissao

    ) {
        // Chamando o construtor da classe pai (Pessoa) para inicializar os atributos herdados
        super(nome, idade, cpf, email, telefone);
        //Armazenando os valores dos atributos específicos de Funcionario
        this.matricula = matricula;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.dataAdmissao = new Date();
    }


   // Métodos
   public Double calcularSalario() {
       return this.salarioBase * (1 + (taxaComissao / 100));
   }


   public void aumentarSalarioBase(Double percentual) {
       if(percentual == null || percentual <= 0) {
           throw new IllegalArgumentException("O percentual de aumento deve ser positivo.");
       }
       this.salarioBase = this.salarioBase * (1 + (percentual / 100));
       System.out.println("Salário base atualizado para R$ " + this.salarioBase);
   }


   public void registrarPonto() {
       System.out.println("Ponto registrado para " + this.nome +
               "\nMatrícula: " + this.matricula +
               "\nData/hora:" + new Date()
       );
   }


   @Override
   public String exibirDados() {
       String dadosPessoa = super.exibirDados();
       return dadosPessoa +
               "\nMatricula: " + this.matricula +
               "\nCargo: " + this.cargo +
               "\nSalário base: R$ " + this.salarioBase +
               "\nDepartamento: " + this.departamento +
               "\nData de admissão: " + this.dataAdmissao;
   }
}


