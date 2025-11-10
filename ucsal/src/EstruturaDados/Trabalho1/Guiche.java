package EstruturaDados.Trabalho1;

public class Guiche {

    private boolean preferencial; // true = atende prioritários, false = comuns
    private Pessoa pessoaAtendida;
    private int contadorPrioritarios; // controla a regra 3x1

    public Guiche(boolean preferencial) {
        this.preferencial = preferencial;
        this.pessoaAtendida = null;
        this.contadorPrioritarios = 0;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void atender(Pessoa p, boolean foiPrioritario) {
        this.pessoaAtendida = p;
        if (p != null) {
            p.fimAtendimento();
            if (foiPrioritario) {
                contadorPrioritarios++;
            } else {
                contadorPrioritarios = 0; // reset se atendeu comum
            }
        }
    }

    public int getContadorPrioritarios() {
        return contadorPrioritarios;
    }

    public void resetContador() {
        contadorPrioritarios = 0;
    }

    public String toString() {
        if (pessoaAtendida == null) return "Guichê livre";
        return "Atendendo: " + pessoaAtendida.getNome();
    }
}
