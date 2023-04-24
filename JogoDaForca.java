import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JogoDaForca {

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

        String palavra = palavras.get((int) (Math.random() * palavras.size())).toUpperCase();

        List<String> letras = new ArrayList<>();

        for (int i = 0; i < palavra.length(); i++) {
            letras.add("_");
        }


        int tentativas = 0;
        int acertos = 0;

        while (tentativas < 6 && acertos < palavra.length()) {

            System.out.println("Digite uma letra: ");
            String letra = digiteString().toUpperCase();

            if (palavra.contains(letra) && letra.length() == 1 && !letras.contains(letra)) {

                for (int i = 0; i < palavra.length(); i++) {

                    if (palavra.charAt(i) == letra.charAt(0)) {
                        letras.set(i, letra);
                        acertos++;
                    }
                }
            } else {

                if (!palavra.contains(letra) && letra.length() == 1 && !letras.contains(letra)) {

                    tentativas++;
                    System.out.println("Letra incorreta! Tentativas: " + tentativas + "/6");

                } else {

                    System.out.println("Letra ja digitada!");
                }
            }
            System.out.println(letras);
        }

        if (tentativas == 6) {
            System.out.println("Voce perdeu!");
        } else {
            System.out.println("Voce ganhou!");
        }
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