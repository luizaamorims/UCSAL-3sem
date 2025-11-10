package EstruturaDados.Trabalho2;

public class No {
    private String nome;
    private String descricao;
    private int alteracaoVitalidade;
    private boolean temTesouro;
    private boolean temArmadilha;
    private No esquerda;
    private No direita;
    private No pai;

    public No(String nome, String descricao, int alteracaoVitalidade, boolean temTesouro, boolean temArmadilha) {
        this.nome = nome;
        this.descricao = descricao;
        this.alteracaoVitalidade = alteracaoVitalidade;
        this.temTesouro = temTesouro;
        this.temArmadilha = temArmadilha;
        this.esquerda = null;
        this.direita = null;
        this.pai = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public boolean isTemArmadilha() {
        return temArmadilha;
    }

    public void setTemArmadilha(boolean temArmadilha) {
        this.temArmadilha = temArmadilha;
    }

    public boolean isTemTesouro() {
        return temTesouro;
    }

    public void setTemTesouro(boolean temTesouro) {
        this.temTesouro = temTesouro;
    }

    public int getAlteracaoVitalidade() {
        return alteracaoVitalidade;
    }

    public void setAlteracaoVitalidade(int alteracaoVitalidade) {
        this.alteracaoVitalidade = alteracaoVitalidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
