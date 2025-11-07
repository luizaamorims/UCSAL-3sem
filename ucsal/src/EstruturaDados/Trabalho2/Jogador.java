package EstruturaDados.Trabalho2;

public class Jogador {
    int vitalidade;
    No localizacaoAtual;

    public Jogador(No posicaoInicial) {
        this.vitalidade = 100;
        this.localizacaoAtual = posicaoInicial;
    }

    public void moverEsquerda() {
        if (localizacaoAtual.esquerda != null) {
            localizacaoAtual = localizacaoAtual.esquerda;
            aplicarAlteracaoVitalidade();
        }
    }

    public void moverDireita() {
        if (localizacaoAtual.direita != null) {
            localizacaoAtual = localizacaoAtual.direita;
            aplicarAlteracaoVitalidade();
        }
    }

    public void voltar() {
        if (localizacaoAtual.pai != null) {
            localizacaoAtual = localizacaoAtual.pai;
            aplicarAlteracaoVitalidade();
        }
    }

    private void aplicarAlteracaoVitalidade() {
        vitalidade += localizacaoAtual.alteracaoVitalidade;
        if (vitalidade > 100) {
            vitalidade = 100;
        }
    }

    public boolean estaVivo() {
        return vitalidade > 0;
    }

    public boolean encontrouTesouro() {
        return localizacaoAtual.temTesouro;
    }

    public void receberDano(int dano) {
        vitalidade -= dano;
        if (vitalidade < 0) {
            vitalidade = 0;
        }
    }
}
