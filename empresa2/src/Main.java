public class Main {

    public static void main(String[] args) {

        /// teste03(); // comentado conforme solicitado

        exemploContas();
        System.out.println();
        prova1();
    }

    public static void exemploContas() {

        Pessoa titular = new Pessoa(
                "Mariana Souza",
                22,
                "555.555.555-55",
                "mariana@email.com",
                "(11) 99999-9999"
        );

        CestaTarifas cestaBasica = new CestaTarifas("Cesta Basica", 19.90, 5);
        ContaEspecial contaEspecial = new ContaEspecial(titular, 500.0, 1000.0);
        contaEspecial.setCestaTarifas(cestaBasica);

        Clube clubeCliente = new Clube("Clube de Vantagens", 29.90);
        clubeCliente.adicionarSocio(titular);

        contaEspecial.depositar(250.0);
        contaEspecial.sacar(100.0);

        System.out.println("=== Exemplo Conta Especial ===");
        titular.exibirDados();
        contaEspecial.exibirSaldo();
        contaEspecial.exibirSaldoReal();
        cestaBasica.exibirCesta();
        System.out.println("Socios no clube: " + clubeCliente.getSocios().size());
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
