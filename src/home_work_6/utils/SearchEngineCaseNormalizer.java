package home_work_6.utils;

import home_work_6.api.ISearchEngine;

import java.util.*;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private ISearchEngine engine;
    private final static List<String> ENDINGS_SET = List.of("а", "я", "о", "е", "ы", "и", "ов", "ев",
            "ей", "у", "ю", "ам", "ям", "ой", "ою", "ею", "ом", "ем", "ами", "ями", "ах", "ях");
    private final static List<String> VOWELS = List.of("а", "я", "о", "е", "ё", "э", "ы", "и", "у", "ю");

    public SearchEngineCaseNormalizer(ISearchEngine engine) {
        this.engine = engine;
    }

    /**
     * Метод поиска слова с игнорированием падежа.
     *
     * @param text Текст в котором ищем слова.
     * @param word Слово, которое ищем в тексте.
     * @return Возвращает количество встреч слова в тексте.
     */
    @Override
    public long search(String text, String word) {
        String rootWord;
        long count = 0;

        if (ifVowelsEnding(word)) {
            rootWord = cuttingOfWord(word);
        } else {
            rootWord = word;
        }

        for (int i = 0; i < ENDINGS_SET.size(); i++) {
            String wordWithDifferentEndings = rootWord + ENDINGS_SET.get(i);
            count += engine.search(text, wordWithDifferentEndings);
        }
        return count;
    }

    /**
     * Метод проверки на необходимость выделения корня слова.
     *
     * @param word Слово, принятое к поиску.
     * @return Возвращает false - если слово оканчивается на согласную.
     * Возвращает true - если слово оканчивается на гласную.
     */
    private boolean ifVowelsEnding(String word) {
        for (String vowel : VOWELS) {
            if (word.endsWith(vowel)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод выделения корня слова.
     *
     * @param word Слово, принятое к поиску.
     * @return Возвращает корень слова.
     */
    private String cuttingOfWord(String word) {
        String cutWord = null;
        for (String ending : ENDINGS_SET) {
            if (word.endsWith(ending)) {
                int endingIndex = word.lastIndexOf(ending);
                cutWord = word.substring(0, endingIndex);
                break;
            }
        }
        return cutWord;
    }
}
