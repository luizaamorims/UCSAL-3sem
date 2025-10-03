package EstruturaDados.lista01.ex4;

public class ContaBancaria implements iContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo=saldo;
    }


    public double visualizarSaldo() {
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if(valor>0 && valor<=this.saldo) {
            this.saldo-=valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if(valor>0) {
            this.saldo+=valor;
            return true;
        } else {
            return false;
        }
    }


    public void atualizarSaldo(double taxa) {
        if(taxa>0) {
            this.saldo+=this.saldo*(taxa/100);
        }

    }
}
