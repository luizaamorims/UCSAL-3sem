package EstruturaDados.lista02.ex1;

public class Carro {

    public String marca;
    public String cor;
    public int ano;
    public double preco;


    public Carro(String marca, String cor, int ano, double preco) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }



}
