package EstruturaDados.Trabalho2;

public class MapaArvore {
    private No raiz;

    public MapaArvore() {
        construirMapa();
    }

    private void construirMapa() {
        raiz = new No("Entrada da Floresta",
                "Você está na entrada de uma floresta misteriosa. O ar é denso e úmido.",
                0, false, false);

        No clareira = new No("Clareira Iluminada",
                "Uma bela clareira com raios de sol penetrando entre as árvores. Você se sente revigorado!",
                15, false, false);

        No pântano = new No("Pântano Sombrio",
                "Um pântano fedorento e perigoso. Você sente sua energia sendo drenada.",
                -20, false, false);

        No caverna = new No("Caverna Escura",
                "Uma caverna úmida e escura. Morcegos voam ao seu redor.",
                -10, false, false);

        No rio = new No("Margem do Rio",
                "Um rio cristalino corre suavemente. A água fresca restaura sua energia.",
                20, false, false);

        No aldeiaAbandonada = new No("Aldeia Abandonada",
                "Ruínas de uma antiga aldeia. Um vento gelado sopra entre as construções.",
                -15, false, true);

        No templo = new No("Templo Antigo",
                "Um templo misterioso coberto de vegetação.",
                -5, false, false);

        No tesouroLocal = new No("Universidade Católica",
                "Você encontrou a UCSAl! O TESOURO está aqui!",
                0, true, false);

        No armadilha = new No("Sala das Armadilhas",
                "Você caiu em uma armadilha! Lanças e flechas voam em sua direção!",
                -30, false, true);

        raiz.setEsquerda(clareira);
        clareira.setPai(raiz);

        raiz.setDireita(pântano);
        pântano.setPai(raiz);

        clareira.setEsquerda(caverna);
        caverna.setPai(clareira);

        clareira.setDireita(rio);
        rio.setPai(clareira);

        pântano.setEsquerda(aldeiaAbandonada);
        aldeiaAbandonada.setPai(pântano);

        pântano.setDireita(templo);
        templo.setPai(pântano);

        rio.setEsquerda(tesouroLocal);
        tesouroLocal.setPai(rio);

        templo.setDireita(armadilha);
        armadilha.setPai(templo);
    }

    public No getRaiz() {
        return raiz;
    }
}
