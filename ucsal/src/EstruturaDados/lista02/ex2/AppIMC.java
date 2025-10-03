package EstruturaDados.lista02.ex2;

public class AppIMC {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(70, 1.70, "Ana", "Centro");
        Pessoa pessoa2 = new Pessoa(80, 1.80, "Bob", "Centro");
        Pessoa pessoa3 = new Pessoa(90, 1.90, "Carlos", "Centro");
        Pessoa pessoa4 = new Pessoa(100, 2.00, "Douglas", "Centro");

        ListaPessoa listaPessoa = new ListaPessoa();
        listaPessoa.inserirPessoa(pessoa1);
        listaPessoa.inserirPessoa(pessoa2);
        listaPessoa.inserirPessoa(pessoa3);
        listaPessoa.inserirPessoa(pessoa4);
        pessoa1.calculaIMC();
        pessoa2.calculaIMC();
        pessoa3.calculaIMC();
        pessoa4.calculaIMC();

        listaPessoa.listarBairro("Centro");
    }
}
