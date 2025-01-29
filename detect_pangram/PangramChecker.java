import java.util.*;

public class PangramChecker {
    public boolean check(String sentence) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        char[] letrasAlfabeto = alfabeto.toCharArray();
        char[] letrasFrase = sentence.toLowerCase().toCharArray();

        for (char letraAlfabeto : letrasAlfabeto) {
            boolean encontrada = false;

            for (char letraFrase : letrasFrase)
                if (letraAlfabeto == letraFrase) {
                    encontrada = true;
                    break;
                }

            if (!encontrada) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        PangramChecker checker = new PangramChecker();
        boolean result = checker.check(sentence);
        System.out.println("É um pangrama? " + result);
    }
}
