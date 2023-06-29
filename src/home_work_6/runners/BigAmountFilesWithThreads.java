package home_work_6.runners;


import home_work_6.job.SearchJob;

import home_work_6.utils.EasySearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BigAmountFilesWithThreads {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите адрес папки, из которой мы будет считывать файлы: ");
        String directoryPath = in.nextLine();

        File dir = new File(directoryPath);
        if (!dir.exists() && !dir.isDirectory()) {
            System.out.println("Неверная директория.");
            return;
        }

        File resultFile = new File("result.txt");

        File[] files = dir.listFiles();
        if (files == null) {
            System.out.println("В директории нет файлов.");
            return;
        }

        do {
            System.out.println("Введите слово для поиска. (для выхода нажмите Enter)");

            String whatNeedToSearch = in.nextLine();
            if (whatNeedToSearch.isEmpty()) {
                break;
            }

            List<Future<String>> futures = new ArrayList<>();
            ExecutorService executor = Executors.newFixedThreadPool(files.length);

            for (File file : files) {
                if (file.getName().endsWith(".txt")) {
                    futures.add(executor.submit(new SearchJob(whatNeedToSearch, file, new EasySearch())));
                }
            }

            StringBuilder resultBuilder = new StringBuilder();
            do {
                List<Future<String>> temp = List.copyOf(futures);
                for (Future<String> future : temp) {
                    if (future.isDone() && !future.isCancelled()) {
                        try {
                            resultBuilder.append(future.get());
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        } catch (ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                        futures.remove(future);
                    }
                }
            } while (!futures.isEmpty());
            executor.shutdownNow();
            writeToFileWithAppend(resultFile, resultBuilder.toString());
            System.out.println("Результат поиска: " + "\n" + resultBuilder);
        } while (true);

        if (resultFile.exists()) {
            System.out.println("Результат выполнения поиска сохранен в: " + resultFile.getAbsolutePath());
        }
    }

    /**
     * Метод записи текста в файл с добавлением к предыдущему записанному тексту.
     * @param file Файл, в который записывается текст.
     * @param text Текст, который необходимо записать.
     */
    private static void writeToFileWithAppend(File file, String text) {
        try (Writer writer = new FileWriter(file, true)) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
