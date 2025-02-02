public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        }

        String[] words = phrase.split(" ");
        StringBuilder jadenCasedPhrase = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                jadenCasedPhrase.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        return jadenCasedPhrase.toString().trim();
    }

}
