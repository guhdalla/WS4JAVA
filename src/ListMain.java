import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        /* Nao Usar, prefire utilizar o ArrayList como a lista2 */ List<Integer> lista1;
        List<Integer> lista2 = new ArrayList<>();
        List<Integer> lista3 = Arrays.asList(5, 3, 2, 4, 1);
        List<Integer> lista4 = new ArrayList<>();


//        System.out.println(lista1.toString());
//        System.out.println(lista2.toString());
//        System.out.println(lista3.toString());

        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);


        removerValorDaLista(lista2, 2);
        consultarTodosValoresDaLista(lista2);

    }

    private static void removerValorDaLista(List<Integer> lista, int index) {
        lista.remove(index);
    }

    private static void adicionarTodosNaLista(List<Integer> lista2, List<Integer> lista3) {
        lista2.addAll(lista3);
    }

    private static void limparLista(List<Integer> lista) {
        lista.clear();
    }

    private static void ondenarLista(List<Integer> lista) {
//        Collections.sort(lista);
        lista.sort(Comparator.reverseOrder());
    }

    private static void adicionarValorNaLista(List<Integer> lista, int value) {
        if (lista.add(value)) {
            System.out.println("Item Adicionado");
        } else {
            System.out.println("Item Nao Adicionado");
        }
    }

    private static void consultarUmValorDaLista(List<Integer> lista, int index) {
        System.out.println(lista.get(index));
    }

    private static void consultarTodosValoresDaLista(List<Integer> lista) {
        for (/* Tipo dado da lista */ Integer num : /* Lista */ lista) {
            System.out.println(num);
        }
    }




}
