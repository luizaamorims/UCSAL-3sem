package EstruturaDados.lista01.ex5;

import java.util.ArrayList;

public class AgendaTelefonica implements iAgendaTelefonica {

    public ArrayList<Contato> contatos = new ArrayList<>();


    @Override
    public void adicionarContato(String nome, String telefone) {
            Contato novoContato = new Contato(nome, telefone);
            this.contatos.add(novoContato);
    }

    @Override
    public void atualizarContato(String nome, String novoTelefone) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setTelefone(novoTelefone);
                System.out.println("Contato atualizado com sucesso!");
                System.out.println("Contato atualizado: Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
            }
        }
    }

    @Override
    public void removerContato(String nome) {
        int index = -1;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                 index = contatos.indexOf(contato);
            }
        }
        if (index != -1) {
            contatos.remove(index);
            System.out.println("Contato " + nome + " removido com sucesso!");
        } else {
            System.out.println("Contato " + nome + " nao encontrado");
        }
    }



    @Override
    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }

    }


    public void removerTeste(String nome){
        boolean removido = contatos.removeIf(x -> x.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println( "Contato removido com sucesso!");
        } else {
            System.out.println("Contato nao encontrado");
        }
    }
}



