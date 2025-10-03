package EstruturaDados.lista04;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaAlunos lista = new ListaAlunos();
        int opc;

        lista.inserir(new Aluno("Luiza"));
        lista.inserir(new Aluno("Julia"));
        lista.inserir(new Aluno("Matheus"));
        lista.inserir(new Aluno("Ferdinanda"));
        lista.inserir(new Aluno("Deobaldo"));


        do {
            opc = menu(sc);
            switch (opc) {
                case 1:
                    inserir(sc, lista);
                    break;
                case 2:
                    excluir(sc, lista);
                    break;
                case 3:
                    buscar(sc, lista);
                    break;
                case 4:
                    fazerChamada(sc, lista);
                    break;
                case 5:
                    lista.listarGeral();
                    break;
                case 6:
                    lista.listarGeralInvertido();
                    break;
                case 7:
                    System.out.println("Saindo do programa...");
            }
        } while (opc != 7);

        sc.close();
    }

    public static int menu(Scanner sc) {
        int opc;
        System.out.println();
        System.out.println("MENU PRINCIPAL");
        System.out.println();
        System.out.println("1 - Inserir aluno");
        System.out.println("2 - Excluir aluno");
        System.out.println("3 - Buscar aluno");
        System.out.println("4 - Fazer chamada");
        System.out.println("5 - Listagem geral");
        System.out.println("6 - Listagem geral inversa");
        System.out.println("7 - Sair");
        System.out.println();
        System.out.print("Opcao: ");
        opc = sc.nextInt();
        sc.nextLine();
        return opc;
    }

    public static void inserir(Scanner sc, ListaAlunos lista) {
        String nome;
        System.out.print("Nome do aluno: ");
        nome = sc.nextLine().trim();

        if (!nome.isEmpty()) {
            if (lista.buscar(nome) != null) {
                System.out.println("Aluno já existe na lista!");
            } else {
                Aluno aluno = new Aluno(nome);
                lista.inserir(aluno);
                System.out.println("Aluno inserido com sucesso!");
            }
        } else {
            System.out.println("Nome não pode estar vazio!");
        }
    }

    public static void excluir(Scanner sc, ListaAlunos lista) {
        String nome;
        System.out.print("Nome do aluno a excluir: ");
        nome = sc.nextLine().trim();

        No no = lista.buscar(nome);
        if (no != null) {
            lista.excluir(nome);
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Aluno não encontrado na lista!");
        }
    }

    public static void buscar(Scanner sc, ListaAlunos lista) {
        String nome;
        System.out.print("Nome do aluno: ");
        nome = sc.nextLine().trim();

        No no = lista.buscar(nome);
        if (no != null) {
            System.out.println("\nAluno encontrado:");
            System.out.println();
            System.out.println(no.getAluno());
            System.out.println();
        } else {
            System.out.println("O aluno não foi encontrado na lista");
        }
    }

    public static void fazerChamada(Scanner sc, ListaAlunos lista) {
        int dia;
        System.out.print("Digite o dia do mês (1-31): ");
        dia = sc.nextInt();
        sc.nextLine();

        if (dia >= 1 && dia <= 31) {
            lista.chamada(dia);
        } else {
            System.out.println("Dia inválido! Digite um número entre 1 e 31.");
        }
    }
}

