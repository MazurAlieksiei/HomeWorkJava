package home_work_6.utils;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngineNoRegister implements ISearchEngine {

    private ISearchEngine engine;

    public SearchEngineNoRegister(ISearchEngine engine) {
        this.engine = engine;
    }


    /**
     * Метод определения количества раз встречи слова в тексте с игнорированием регистра.
     *
     * @param text Текст в котором ищем слова.
     * @param word Слово, которое ищем в тексте.
     * @return Возвращает количество раз которое встречается слово в тексте.
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
        if (engine instanceof EasySearch) {
            String modifiedText = text.toLowerCase();
            String modifiedWord = word.toLowerCase();
            return engine.search(modifiedText, modifiedWord);
        } else if (engine instanceof RegExSearch) {
            Pattern pattern = Pattern.compile("(?u)\\b" + word + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }
}
