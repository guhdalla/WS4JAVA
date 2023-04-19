import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map</*KEY*/String, /*VALUE*/String> map = new HashMap<>();

        map.put("nome", "renan");
        map.put("sobrenome", "lima");
//        System.out.println(map);

//        System.out.println(map.get("sobrenome"));

//        map.remove("sobrenome");
//        System.out.println(map);

        for (String chave : map.keySet() ) {
            System.out.println(chave);
        }

        for (String value : map.values() ) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> entrada : map.entrySet()) {

            String key = entrada.getKey();
            String value = entrada.getValue();
            System.out.println("KEY " + key + " / VALUE " + value );

        }

        map.forEach((chave, valor) -> {
            System.out.println(chave + " = " + valor);
        });

        System.out.println(map.containsKey("nome"));

    }
}
