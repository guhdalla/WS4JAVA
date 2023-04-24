import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JogoDeAdivinharPalavra {

    static Integer estado = 0;
    static Scanner scanner = new Scanner(System.in);
    static List<String> palavras = new ArrayList<>();

    public static void main(String[] args) {
        palavrasIniciais();
        estadoInicial();
    }

    private static void palavrasIniciais() {
        palavras.addAll(Arrays.asList("Azulejo", "Bola", "Cachorro", "Dado", "Elefante", "Faca", "Gato", "Helicoptero", "Igreja", "Janela", "Kanguru", "Lapis", "Mesa", "Nariz", "Oculos", "Pato", "Queijo", "Rato", "Sapato", "Tigre", "Uva", "Vaso", "Xicara", "Yoga", "Zebra"));
    }

    private static void estadoInicial() {

        while (estado != -1) {

            switch (estado) {
                case 0:
                    menu();
                    break;
                case 1:
                    estadoPalavras();
                    break;
                case 2:
                    jogar();
                    estado = 0;
                    break;
                case 3:
                    estado = -1;
                    break;
                default:
                    System.out.println("Opcao invalida");
                    estado = 0;
                    break;
            }
        }
    }

    private static void jogar() {

        String palavra = palavras.get((int) (Math.random() * palavras.size()));
        String palavraEmbaralhada = embaralharPalavra(palavra);
        String palavraDigitada = "";
        Integer tentativas = 0;

        while (!palavraDigitada.equals(palavra) && tentativas < 3) {

            System.out.println("A palavra embaralhada é: " + palavraEmbaralhada);
            System.out.println("Digite a palavra: ");
            palavraDigitada = digiteString();

            if (palavraDigitada.equals(palavra)) {
                System.out.println("Parabens, voce acertou!");
            } else {
                System.out.println("Voce errou, tente novamente");
                tentativas++;
            }
        }

        if (tentativas == 3) {
            System.out.println("Voce perdeu, a palavra era: " + palavra);
        }
    }

    private static String embaralharPalavra(String palavra) {

        String palavraEmbaralhada = "";

        while (palavra.length() > 0) {
            int index = (int) (Math.random() * palavra.length());
            palavraEmbaralhada += palavra.charAt(index);
            palavra = palavra.substring(0, index) + palavra.substring(index + 1);
        }

        return palavraEmbaralhada;
    }

    private static void estadoPalavras() {

        Integer estadoPalavra = 0;

        while (estadoPalavra != -1) {

            switch (estadoPalavra) {
                case 0:
                    estadoPalavra = menuPalavras();
                    break;
                case 1:
                    adicionarPalavra();
                    estadoPalavra = 0;
                    break;
                case 2:
                    removerPalavra();
                    estadoPalavra = 0;
                    break;
                case 3:
                    visualizarPalavras();
                    estadoPalavra = 0;
                    break;
                case 4:
                    estadoPalavra = -1;
                    estado = 0;
                    break;
                default:
                    System.out.println("Opcao invalida");
                    estadoPalavra = 0;
                    break;
            }
        }
    }

    private static void visualizarPalavras() {

        System.out.println("Palavras: ");
        for (String palavra : palavras) {
            System.out.print(palavra + ", ");
        }
        System.out.println();
    }

    private static void removerPalavra() {

        System.out.println("Digite a palavra que deseja remover: ");
        palavras.remove(digiteString());
    }

    private static void adicionarPalavra() {

        System.out.println("Digite a palavra que deseja adicionar: ");
        palavras.add(digiteString());
    }

    private static String digiteString() {

        while (true) {

            try {

                return scanner.next();
            } catch (Exception erro) {

                System.out.println("Valor Invalido, digite novamente: ");
                scanner.nextLine();
            }
        }
    }

    private static Integer menuPalavras() {

        System.out.println("Menu Palavras");
        System.out.println("1 - Adicionar Palavra");
        System.out.println("2 - Remover Palavra");
        System.out.println("3 - Visualizar Palavras");
        System.out.println("4 - Voltar");

        return digiteInteger();
    }

    private static void menu() {

        System.out.println("Menu");
        System.out.println("1 - Palavras");
        System.out.println("2 - Jogar");
        System.out.println("3 - Sair");

        estado = digiteInteger();
    }

    public static Integer digiteInteger() {

        while (true) {

            try {

                return scanner.nextInt();
            } catch (Exception erro) {

                System.out.println("Valor Invalido, digite novamente: ");
                scanner.nextLine();
            }
        }
    }
}