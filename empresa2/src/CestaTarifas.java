public class CestaTarifas {

    private String nome;
    private Double valorMensal;
    private Integer quantidadeServicos;

    public CestaTarifas(String nome, Double valorMensal, Integer quantidadeServicos) {
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.quantidadeServicos = quantidadeServicos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(Double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public Integer getQuantidadeServicos() {
        return quantidadeServicos;
    }

    public void setQuantidadeServicos(Integer quantidadeServicos) {
        this.quantidadeServicos = quantidadeServicos;
    }

    public void exibirCesta() {
        System.out.println("Cesta: " + nome);
        System.out.println("Valor mensal: R$ " + valorMensal);
        System.out.println("Servicos incluidos: " + quantidadeServicos);
    }
}
