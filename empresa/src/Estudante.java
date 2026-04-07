public class Estudante extends Pessoa{
    //Atributos
    public String nomeCurso;
    public Double notaPrimeiroBimestre;
    public Double notaSegundoBimestre;

    public Estudante(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String nomeCurso
    ){
        super(nome, idade, cpf, email,telefone);
        this.nomeCurso = nomeCurso;
        this.notaPrimeiroBimestre = 0.0;
        this.notaSegundoBimestre = 0.0;
    }
    //calcular média
    public Double calcularMediaFinal(){
        return (this.notaPrimeiroBimestre + this.notaSegundoBimestre) / 2.0;
    }
    public String verificarMedia(){
        if (calcularMediaFinal() >= 6.0){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
    @Override
    public String exibirDados(){
        String dadosPessoa = super.exibirDados();
        return dadosPessoa +
                "\nNome do Curso: " + this.nomeCurso +
                "\nNota do 1°Bimestre: " + this.notaPrimeiroBimestre +
                "\nNota do 2°Bimestre: " + this.notaSegundoBimestre +
                "\nMédia Final: " + this.calcularMediaFinal() +
                "\nA situação do Aluno é: " + this.verificarMedia();
    }
}




