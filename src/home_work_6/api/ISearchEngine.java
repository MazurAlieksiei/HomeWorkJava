package home_work_6.api;

public interface ISearchEngine {

    /**
     * Метод нахождения количества раз встречи в тексте слова.
     *
     * @param text Текст в котором ищем слова.
     * @param word Слово, которое ищем в тексте.
     * @return Возвращает количество раз которое встречается слово в тексте.
     */
    long search(String text, String word);
}
