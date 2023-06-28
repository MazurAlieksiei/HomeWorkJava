package home_work_6.utils;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine engine;

    public SearchEnginePunctuationNormalizer(ISearchEngine engine) {
        this.engine = engine;
    }

    /**
     * Метод определения количества раз встречи слова в тексте, с предварительным удалением нежелательных символов.
     *
     * @param text Текст в котором ищем слова.
     * @param word Слово, которое ищем в тексте.
     * @return Возвращает количество раз которое встречается слово в тексте.
     */
    @Override
    public long search(String text, String word) {
        String formattedText = text.replaceAll("\\s*(|,|;|!|\"|:|\\?|\\*|\\)|\\(|--|\\.|=|\n" +
                ")\\s*", "");
        return engine.search(formattedText, word);
    }
}
