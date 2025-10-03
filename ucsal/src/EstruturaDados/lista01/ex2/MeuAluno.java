package EstruturaDados.lista01.ex2;

public class MeuAluno implements Aluno{
    private String nome;
    private int anoIngresso;
    private int semestreAtual;

    public MeuAluno(String nome, int anoIngresso, int semestreAtual) {
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.semestreAtual = semestreAtual;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void anoIngresso(int ano) {
        this.anoIngresso = ano;
    }

    @Override
    public void semestreAtual(int semestre) {
        this.semestreAtual = semestre;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getAnoIngresso() {
        return this.anoIngresso;
    }

    @Override
    public int getSemestreAtual() {
        return this.semestreAtual;
    }

    @Override
    public String infoProfessor() {
        return "Nome: "+this.nome+"\n"
                +"Ano de ingresso: "+this.anoIngresso+"\n"
                +"Semestre atual: "+this.semestreAtual;
    }
}
