package home_work_6;

public class EasySearch implements ISearchEngine {

    /**
     * Метод определения количества раз встречи слова в тексте.
     *
     * @param text Текст в котором ищем слова.
     * @param word Слово, которое ищем в тексте.
     * @return Возвращает количество раз которое встречается слово в тексте.
     */
    @Override
    public long search(String text, String word) {
        if (text == null || word == null || word.isEmpty() || text.isEmpty()) {
            return 0;
        }
        long count = 0;
        int wordStartIndex = text.indexOf(word);

        while (wordStartIndex != -1) {
            int wordL = word.length();
            int endOfStringMarker = text.length() - wordStartIndex;
            int space = text.indexOf(" ", wordStartIndex + 1) - wordStartIndex;
            int comma = text.indexOf(",", wordStartIndex + 1) - wordStartIndex;
            int questionMark = text.indexOf("?", wordStartIndex + 1) - wordStartIndex;
            int dot = text.indexOf(".", wordStartIndex + 1) - wordStartIndex;
            int quotationMarks = text.indexOf("\"", wordStartIndex + 1) - wordStartIndex;
            int exclamationPoint = text.indexOf("!", wordStartIndex + 1) - wordStartIndex;
            int colon = text.indexOf(":", wordStartIndex + 1) - wordStartIndex;
            int semicolon = text.indexOf(";", wordStartIndex + 1) - wordStartIndex;
            int underscore = text.indexOf("_", wordStartIndex + 1) - wordStartIndex;

            if ((wordL == space) || (wordL == comma) || (wordL == questionMark) || (wordL == dot) ||
                    (wordL == quotationMarks) || (wordL == exclamationPoint) || (wordL == colon) ||
                    (wordL == semicolon) || (wordL == endOfStringMarker) || (wordL == underscore)) {
                count++;
            }
            int tmp1 = text.indexOf(word, wordStartIndex + 1);
            wordStartIndex = tmp1;
        }
        return count;
    }
}
