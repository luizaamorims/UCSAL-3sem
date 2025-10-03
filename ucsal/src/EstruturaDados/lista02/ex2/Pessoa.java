package EstruturaDados.lista02.ex2;

public class Pessoa {

    double peso;
    double altura;
    String nome;
    String bairro;
    String statusIMC;

    public Pessoa(double peso, double altura, String nome, String bairro) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
        this.bairro = bairro;
    }

    public void calculaIMC() {
        double imc = this.peso / (this.altura * this.altura);
        if (imc < 18.5) {
            this.statusIMC = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            this.statusIMC = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            this.statusIMC = "Acima do peso";
        } else if (imc >= 30) {
            this.statusIMC = "Obeso";
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {

        return "Nome: " + this.nome +
                ", Peso: " + this.peso +
                ", Altura: " + this.altura +
                ", Bairro: " + this.bairro +
                ", Status: " + this.statusIMC;
    }
}

