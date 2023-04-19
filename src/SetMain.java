import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {

        Set<Integer> lista = new HashSet<>();

        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(2);

        System.out.println(lista);

        List<Integer> lista1 = new ArrayList<>();

        lista1.add(1);
        lista1.add(1);
        lista1.add(1);
        lista1.add(1);
        lista1.add(2);

        System.out.println(lista1);

        System.out.println(lista1.contains(3));
    }

}
