package EstruturaDados.Animals;

public class Animals {
    public static void main(String[] args) {
        ArvoreAnimals arvore = new ArvoreAnimals();

        System.out.println("Bem vindo ao jogo: Animals!");
        System.out.println();

        do {
            arvore.jogar();
        } while (arvore.jogarNovamente());

        System.out.println("Obrigado por jogar! Até a próxima!");
        arvore.fechar();
    }
}

