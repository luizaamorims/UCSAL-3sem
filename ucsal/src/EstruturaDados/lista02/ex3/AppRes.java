package EstruturaDados.lista02.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class AppRes {

    public static void main(String[] args) {
        ArrayList<Res> listaRes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        int opcao = 0;

        do {

            System.out.println("MENU");
            System.out.println("1 - Inserir nova cabeça de gado");
            System.out.println("2 - quantidade total de leite na semana");
            System.out.println("3 - quantidade total de alimentos na semana");
            System.out.println("4 - quantidade total de leite após abate");
            System.out.println("5 - total de alimento consumido por semana após abate");
            System.out.println("6 - Listar todos os gados para abate");
            System.out.println("7 - Sair");
            System.out.println();
            System.out.print("Digite sua opcao: ");
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    inserirGado(sc, listaRes);
                    break;
                case 2:
                    leiteSemana(listaRes);
                    break;
                case 3:
                    alimSemana(listaRes);
                    break;
                case 4:
                    leiteApAbate(listaRes);
                    break;
                case 5:
                   alimApAbate(listaRes);
                    break;
                case 6:
                   listarAbate(listaRes);
                    break;
                case 7:
                    System.out.println("Saindo do programa...");
                    break;

            }

        } while(opcao != 7);

    }

    public static void inserirGado(Scanner sc, ArrayList<Res> listaRes){
        System.out.print("Digite o codigo do gado: ");
        int codigo = sc.nextInt();
        System.out.print("Digite a quantidade de leite por semana (litros): ");
        double leite = sc.nextDouble();
        System.out.print("Digite a quantidade de alimento por semana (kg): ");
        double alim = sc.nextDouble();
        System.out.print("Digite o mes de nascimento: ");
        int mesNasc = sc.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int anoNasc = sc.nextInt();

        Res res = new Res(codigo, leite, alim, mesNasc, anoNasc);
        listaRes.add(res);
        System.out.println("nova cabeça cadastrada com sucesso!");
        System.out.println();
    }

    public static void leiteSemana(ArrayList<Res> listaRes){
        double totalLeite = 0;
        for (Res gado : listaRes) {
            totalLeite += gado.getLeite();
        }
        System.out.println("Total de leite na semana: " + totalLeite + " litros");
    }

    public static void alimSemana(ArrayList<Res> listaRes){
        double totalAlim = 0;
        for (Res gado : listaRes) {
            totalAlim += gado.getAlim();
        }
        System.out.println("Total de alimento na semana: " + totalAlim + "Kg");
    }

    public static void leiteApAbate(ArrayList<Res> listaRes){
        double totalLeiteAp = 0;
        for (Res gado : listaRes) {
            if(gado.abate()){
                totalLeiteAp += gado.getLeite();
            }
        }
        System.out.println("Total de leite após abate: " + totalLeiteAp + " litros");
    }

    public static void alimApAbate(ArrayList<Res> listaRes){
        double totalAlimAp = 0;
        for (Res gado : listaRes) {
            if(gado.abate()){
                totalAlimAp += gado.getAlim();
            }
        }
        System.out.println("Total de alimento após abate: " + totalAlimAp + "Kg");
    }

    public static void listarAbate(ArrayList<Res> listaRes){
        int i = 0;

        if (listaRes.isEmpty()) {
            System.out.println("Não há gados cadastrados.");
        } else {
            for (Res gado : listaRes) {
                if (gado.abate()) {
                    i++;
                }
                System.out.println("Quantidade de gados para abate: " + i);
            }

        }
    }
}
