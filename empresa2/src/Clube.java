import java.util.ArrayList;
import java.util.List;

public class Clube {

    private String nome;
    private Double mensalidade;
    private List<Pessoa> socios = new ArrayList<>();

    public Clube(String nome, Double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public List<Pessoa> getSocios() {
        return socios;
    }

    public void adicionarSocio(Pessoa pessoa) {
        socios.add(pessoa);
    }

    public void removerSocio(Pessoa pessoa) {
        socios.remove(pessoa);
    }
}
