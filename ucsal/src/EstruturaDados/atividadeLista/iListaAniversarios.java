package EstruturaDados.atividadeLista;

public interface iListaAniversarios {
        boolean insere(Pessoa p);
        boolean exclui(int i);
        int busca(String nome);
        void listaAniversariantes(int mes);
        void listagemGeral();
        Pessoa getPessoa(int n);
        int getTamanho();
}
