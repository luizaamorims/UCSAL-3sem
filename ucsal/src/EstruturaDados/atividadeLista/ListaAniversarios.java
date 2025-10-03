package EstruturaDados.atividadeLista;

public class ListaAniversarios  implements iListaAniversarios{
        private Pessoa[] lista;
        private int tam;
        private int tamMax;

        public ListaAniversarios(int tamMax) {
            this.lista=new Pessoa[tamMax];
            this.tam=0;
            this.tamMax=tamMax;
        }

        public boolean insere(Pessoa p) {
            if((busca(p.getNome())==-1)&&(this.tam<this.tamMax)) {
                this.lista[this.tam]=p;
                this.tam++;
                return true;
            }else {
                return false;
            }
        }

        public boolean exclui(int n) {
            if(n<this.tam) {
                for(int i=n; i<this.tam-1; i++) {
                    this.lista[i]=this.lista[i+1];
                }
                this.tam--;
                return true;
            }else {
                return false;
            }
        }

        public int busca(String nome) {
            int i=0;
            while((i<this.tam)&&!(this.lista[i].getNome().equals(nome))) {
                i++;
            }
            if(i<this.tam) {
                return i;
            }else {
                return -1;
            }
        }
        public void listaAniversariantes(int mes) {
            for(int i=0; i<this.tam; i++) {
                if(this.lista[i].getMes()==mes) {
                    System.out.println(this.lista[i]);
                }
            }
        }
        public void listagemGeral() {
            for(int i=0; i<this.tam; i++) {
                System.out.println(this.lista[i]);
            }
        }
        public Pessoa getPessoa(int n) {
            return this.lista[n];
        }

        public int getTamanho() {
            return this.tam;
        }

}
