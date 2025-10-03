package EstruturaDados.lista02.ex1;

public interface iListaCarros {

    void inserirCarro(Carro carro);
    void buscarCarro(String marca, int ano, String cor);
    void listarCarroMarca(String marca);
    void listarCarroPreco(double preco);
}
