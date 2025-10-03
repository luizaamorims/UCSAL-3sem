package EstruturaDados.lista01.ex1;

public interface Livro {

    void adicionarLivro(String titulo, String editora, int anoPublicacao);
    String getTitulo();
    String getEditora();
    int getAnoPublicacao();
    void setTitulo(String titulo);
    void setEditora(String editora);
    void setAnoPublicacao(int anoPublicacao);
}
