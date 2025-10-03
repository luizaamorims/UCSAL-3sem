package EstruturaDados.lista02.ex1;

public class AppListaCarros {
    public static void main(String[] args) {
        ListaCarros listaCarros = new ListaCarros();

        listaCarros.inserirCarro(new Carro("Volvo", "Branco", 2010, 10000));
        listaCarros.inserirCarro(new Carro("Ford", "Preto", 2015, 15000));

        listaCarros.listarCarroMarca("Volvo");
        listaCarros.listarCarroPreco(10000);
    }
}
