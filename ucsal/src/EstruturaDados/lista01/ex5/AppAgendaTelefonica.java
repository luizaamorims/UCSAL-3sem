package EstruturaDados.lista01.ex5;

public class AppAgendaTelefonica {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.adicionarContato("Alice", "12345-6789");
        agenda.adicionarContato("Bob", "98765-4321");
        agenda.listarContatos();

        agenda.atualizarContato("Alice", "11111-2222");
        agenda.listarContatos();

        agenda.removerContato("Bob");
        agenda.removerContato("Lua");
        agenda.listarContatos();
    }
}
