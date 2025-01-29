import java.util.ArrayList;
import java.util.HashMap;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        ArrayList<Integer> listaFinal = new ArrayList<Integer>();
        HashMap<Integer, Integer> contador = new HashMap<>();
        for (int element : elements) {
            contador.put(element, contador.getOrDefault(element, 0) + 1);
            // Ei quantas vezes esse número já apareceu ? se for 0 eu somo + 1
            if (contador.get(element) <= maxOccurrences) {
                // Se a quantidade for menor ou igual ao máximo permitido (maxOccurrences),eu
                // coloco o número na lista final.
                // Se já tiver passado do máximo, eu ignoro esse número.
                listaFinal.add(element);
            }
        }
        return listaFinal.stream().mapToInt(Integer::valueOf).toArray();
    }
}
