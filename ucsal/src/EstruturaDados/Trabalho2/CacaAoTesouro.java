package EstruturaDados.Trabalho2;

import java.util.Scanner;

public class CacaAoTesouro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       MapaArvore mapa = new MapaArvore();
        Jogador jogador = new Jogador(mapa.getRaiz());

        System.out.println("========================================");
        System.out.println("    BEM-VINDO AO CAÇA AO TESOURO!");
        System.out.println("========================================");
        System.out.println("Encontre o tesouro escondido antes que");
        System.out.println("sua vitalidade acabe!");
        System.out.println("Cuidado com as armadilhas!");
        System.out.println("========================================\n");

        boolean jogoAtivo = true;

        while (jogoAtivo) {
            No localAtual = jogador.localizacaoAtual;

            System.out.println();
            System.out.println(" 📍 " + localAtual.nome);
            System.out.println();
            System.out.println(localAtual.descricao);

            if (localAtual.alteracaoVitalidade > 0) {
                System.out.println("Você ganhou " + localAtual.alteracaoVitalidade + " pontos de vitalidade!");
            } else if (localAtual.alteracaoVitalidade < 0 && !localAtual.temArmadilha) {
                System.out.println("Você perdeu " + Math.abs(localAtual.alteracaoVitalidade) + " pontos de vitalidade!");
            }

            System.out.println("\nVitalidade atual: " + jogador.vitalidade + "/100");

            if (localAtual.temArmadilha) {
                scanner.nextLine();
                if (!SistemaArmadilha.armadilha(jogador, scanner)) {
                    jogoAtivo = false;
                    break;
                }
            }

            if (jogador.encontrouTesouro()) {
                System.out.println();
                System.out.println("  *** PARABÉNS! VOCÊ VENCEU! ***");
                System.out.println();
                System.out.println("Você encontrou o tesouro e completou");
                System.out.println("a jornada com " + jogador.vitalidade + " de vitalidade!");
                System.out.println();
                jogoAtivo = false;
                break;
            }

            if (!jogador.estaVivo()) {
                System.out.println();
                System.out.println(" *** GAME OVER ***");
                System.out.println();
                System.out.println("Sua vitalidade chegou a zero!");
                System.out.println("Você não conseguiu encontrar o tesouro.");
                System.out.println();
                jogoAtivo = false;
                break;
            }

            System.out.println("Escolha seu caminho");

            if (localAtual.esquerda != null) {
                System.out.println("1. Seguir pela esquerda");
            }
            if (localAtual.direita != null) {
                System.out.println("2. Seguir pela direita");
            }
            if (localAtual.pai != null) {
                System.out.println("3. Voltar");
            }
            System.out.println("4. Sair do jogo");

            System.out.print("\nSua escolha: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    if (localAtual.esquerda != null) {
                        jogador.moverEsquerda();
                    } else {
                        System.out.println("\nNão há caminho à esquerda!");
                    }
                    break;
                case 2:
                    if (localAtual.direita != null) {
                        jogador.moverDireita();
                    } else {
                        System.out.println("\nNão há caminho à direita!");
                    }
                    break;
                case 3:
                    if (localAtual.pai != null) {
                        jogador.voltar();
                    } else {
                        System.out.println("\nVocê já está no início! Não pode voltar.");
                    }
                    break;
                case 4:
                    System.out.println("\nObrigado por jogar");
                    jogoAtivo = false;
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

}
