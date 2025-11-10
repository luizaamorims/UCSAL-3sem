package EstruturaDados.Trabalho2;

public class Jogador {
   private int vitalidade;
   private No localizacaoAtual;

    public Jogador(No posicaoInicial) {
        this.vitalidade = 100;
        this.localizacaoAtual = posicaoInicial;
    }

    public void moverEsquerda() {
        if (localizacaoAtual.getEsquerda() != null) {
            localizacaoAtual = localizacaoAtual.getEsquerda();
            aplicarAlteracaoVitalidade();
        }
    }

    public void moverDireita() {
        if (localizacaoAtual.getDireita() != null) {
            localizacaoAtual = localizacaoAtual.getDireita();
            aplicarAlteracaoVitalidade();
        }
    }

    public void voltar() {
        if (localizacaoAtual.getPai() != null) {
            localizacaoAtual = localizacaoAtual.getPai();
            aplicarAlteracaoVitalidade();
        }
    }

    private void aplicarAlteracaoVitalidade() {
        vitalidade += localizacaoAtual.getAlteracaoVitalidade();
        if (vitalidade > 100) {
            vitalidade = 100;
        }
    }

    public void receberDano(int dano) {
        vitalidade -= dano;
        if (vitalidade < 0) {
            vitalidade = 0;
        }
    }

    public boolean estaVivo() {
        return vitalidade > 0;
    }

    public boolean encontrouTesouro() {
        return localizacaoAtual.isTemTesouro();
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public No getLocalizacaoAtual() {
        return localizacaoAtual;
    }
}
