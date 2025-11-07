package EstruturaDados.Animals;

public class No {
    private String conteudo;
    private No sim;
    private No nao;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.sim = null;
        this.nao = null;
    }

    public boolean eFolha() {
        return (this.sim == null && this.nao == null);
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getSim() {
        return sim;
    }

    public void setSim(No sim) {
        this.sim = sim;
    }

    public No getNao() {
        return nao;
    }

    public void setNao(No nao) {
        this.nao = nao;
    }
}
