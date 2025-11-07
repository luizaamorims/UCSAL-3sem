package EstruturaDados.Animals;

import java.util.Scanner;

public class ArvoreAnimals {
    private No raiz;
    private Scanner sc;

    public ArvoreAnimals() {
        this.raiz = new No("gato");
        this.sc = new Scanner(System.in);
    }


    public void jogar() {
        System.out.println("Pense em um animal");
        System.out.println("Vou tentar adivinhar qual é\n");


        No atual = raiz;
        No pai = null;
        boolean foiParaSim = false;

        while (!atual.eFolha()) {
            System.out.print(atual.getConteudo() + " (s/n): ");
            String resposta = sc.nextLine().trim().toLowerCase();

            if (resposta.equals("s")) {
                pai = atual;
                atual = atual.getSim();
                foiParaSim = true;
            } else if (resposta.equals("n")) {
                pai = atual;
                atual = atual.getNao();
                foiParaSim = false;
            } else {
                System.out.println("Por favor, responda com 's' ou 'n'.");
            }
        }


        System.out.print("\nO animal que você pensou é um(a) " +
                atual.getConteudo() + "? (s/n): ");
        String resposta = sc.nextLine().trim().toLowerCase();

        if (resposta.equals("s")) {
            System.out.println("Eu acertei! \n");
        } else {
            aprenderNovoAnimal(atual, pai, foiParaSim);
        }
    }


    private void aprenderNovoAnimal(No animalErrado, No pai, boolean foiParaSim) {
        System.out.println("Ahh, eu errei!");

        System.out.print("Qual animal você pensou? ");
        String novoAnimal = sc.nextLine().trim();

        System.out.print("\nQual característica " + novoAnimal +
                " tem que " + animalErrado.getConteudo() + " não tem? ");
        String caracteristica = sc.nextLine().trim();


        if (!caracteristica.endsWith("?")) {
            caracteristica = caracteristica + "?";
        }


        No novaPergunta = new No(caracteristica);
        No novoAnimalNo = new No(novoAnimal);


        novaPergunta.setSim(novoAnimalNo);
        novaPergunta.setNao(animalErrado);


        if (pai == null) {

            raiz = novaPergunta;
        } else {

            if (foiParaSim) {
                pai.setSim(novaPergunta);
            } else {
                pai.setNao(novaPergunta);
            }
        }

        System.out.println("\n Obrigado! Agora sei mais sobre " + novoAnimal + "!\n");
    }


    public boolean jogarNovamente() {
        System.out.print("Quer jogar novamente? (s/n): ");
        String resposta = sc.nextLine().trim().toLowerCase();
        return resposta.equals("s");
    }

    public void fechar() {
        sc.close();
    }
}
