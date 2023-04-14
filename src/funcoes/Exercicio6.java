package funcoes;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio6 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua data de nascimento ( dia/mes/ano ):");
        String data = scanner.next();

        try {
            Long qtdDias = calcularDias(dataStringToCalendar(data));
            System.out.println(String.format("Voce tem %s dias", qtdDias));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static Long calcularDias(LocalDate data) {
        return ChronoUnit.DAYS.between(data, LocalDate.now());
    }

    private static LocalDate dataStringToCalendar(String data) throws Exception {
        try {
            String[] dataRecortada = data.split("/");

            LocalDate localDate = LocalDate.of(
                    Integer.parseInt(dataRecortada[2]),
                    Month.of(Integer.parseInt(dataRecortada[1])),
                    Integer.parseInt(dataRecortada[0])
            );

            return localDate;
        } catch (Exception e) {
            throw new Exception("Data Invalida");
        }
    }

}
