import java.util.*;

public class DuplicateEncoder {

    static String encode(String word) {
        StringBuilder listaFinal = new StringBuilder();
        HashMap<Character, Integer> contador = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            contador.put(c, contador.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (contador.get(c) > 1) {
                listaFinal.append(')');
            } else {
                listaFinal.append('(');
            }
        }

        return listaFinal.toString();
    }
}
