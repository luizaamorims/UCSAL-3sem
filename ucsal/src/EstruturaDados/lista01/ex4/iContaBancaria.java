package EstruturaDados.lista01.ex4;

public interface iContaBancaria {

    double visualizarSaldo();
    boolean sacar(double valor);
    boolean depositar(double valor);
    void atualizarSaldo(double taxa);
}
