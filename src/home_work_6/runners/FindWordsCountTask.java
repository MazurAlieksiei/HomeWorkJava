package home_work_6.runners;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;
import home_work_6.utils.RegExSearch;
import home_work_6.utils.SearchEngineCaseNormalizer;
import home_work_6.utils.SearchEngineNoRegister;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FindWordsCountTask {
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

        ISearchEngine engine1 = new EasySearch();
        ISearchEngine engine2 = new RegExSearch();
        ISearchEngine engine3 = new SearchEngineNoRegister(new RegExSearch());
        ISearchEngine engine4 = new SearchEngineCaseNormalizer(new EasySearch());

        System.out.println("Используем EasySearch.");
        System.out.println("Слово \"война\" в тексте встречается: " + engine1.search(textAsstring, "война"));
        System.out.println("Союз \"и\" в тексте встречается: " + engine1.search(textAsstring, "и"));
        System.out.println("Слово \"мир\" в тексте встречается: " + engine1.search(textAsstring, "мир"));
        System.out.println("__________________________________");
        System.out.println("Используем RegExSearch.");
        System.out.println("Слово \"война\" в тексте встречается: " + engine2.search(textAsstring, "война"));
        System.out.println("Союз \"и\" в тексте встречается: " + engine2.search(textAsstring, "и"));
        System.out.println("Слово \"мир\" в тексте встречается: " + engine3.search(textAsstring, "мир"));
        System.out.println("__________________________________");
        System.out.println("Используем SearchEngineNoRegister.");
        System.out.println("Слово \"война\" в тексте встречается: " + engine3.search(textAsstring, "война"));
        System.out.println("Союз \"и\" в тексте встречается: " + engine3.search(textAsstring, "и"));
        System.out.println("Слово \"мир\" в тексте встречается: " + engine3.search(textAsstring, "мир"));
        System.out.println("__________________________________");
        System.out.println("Используем SearchEngineCaseNormalizer.");
        System.out.println("Слово \"война\" в тексте встречается: " + engine4.search(textAsstring, "война"));
        System.out.println("Союз \"и\" в тексте встречается: " + engine4.search(textAsstring, "и"));
        System.out.println("Слово \"мир\" в тексте встречается: " + engine4.search(textAsstring, "мир"));
    }
}
