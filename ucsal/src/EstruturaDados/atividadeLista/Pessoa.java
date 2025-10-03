package EstruturaDados.atividadeLista;

public class Pessoa {
        private String nome;
        private int idade;
        private int mesAniversario;

        public Pessoa(String nome, int idade, int mes) {
            this.nome=nome;
            this.idade=idade;
            this.mesAniversario=mes;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int getMes() {
            return mesAniversario;
        }

        public void setMes(int mes) {
            this.mesAniversario = mes;
        }

        public String toString() {
            return "Nome: "+this.nome+"\n"
                    +"Idade: "+this.idade+"\n"
                    +"Mes aniversario: "+this.mesAniversario;

    }

}
