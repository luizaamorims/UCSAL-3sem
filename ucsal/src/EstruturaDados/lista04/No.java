package EstruturaDados.lista04;

public class No {
    private Aluno aluno;
    private No anterior, proximo;

    public No(Aluno aluno) {
        this.aluno = aluno;
        this.anterior = null;
        this.proximo = null;
    }

    public No getProximo() {
        return this.proximo;
    }

    public void setProximo(No no) {
        this.proximo = no;
    }

    public No getAnterior() {
        return this.anterior;
    }

    public void setAnterior(No no) {
        this.anterior = no;
    }

    public Aluno getAluno() {
        return this.aluno;
    }
}
