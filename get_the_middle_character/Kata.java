class Kata {
    public static String getMiddle(String word) {
        int tamanho = word.length();
        int meio = tamanho / 2;

        if (tamanho % 2 == 0) {
            return word.substring(meio - 1, meio + 1);
        } else {
            return word.substring(meio, meio + 1);
        }

    }
}
