package home_work_6.runners;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WarAndPeace {
    public static void main(String[] args) {
        File file = new File("Война и мир_книга.txt");
        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int read;
            while ((read = reader.read()) != -1) {
                builder.append((char) read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String textAsstring = builder.toString();
        textAsstring.replaceAll("\n", " ");
        String[] words = textAsstring.split("\\s*(\\s|,|;|!|\"|:|\\?|\\*|\\)|\\(|--|\\.|=)\\s*");
        List<String> wordsAsList = new ArrayList<>(Arrays.asList(words));
        while (true) {
            if (!wordsAsList.removeIf(item -> item == null || "".equals(item))) {
                break;
            }
        }

        System.out.println("Всего слов: " + wordsAsList.size());


        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < wordsAsList.size(); i++) {
            Integer frequency = map.get(wordsAsList.get(i));
            map.put(wordsAsList.get(i), frequency == null ? 1 : frequency + 1);
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Scanner in = new Scanner(System.in);
        System.out.println("Вывод топа N слов, чаще всего встречающихся в тексте. Задайте N.  ");
        int valueOfN = 0;
        while (true) {
            valueOfN = in.nextInt();
            if (valueOfN < sortedList.size()) {
                break;
            }
            System.out.println("Введенное число больше количества слов! Повторите ввод.");
        }

        for (int i = 0; i < valueOfN; i++) {
            Map.Entry<String, Integer> data = sortedList.get(i);
            System.out.println(data.getKey() + " - " + data.getValue() + " раз");
        }

        ISearchEngine search = new EasySearch();
        System.out.println("Слово \"война\" в тексте встречается: " + search.search(textAsstring, "война"));
        System.out.println("Союз \"и\" в тексте встречается: " + search.search(textAsstring, "и"));
        System.out.println("Слово \"мир\" в тексте встречается: " + search.search(textAsstring, "мир"));
    }
}
