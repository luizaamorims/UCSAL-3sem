package EstruturaDados.lista01.ex1;

public class AppLivro {
    public static void main(String[] args) {

        Livro meuLivro = new MeuLivro();
        meuLivro.adicionarLivro("O Senhor dos Anéis", "HarperCollins", 1954);

        System.out.println("Título: " + meuLivro.getTitulo());
        System.out.println("Editora: " + meuLivro.getEditora());
        System.out.println("Ano de Publicação: " + meuLivro.getAnoPublicacao());
    }
}
