package home_work_6.job;

import home_work_6.api.ISearchEngine;

import java.io.*;

import java.util.concurrent.Callable;

public class SearchJob implements Callable<String> {
    private String whatNeedToSearch;
    private File file;
    private ISearchEngine searchEngine;

    public SearchJob(String whatNeedToSearch, File file, ISearchEngine searchEngine) {
        this.whatNeedToSearch = whatNeedToSearch;
        this.file = file;
        this.searchEngine = searchEngine;
    }

    /**
     * Метод чтения файла и поиска слова в нем переданного слова.
     *
     * @return Возвращает строку вида "имя файла - переданное слово - количество встреч в тексте".
     */
    @Override
    public String call() {
        if (file == null || searchEngine == null) {
            throw new NullPointerException("Null file or searchEngine");
        }
        StringBuilder builder = new StringBuilder();

        try (Reader reader = new InputStreamReader(new FileInputStream(file), "UTF-8")) {
            int read;
            while ((read = reader.read()) != -1) {
                builder.append((char) read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String textAsstring = builder.toString();
        String needToBeSaved = file.getName() + " - " + whatNeedToSearch + " - " +
                searchEngine.search(textAsstring, whatNeedToSearch) + "\n";
        return needToBeSaved;
    }
}
