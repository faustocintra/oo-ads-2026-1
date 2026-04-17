public class Main {

    public static void main(String[] args) {

        // teste03(); // comentado conforme solicitado

        prova1();
    }

    public static void prova1() {

        // criando os quatro docentes (formação obrigatória no construtor)

        Docente docente1 = new Docente("Ana Paula", "111.111.111-11", 30.0, "Mestrado em Matemática");
        docente1.setCargaHoraria(40);
        docente1.setPercentualHorasAtividade(0.5);

        Docente docente2 = new Docente("Carlos Eduardo", "222.222.222-22", 25.0, "Graduação em Letras");
        docente2.setCargaHoraria(20);
        docente2.setPercentualHorasAtividade(0.3);

        Docente docente3 = new Docente("Fernanda Lima", "333.333.333-33", 35.0, "Doutorado em Física");
        docente3.setCargaHoraria(30);
        docente3.setPercentualHorasAtividade(0.6);

        Docente docente4 = new Docente("Roberto Souza", "444.444.444-44", 28.0, "Especialização em Informática");
        docente4.setCargaHoraria(25);
        docente4.setPercentualHorasAtividade(0.4);

        // exibindo os dados de cada docente
        docente1.exibirDados();
        System.out.println();

        docente2.exibirDados();
        System.out.println();

        docente3.exibirDados();
        System.out.println();

        docente4.exibirDados();
        System.out.println();
    }
}
