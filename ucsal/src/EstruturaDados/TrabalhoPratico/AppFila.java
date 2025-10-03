package EstruturaDados.TrabalhoPratico;

import java.util.Scanner;

public class AppFila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        FilaAtendimento filaComum = new FilaAtendimento();
        FilaAtendimento fila65 = new FilaAtendimento();
        FilaAtendimento fila80 = new FilaAtendimento();

        // prgunta quantos guichês
        System.out.print("Digite o número de guichês: ");
        int qtd = sc.nextInt();
        Guiche[] guiches = new Guiche[qtd];

        // dividir guichês (se ímpar, extra vai para preferenciais)
        int comuns = qtd / 2;
        int preferenciais = qtd - comuns;

        for (int i = 0; i < qtd; i++) {
            if (i < comuns) {
                guiches[i] = new Guiche(false); // comuns
            } else {
                guiches[i] = new Guiche(true);  // preferenciais
            }
        }

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Incluir pessoa");
            System.out.println("2 - Liberar atendimento");
            System.out.println("3 - Exibir filas");
            System.out.println("4 - Exibir guichês");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();

                    Pessoa p = new Pessoa(nome, idade);
                    if (idade < 65) filaComum.enfileirar(p);
                    else if (idade < 80) fila65.enfileirar(p);
                    else fila80.enfileirar(p);
                    break;

                case 2:
                    for (Guiche g : guiches) {
                        Pessoa atendida = null;
                        boolean foiPrioritario = false;

                        if (g.isPreferencial()) {

                            if (g.getContadorPrioritarios() == 3 && !filaComum.isVazia()) {
                                atendida = filaComum.desenfileirar();
                                foiPrioritario = false;
                                g.resetContador();
                            } else {

                                if (!fila80.isVazia()) {
                                    atendida = fila80.desenfileirar();
                                    foiPrioritario = true;
                                } else if (!fila65.isVazia()) {
                                    atendida = fila65.desenfileirar();
                                    foiPrioritario = true;
                                } else if (!filaComum.isVazia()) {
                                    atendida = filaComum.desenfileirar();
                                    foiPrioritario = false;
                                }
                            }
                        } else {

                            if (!filaComum.isVazia()) {
                                atendida = filaComum.desenfileirar();
                                foiPrioritario = false;
                            }
                        }
                        g.atender(atendida, foiPrioritario);
                    }
                    break;

                case 3:
                    System.out.println("Fila comum:");
                    filaComum.imprimirFila();
                    System.out.println("Fila 65+:");
                    fila65.imprimirFila();
                    System.out.println("Fila 80+:");
                    fila80.imprimirFila();
                    break;

                case 4:
                    for (int i = 0; i < guiches.length; i++) {
                        System.out.println("Guichê " + (i + 1) + ": " + guiches[i]);
                    }
                    break;
            }
        }
        sc.close();

    }
}
