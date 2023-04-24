import java.util.Scanner;

public class JogoDaVelha {

    static int estado = 0;
    static String bloco1 = "1", bloco2 = "2", bloco3 = "3", bloco4 = "4", bloco5 = "5", bloco6 = "6", bloco7 = "7", bloco8 = "8", bloco9 = "9";
    static String jogador = "X";

    public static void main(String[] args) {

        while (estado != 9) {
            switch (estado) {
                case 0:
                    estadoInicial();
                    break;
                case 1:
                    jogar();
                    break;
                case 2:
                    finalizar();
                    break;
            }
        }
    }

    private static void finalizar() {

        System.out.println("Jogo finalizado");
        estado = 9;

    }

    private static void jogar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sua vez de jogar, jogador " + jogador);

        boolean selecionarBloco = true;

        while (selecionarBloco) {
            System.out.println("Digite a posicao que deseja jogar: ");
            Integer posicao = digitePosicao();

            try {
                verificarPosicao(posicao, jogador);
                selecionarBloco = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }


        verificarSeTemVencedor(jogador);
        verificarSeDeuVelha(bloco1, bloco2, bloco3, bloco4, bloco5, bloco6, bloco7, bloco8, bloco9);

        imprimeTabuleiro(bloco1, bloco2, bloco3, bloco4, bloco5, bloco6, bloco7, bloco8, bloco9);

        jogador = jogador == "X" ? "O" : "X";
    }

    private static void verificarSeDeuVelha(String bloco1, String bloco2, String bloco3, String bloco4, String bloco5, String bloco6, String bloco7, String bloco8, String bloco9) {

        if (
                !bloco1.equalsIgnoreCase("1") &&
                        !bloco2.equalsIgnoreCase("2") &&
                        !bloco3.equalsIgnoreCase("3") &&
                        !bloco4.equalsIgnoreCase("4") &&
                        !bloco5.equalsIgnoreCase("5") &&
                        !bloco6.equalsIgnoreCase("6") &&
                        !bloco7.equalsIgnoreCase("7") &&
                        !bloco8.equalsIgnoreCase("8") &&
                        !bloco9.equalsIgnoreCase("9")
        ) {
            System.out.println("Deu velha!");
            estado = 2;
        }

    }

    private static void verificarSeTemVencedor(String jogador) {

        if (bloco1 == jogador && bloco2 == jogador && bloco3 == jogador) {
            vencedor(jogador);
        } else if (bloco4 == jogador && bloco5 == jogador && bloco6 == jogador) {
            vencedor(jogador);
        } else if (bloco7 == jogador && bloco8 == jogador && bloco9 == jogador) {
            vencedor(jogador);
        } else if (bloco1 == jogador && bloco4 == jogador && bloco7 == jogador) {
            vencedor(jogador);
        } else if (bloco2 == jogador && bloco5 == jogador && bloco8 == jogador) {
            vencedor(jogador);
        } else if (bloco3 == jogador && bloco6 == jogador && bloco9 == jogador) {
            vencedor(jogador);
        } else if (bloco1 == jogador && bloco5 == jogador && bloco9 == jogador) {
            vencedor(jogador);
        } else if (bloco3 == jogador && bloco8 == jogador && bloco7 == jogador) {
            vencedor(jogador);
        }
    }

    private static void vencedor(String jogador) {

        System.out.println("Vencedor jogador " + jogador);
        estado = 2;

    }

    private static void verificarPosicao(Integer posicao, String jogador) {

        switch (posicao) {
            case 1:
                bloco1 = validarBloco(bloco1, jogador, "1");
                break;
            case 2:
                bloco2 = validarBloco(bloco2, jogador, "2");
                break;
            case 3:
                bloco3 = validarBloco(bloco3, jogador, "3");
                break;
            case 4:
                bloco4 = validarBloco(bloco4, jogador, "4");
                break;
            case 5:
                bloco5 = validarBloco(bloco5, jogador, "5");
                break;
            case 6:
                bloco6 = validarBloco(bloco6, jogador, "6");
                break;
            case 7:
                bloco7 = validarBloco(bloco7, jogador, "7");
                break;
            case 8:
                bloco8 = validarBloco(bloco8, jogador, "8");
                break;
            case 9:
                bloco9 = validarBloco(bloco9, jogador, "9");
                break;
        }

    }

    private static String validarBloco(String bloco, String jogador, String comparador) {
        if (bloco == comparador) {
            return jogador;
        } else {
            throw new RuntimeException("Este bloco ja foi selecionado");
        }
    }

    private static void estadoInicial() {
        System.out.println("Jogo da Velha");
        imprimeTabuleiro(bloco1, bloco2, bloco3, bloco4, bloco5, bloco6, bloco7, bloco8, bloco9);
        estado = 1;
    }

    private static void imprimeTabuleiro(String bloco1, String bloco2, String bloco3, String bloco4, String bloco5, String bloco6, String bloco7, String bloco8, String bloco9) {

        System.out.println(String.format("   1-  2-  3-\n" +
                        "1- %s | %s | %s\n" +
                        "   ---------\n" +
                        "2- %s | %s | %s\n" +
                        "   ---------\n" +
                        "3- %s | %s | %s",
                bloco1, bloco2, bloco3, bloco4, bloco5, bloco6, bloco7, bloco8, bloco9));
    }

    public static int digitePosicao() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {

                int posicao = scanner.nextInt();
                return posicao;
            } catch (Exception erro) {

                System.out.println("Valor Invalido, digite novamente: ");
                scanner.nextLine();
            }


        }
    }
}
