package EstruturaDados.Trabalho2;

public class SistemaArmadilha {

    public static int lancarDado() {
        return (int)(Math.random() * 6) + 1;
    }

    public static boolean armadilha(Jogador jogador, java.util.Scanner scanner) {
        System.out.println();
        System.out.println("      ARMADILHA ATIVADA!       ");
        System.out.println();
        System.out.println("Você precisa reagir rápido!");
        System.out.println("Role os dados para tentar escapar...\n");
        System.out.println("Pressione ENTER para lançar o dado...");
        scanner.nextLine();

        int dado = lancarDado();
        System.out.println("Você rolou: " + dado);

        if (dado >= 4) {
            int danoReduzido = 10;
            jogador.receberDano(danoReduzido);
            System.out.println("Você conseguiu desviar parcialmente!");
            System.out.println("Perdeu apenas " + danoReduzido + " de vitalidade.\n");
            return true;
        } else {
            int danoTotal = 30;
            jogador.receberDano(danoTotal);
            System.out.println("Você não conseguiu escapar a tempo!");
            System.out.println("Perdeu " + danoTotal + " de vitalidade.\n");
            return jogador.estaVivo();
        }
    }
}
