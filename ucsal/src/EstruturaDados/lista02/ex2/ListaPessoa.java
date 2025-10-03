package EstruturaDados.lista02.ex2;

import java.util.ArrayList;

public class ListaPessoa implements IListaPessoa {

    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void inserirPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }


    public void listarBairro(String bairro) {
        System.out.println("INFORMAÇÕES SOBRE PESSOAS CADASTRADAS NO BAIRRO:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getBairro().equalsIgnoreCase(bairro)) {
                System.out.println("Pessoa: " + pessoa.toString());
            }
        }
    }
}




