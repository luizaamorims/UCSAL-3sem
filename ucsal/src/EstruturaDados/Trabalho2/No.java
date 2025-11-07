package EstruturaDados.Trabalho2;

public class No {
    String nome;
    String descricao;
    int alteracaoVitalidade;
    boolean temTesouro;
    boolean temArmadilha;
    No esquerda;
    No direita;
    No pai;

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
}
