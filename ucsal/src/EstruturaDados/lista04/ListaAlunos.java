package EstruturaDados.lista04;

public class ListaAlunos {
    private No inicio;
    private No fim;

    public ListaAlunos() {
        this.inicio = null;
        this.fim = null;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return this.fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }


    public void inserir(Aluno aluno) {
        No no = new No(aluno);
        No anterior, atual;

        if (this.inicio == null) {
            this.inicio = no;
            this.fim = no;
        } else {
            anterior = null;
            atual = this.inicio;

            while ((atual != null) && (atual.getAluno().getNome().compareTo(aluno.getNome()) < 0)) {
                anterior = atual;
                atual = atual.getProximo();
            }

            if (anterior == null) {
                no.setProximo(this.inicio);
                this.inicio.setAnterior(no);
                this.inicio = no;
            } else {
                no.setProximo(anterior.getProximo());
                no.setAnterior(anterior);
                anterior.setProximo(no);

                if (no.getProximo() == null) {
                    this.fim = no;
                } else {
                    atual.setAnterior(no);
                }
            }
        }
    }

    public void excluir(String nome) {
        No no = this.buscar(nome);
        if (no != null) {
            excluirNo(no);
        }
    }

    private void excluirNo(No no) {
        if (this.inicio.equals(no)) {
            this.inicio = this.inicio.getProximo();
            if (this.inicio == null) {
                this.fim = null;
            } else {
                this.inicio.setAnterior(null);
            }
        } else {
            no.getAnterior().setProximo(no.getProximo());
            if (no.getAnterior().getProximo() == null) {
                this.fim = no.getAnterior();
            } else {
                no.getAnterior().getProximo().setAnterior(no.getAnterior());
            }
        }
    }


    public No buscar(String nome) {
        No atual = this.inicio;
        while ((atual != null) && !(atual.getAluno().getNome().equals(nome))) {
            atual = atual.getProximo();
        }
        return atual;
    }


    public void chamada(int dia) {
        if (this.inicio == null) {
            System.out.println("Lista de alunos vazia!");
            return;
        }

        boolean ordemAlfabetica = (dia % 2 == 0);

        System.out.println();
        System.out.println("          CHAMADA - DIA " + dia);
        System.out.println("   Ordem: " + (ordemAlfabetica ? "ALFABÉTICA" : "INVERSA"));
        System.out.println();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        No atual;
        int contador = 1;

        if (ordemAlfabetica) {
            atual = this.inicio;
            while (atual != null) {
                System.out.println("\n" + contador + ". " + atual.getAluno());
                System.out.print("Está presente? (s/n): ");
                String resposta = scanner.nextLine().trim().toLowerCase();

                if (!resposta.equals("s") && !resposta.equals("sim")) {
                    atual.getAluno().incrementarFalta();
                    System.out.println("FALTA registrada!");
                }

                atual = atual.getProximo();
                contador++;
            }
        } else {
            atual = this.fim;
            while (atual != null) {
                System.out.println("\n" + contador + ". " + atual.getAluno());
                System.out.print("Está presente? (s/n): ");
                String resposta = scanner.nextLine().trim().toLowerCase();

                if (!resposta.equals("s") && !resposta.equals("sim")) {
                    atual.getAluno().incrementarFalta();
                    System.out.println("FALTA registrada!");
                }

                atual = atual.getAnterior();
                contador++;
            }
        }

        System.out.println();
        System.out.println("CHAMADA CONCLUÍDA");
        System.out.println();
    }


    public void listarGeral() {
        if (this.inicio == null) {
            System.out.println("Lista de alunos vazia!");
            return;
        }

        System.out.println();
        System.out.println("LISTA GERAL DE ALUNOS ");
        System.out.println();

        No atual = this.inicio;
        int contador = 1;

        while (atual != null) {
            System.out.println("\n" + contador + ". " + atual.getAluno());
            System.out.println();
            atual = atual.getProximo();
            contador++;
        }
    }

    public void listarGeralInvertido() {
        if (this.fim == null) {
            System.out.println("Lista de alunos vazia!");
            return;
        }

        System.out.println();
        System.out.println("LISTA GERAL INVERTIDA");
        System.out.println();

        No atual = this.fim;
        int contador = 1;

        while (atual != null) {
            System.out.println("\n" + contador + ". " + atual.getAluno());
            System.out.println();
            atual = atual.getAnterior();
            contador++;
        }
    }
}
