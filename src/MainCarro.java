import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro("ABC-1234", "Fusca", "Azul", 1970);
        Carro carro2 = new Carro();
        Carro carro3 = new Carro("DEF-5678", "Ferrari", "Vermelha", 2015, 100);

        carro1.setPlaca("ABC-4321");
        String placa = carro1.getPlaca();
        System.out.println(placa);

//        carro1.imprimir();

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Bem vindo a seguradora de carros!");
//
//        System.out.println("Digite a placa do carro: ");
//        String placa = scanner.nextLine();
//
//        System.out.println("Digite o modelo do carro: ");
//        String modelo = scanner.nextLine();
//
//        System.out.println("Digite a cor do carro: ");
//        String cor = scanner.nextLine();
//
//        System.out.println("Digite o ano do carro: ");
//        int ano = scanner.nextInt();
//
//        System.out.println("Digite a velocidade do carro: ");
//        int velocidade = scanner.nextInt();
//
//        Carro carro4 = new Carro(placa, modelo, cor, ano, velocidade);

//        carro4.imprimir();

    }
}