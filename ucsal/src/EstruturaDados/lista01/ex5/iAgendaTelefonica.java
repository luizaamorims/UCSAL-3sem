package EstruturaDados.lista01.ex5;

public interface iAgendaTelefonica {
    void adicionarContato(String nome, String telefone);
    void atualizarContato(String nome, String novoTelefone);
    void removerContato(String nome);
    void listarContatos();
    void removerTeste(String nome);

}
