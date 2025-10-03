package EstruturaDados.atividadeLista;

import java.util.Scanner;

public class AppAniversarios {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                ListaAniversarios lista=new ListaAniversarios(5);
                Pessoa pessoa;
                int opc;
                do {
                    opc=menu(sc);
                    switch(opc) {
                        case 1: inserir(sc, lista);
                            break;
                        case 2: excluir(sc, lista);
                            break;
                        case 3: buscar(sc, lista);
                            break;
                        case 4: listarAniversariantesMes(sc, lista);
                            break;
                        case 5: lista.listagemGeral();
                            break;
                    }
                }while(opc!=6);

            }

            public static int menu(Scanner sc) {
                int opc;
                System.out.println("1 - Inserir");
                System.out.println("2 - Excluir");
                System.out.println("3 - Buscar");
                System.out.println("4 - Listar aniversariantes do mes");
                System.out.println("5 - Listagem geral");
                System.out.println("6 - Sair");
                System.out.println("Opcao: ");
                opc=sc.nextInt();
                return opc;
            }

            public static void inserir(Scanner sc, ListaAniversarios lista) {
                Pessoa pessoa;
                String nome;
                int idade, mes;
                System.out.println("Nome: ");
                nome=sc.next();
                System.out.println("Idade: ");
                idade=sc.nextInt();
                System.out.println("Mes aniversario: ");
                mes=sc.nextInt();
                pessoa=new Pessoa(nome, idade, mes);
                if(lista.insere(pessoa)) {
                    System.out.println("Operacao realizada cm sucesso");
                }else {
                    System.out.println("A operacao nao pode ser realizada");
                }
            }

            public static void excluir(Scanner sc, ListaAniversarios lista) {
                String nome;
                int posicao;
                System.out.println("Nome: ");
                nome=sc.next();
                posicao=lista.busca(nome);
                System.out.println(posicao);
                if(posicao!=-1) {
                    if(lista.exclui(posicao)){
                        System.out.println("Operacao reailizada com sucesso");
                    }else {
                        System.out.println("A operacao nao pode ser realizada;");
                    }
                }
            }
            public static void buscar(Scanner sc, ListaAniversarios lista) {
                String nome;
                int posicao;
                System.out.println("Nome: ");
                nome=sc.next();
                posicao=lista.busca(nome);
                if(posicao!=-1) {
                    System.out.println(lista.getPessoa(posicao));
                }else {
                    System.out.println("O nome nao foi encontrado");
                }
            }

            public static void listarAniversariantesMes(Scanner sc, ListaAniversarios lista) {
                int mes;
                System.out.println("Mes: ");
                mes=sc.nextInt();
                lista.listaAniversariantes(mes);
            }

        }




