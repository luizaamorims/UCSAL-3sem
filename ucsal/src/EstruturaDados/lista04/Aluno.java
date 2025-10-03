package EstruturaDados.lista04;

public class Aluno {
    private String nome;
    private int quantidadeFaltas;

    public Aluno(String nome, int quantidadeFaltas) {
        this.nome = nome;
        this.quantidadeFaltas = quantidadeFaltas;
    }

    public Aluno(String nome) {
        this.nome = nome;
        this.quantidadeFaltas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFaltas() {
        return quantidadeFaltas;
    }

    public void setQuantidadeFaltas(int quantidadeFaltas) {
        this.quantidadeFaltas = quantidadeFaltas;
    }

    public void incrementarFalta() {
        this.quantidadeFaltas++;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Quantidade de faltas: " + this.quantidadeFaltas;
    }
}
