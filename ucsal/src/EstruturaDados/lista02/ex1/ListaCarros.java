package EstruturaDados.lista02.ex1;

import java.util.ArrayList;

public class ListaCarros implements iListaCarros{

    public ArrayList<Carro> listacarros = new ArrayList<>();

    public void inserirCarro(Carro carro){
        this.listacarros.add(carro);
    }

    public void buscarCarro(String marca, int ano, String cor){
        if(listacarros.isEmpty()) {
            System.out.println("Nao há carros cadastrados!");
        } else {
            for (Carro carro : listacarros) {
                if (carro.getMarca().equalsIgnoreCase(marca) && carro.getAno() == ano && carro.getCor().equalsIgnoreCase(cor)) {
                    System.out.println("Carro encontrado!");
                    System.out.println("Preço do carro: " + carro.getPreco());
                }
            }
        }


    }
    public void listarCarroMarca(String marca){
        if(listacarros.isEmpty()) {
            System.out.println("Nao há carros cadastrados!");
        } else {
            for (Carro carro : listacarros) {
                if (carro.getMarca().equalsIgnoreCase(marca)) {
                    System.out.println("Carro encontrado!");
                    System.out.println("Carros com essa marca: " + carro.toString());
                }
            }
        }

    }
    public void listarCarroPreco(double preco){
        if(listacarros.isEmpty()) {
            System.out.println("Nao há carros cadastrados!");
        } else {
            for (Carro carro : listacarros) {
                if (carro.getPreco() <= preco ) {
                    System.out.println("Carro encontrado!");
                    System.out.println("Carros com esse preco ou menor: " + carro.toString());
                }
            }
        }

    }


}
