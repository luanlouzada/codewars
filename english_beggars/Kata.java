public class Kata {
    public static int[] beggars(int[] values, int n) {
        if (n == 0) {
            return new int[0]; // Se não há mendigos, retorna um array vazio
        }

        int[] result = new int[n]; // Array para armazenar as somas dos mendigos

        for (int i = 0; i < values.length; i++) {
            int beggarIndex = i % n; // Determina qual mendigo recebe o valor, consigo pegar o módulo e ver se não
                                     // foi cíclico, como pedido.
            result[beggarIndex] += values[i]; // Soma o valor ao mendigo correspondente
        }

        return result;
    }
}
