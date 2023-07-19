package home_work_6.utils;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

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
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(text);
        long count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
